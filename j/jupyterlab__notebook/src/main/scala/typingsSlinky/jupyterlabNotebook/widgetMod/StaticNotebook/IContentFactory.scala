package typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook

import typingsSlinky.jupyterlabCells.headerfooterMod.ICellFooter
import typingsSlinky.jupyterlabCells.headerfooterMod.ICellHeader
import typingsSlinky.jupyterlabCells.inputareaMod.IInputPrompt
import typingsSlinky.jupyterlabCells.mod.CodeCell
import typingsSlinky.jupyterlabCells.mod.MarkdownCell
import typingsSlinky.jupyterlabCells.mod.RawCell
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsSlinky.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating notebook content.
  *
  * #### Notes
  * This extends the content factory of the cell itself, which extends the content
  * factory of the output area and input area. The result is that there is a single
  * factory for creating all child content of a notebook.
  */
trait IContentFactory
  extends typingsSlinky.jupyterlabCells.widgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(
    options: typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions,
    parent: typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook
  ): CodeCell
  /**
    * Create a new markdown cell widget.
    */
  def createMarkdownCell(
    options: typingsSlinky.jupyterlabCells.widgetMod.MarkdownCell.IOptions,
    parent: typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook
  ): MarkdownCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(
    options: typingsSlinky.jupyterlabCells.widgetMod.RawCell.IOptions,
    parent: typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook
  ): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: (typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions, typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook) => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createMarkdownCell: (typingsSlinky.jupyterlabCells.widgetMod.MarkdownCell.IOptions, typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook) => MarkdownCell,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: (typingsSlinky.jupyterlabCells.widgetMod.RawCell.IOptions, typingsSlinky.jupyterlabNotebook.widgetMod.StaticNotebook) => RawCell,
    createStdin: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction2(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createMarkdownCell = js.Any.fromFunction2(createMarkdownCell), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction2(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IContentFactory]
  }
}

