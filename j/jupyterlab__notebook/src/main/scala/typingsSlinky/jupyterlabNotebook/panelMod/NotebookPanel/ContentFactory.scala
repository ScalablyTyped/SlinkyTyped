package typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel

import typingsSlinky.jupyterlabCells.headerfooterMod.ICellFooter
import typingsSlinky.jupyterlabCells.headerfooterMod.ICellHeader
import typingsSlinky.jupyterlabCells.inputareaMod.IInputPrompt
import typingsSlinky.jupyterlabCells.mod.CodeCell
import typingsSlinky.jupyterlabCells.mod.MarkdownCell
import typingsSlinky.jupyterlabCells.mod.RawCell
import typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook
import typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook
import typingsSlinky.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsSlinky.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory
     with IContentFactory {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* InferMemberOverrides */
  override val editorFactory: Factory = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellFooter(): ICellFooter = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellHeader(): ICellHeader = js.native
  /**
    * Create a new code cell widget.
    */
  /* CompleteClass */
  override def createCodeCell(options: IOptions, parent: StaticNotebook): CodeCell = js.native
  /**
    * Create an input prompt.
    */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create a new markdown cell widget.
    */
  /* CompleteClass */
  override def createMarkdownCell(options: typingsSlinky.jupyterlabCells.widgetMod.MarkdownCell.IOptions, parent: StaticNotebook): MarkdownCell = js.native
  /**
    * Create a new content area for the panel.
    */
  /* CompleteClass */
  override def createNotebook(options: typingsSlinky.jupyterlabNotebook.widgetMod.Notebook.IOptions): Notebook = js.native
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create a new raw cell widget.
    */
  /* CompleteClass */
  override def createRawCell(options: typingsSlinky.jupyterlabCells.widgetMod.RawCell.IOptions, parent: StaticNotebook): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}

