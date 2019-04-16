package com.selonjoran.widgetapps;

import android.icu.util.LocaleData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    EditText edtTitle, edtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paper.init(this);

        btnSave = findViewById(R.id.btn_save);
        edtTitle = findViewById(R.id.edt_title);
        edtContent = findViewById(R.id.edt_content);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paper.book().write("title",edtTitle.getText().toString());
                Paper.book().write("content",edtContent.getText().toString());

                Toast.makeText(MainActivity.this, "Tersimpan!",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
