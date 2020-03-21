package typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole

import typingsSlinky.jupyterlabCells.modelMod.ICodeCellModel
import typingsSlinky.jupyterlabCells.modelMod.IRawCellModel
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
  val codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel
}

object IModelFactory {
  @scala.inline
  def apply(
    codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
    createCodeCell: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel,
    createRawCell: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel
  ): IModelFactory = {
    val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCodeCell = js.Any.fromFunction1(createCodeCell), createRawCell = js.Any.fromFunction1(createRawCell))
  
    __obj.asInstanceOf[IModelFactory]
  }
}

