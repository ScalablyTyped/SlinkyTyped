package typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole

import typingsSlinky.jupyterlabCells.headerfooterMod.ICellFooter
import typingsSlinky.jupyterlabCells.headerfooterMod.ICellHeader
import typingsSlinky.jupyterlabCells.inputareaMod.IInputPrompt
import typingsSlinky.jupyterlabCells.mod.CodeCell
import typingsSlinky.jupyterlabCells.mod.RawCell
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsSlinky.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory for console children.
  */
trait IContentFactory
  extends typingsSlinky.jupyterlabCells.widgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(options: typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(options: typingsSlinky.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: typingsSlinky.jupyterlabCells.widgetMod.RawCell.IOptions => RawCell,
    createStdin: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction1(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction1(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

