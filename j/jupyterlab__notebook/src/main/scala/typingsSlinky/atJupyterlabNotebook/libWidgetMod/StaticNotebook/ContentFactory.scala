package typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook

import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.MarkdownCell
import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typingsSlinky.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typingsSlinky.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typingsSlinky.atJupyterlabCells.libInputareaMod.IInputPrompt
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
class ContentFactory ()
  extends typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.Cell.ContentFactory
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
  override def createCodeCell(
    options: typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell.IOptions,
    parent: typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): CodeCell = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create a new markdown cell widget.
    */
  /* CompleteClass */
  override def createMarkdownCell(
    options: typingsSlinky.atJupyterlabCells.libWidgetMod.MarkdownCell.IOptions,
    parent: typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): MarkdownCell = js.native
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
  override def createRawCell(
    options: typingsSlinky.atJupyterlabCells.libWidgetMod.RawCell.IOptions,
    parent: typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
}

/**
  * A namespace for the staic notebook content factory.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the content factory.
    */
  type IOptions = typingsSlinky.atJupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions
}

