package typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole

import typingsSlinky.jupyterlabCells.modelMod.ICodeCellModel
import typingsSlinky.jupyterlabCells.modelMod.IRawCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model factory for a console widget.
  */
@js.native
trait IModelFactory extends js.Object {
  /**
    * The factory for code cell content.
    */
  val codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
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
  @scala.inline
  implicit class IModelFactoryOps[Self <: IModelFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeCellContentFactory(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCellContentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCodeCell(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCodeCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateRawCell(value: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRawCell")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

