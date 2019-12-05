package typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole

import typingsSlinky.atJupyterlabCells.libModelMod.ICodeCellModel
import typingsSlinky.atJupyterlabCells.libModelMod.IRawCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model factory for a console widget.
  */
trait IModelFactory extends js.Object {
  /**
    * The factory for code cell content.
    */
  val codeCellContentFactory: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IOptions): ICodeCellModel
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions): IRawCellModel
}

object IModelFactory {
  @scala.inline
  def apply(
    codeCellContentFactory: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory,
    createCodeCell: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IOptions => ICodeCellModel,
    createRawCell: typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions => IRawCellModel
  ): IModelFactory = {
    val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCodeCell = js.Any.fromFunction1(createCodeCell), createRawCell = js.Any.fromFunction1(createRawCell))
  
    __obj.asInstanceOf[IModelFactory]
  }
}

