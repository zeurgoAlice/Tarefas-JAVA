import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarConcluida() {
        concluida = true;
    }

    @Override
    public String toString() {
        return titulo + " - " + (concluida ? "Concluída" : "Pendente");
    }
}