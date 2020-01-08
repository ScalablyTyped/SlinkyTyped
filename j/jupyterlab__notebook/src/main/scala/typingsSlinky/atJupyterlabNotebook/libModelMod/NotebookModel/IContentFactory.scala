package typingsSlinky.atJupyterlabNotebook.libModelMod.NotebookModel

import typingsSlinky.atJupyterlabCells.libModelMod.ICellModel
import typingsSlinky.atJupyterlabCells.libModelMod.ICodeCellModel
import typingsSlinky.atJupyterlabCells.libModelMod.IMarkdownCellModel
import typingsSlinky.atJupyterlabCells.libModelMod.IRawCellModel
import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typingsSlinky.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating notebook model content.
  */
trait IContentFactory extends js.Object {
  /**
    * The factory for output area models.
    */
  val codeCellContentFactory: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory
  /**
    * The IModelDB in which to put data for the notebook model.
    */
  var modelDB: IModelDB
  /**
    * Clone the content factory with a new IModelDB.
    */
  def clone(modelDB: IModelDB): IContentFactory
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
  def createCell(`type`: CellType, opts: typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions): ICellModel
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
    * Create a new markdown cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new markdown cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createMarkdownCell(options: typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions): IMarkdownCellModel
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

object IContentFactory {
  @scala.inline
  def apply(
    clone: IModelDB => IContentFactory,
    codeCellContentFactory: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory,
    createCell: (CellType, typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions) => ICellModel,
    createCodeCell: typingsSlinky.atJupyterlabCells.libModelMod.CodeCellModel.IOptions => ICodeCellModel,
    createMarkdownCell: typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions => IMarkdownCellModel,
    createRawCell: typingsSlinky.atJupyterlabCells.libModelMod.CellModel.IOptions => IRawCellModel,
    modelDB: IModelDB
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCell = js.Any.fromFunction2(createCell), createCodeCell = js.Any.fromFunction1(createCodeCell), createMarkdownCell = js.Any.fromFunction1(createMarkdownCell), createRawCell = js.Any.fromFunction1(createRawCell), modelDB = modelDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IContentFactory]
  }
}

