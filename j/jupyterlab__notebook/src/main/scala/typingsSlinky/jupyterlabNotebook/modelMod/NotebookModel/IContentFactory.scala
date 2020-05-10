package typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel

import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import typingsSlinky.jupyterlabCells.modelMod.ICodeCellModel
import typingsSlinky.jupyterlabCells.modelMod.IMarkdownCellModel
import typingsSlinky.jupyterlabCells.modelMod.IRawCellModel
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating notebook model content.
  */
@js.native
trait IContentFactory extends js.Object {
  /**
    * The factory for output area models.
    */
  val codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
  /**
    * The IModelDB in which to put data for the notebook model.
    */
  var modelDB: IModelDB = js.native
  /**
    * Clone the content factory with a new IModelDB.
    */
  def clone(modelDB: IModelDB): IContentFactory = js.native
  /**
    * Create a new cell by cell type.
    *
    * @param type:  the type of the cell to create.
    *
    * @param options: the cell creation options.
    *
    * #### Notes
    * This method is intended to be a convenience method to programmaticaly
    * call the other cell creation methods in the factory.
    */
  def createCell(`type`: CellType, opts: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): ICellModel = js.native
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
    * Create a new markdown cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new markdown cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createMarkdownCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IMarkdownCellModel = js.native
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

object IContentFactory {
  @scala.inline
  def apply(
    clone: IModelDB => IContentFactory,
    codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
    createCell: (CellType, typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) => ICellModel,
    createCodeCell: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel,
    createMarkdownCell: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IMarkdownCellModel,
    createRawCell: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel,
    modelDB: IModelDB
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCell = js.Any.fromFunction2(createCell), createCodeCell = js.Any.fromFunction1(createCodeCell), createMarkdownCell = js.Any.fromFunction1(createMarkdownCell), createRawCell = js.Any.fromFunction1(createRawCell), modelDB = modelDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentFactory]
  }
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: IModelDB => IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCodeCellContentFactory(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeCellContentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCell(value: (CellType, typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) => ICellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateCodeCell(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCodeCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateMarkdownCell(value: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IMarkdownCellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMarkdownCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateRawCell(value: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRawCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModelDB(value: IModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

