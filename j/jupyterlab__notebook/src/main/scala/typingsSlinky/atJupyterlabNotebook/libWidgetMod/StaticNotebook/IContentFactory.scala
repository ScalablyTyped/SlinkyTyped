package typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook

import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.MarkdownCell
import typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typingsSlinky.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typingsSlinky.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typingsSlinky.atJupyterlabCells.libInputareaMod.IInputPrompt
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IStdin
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
  extends typingsSlinky.atJupyterlabCells.libWidgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(
    options: typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell.IOptions,
    parent: typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): CodeCell
  /**
    * Create a new markdown cell widget.
    */
  def createMarkdownCell(
    options: typingsSlinky.atJupyterlabCells.libWidgetMod.MarkdownCell.IOptions,
    parent: typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): MarkdownCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(
    options: typingsSlinky.atJupyterlabCells.libWidgetMod.RawCell.IOptions,
    parent: typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: (typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell.IOptions, typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook) => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createMarkdownCell: (typingsSlinky.atJupyterlabCells.libWidgetMod.MarkdownCell.IOptions, typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook) => MarkdownCell,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: (typingsSlinky.atJupyterlabCells.libWidgetMod.RawCell.IOptions, typingsSlinky.atJupyterlabNotebook.libWidgetMod.StaticNotebook) => RawCell,
    createStdin: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction2(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createMarkdownCell = js.Any.fromFunction2(createMarkdownCell), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction2(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

