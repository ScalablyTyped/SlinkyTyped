package typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole

import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
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
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ContentFactory")
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
  override def createCodeCell(options: typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell.IOptions): CodeCell = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
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
  override def createRawCell(options: typingsSlinky.atJupyterlabCells.libWidgetMod.RawCell.IOptions): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
}

/**
  * A namespace for the code console content factory.
  */
@JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * An initialize options for `ContentFactory`.
    */
  type IOptions = typingsSlinky.atJupyterlabCells.libWidgetMod.Cell.IContentFactory
}

