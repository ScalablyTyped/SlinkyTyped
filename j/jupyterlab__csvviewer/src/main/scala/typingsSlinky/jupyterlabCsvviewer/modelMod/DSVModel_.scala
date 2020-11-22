package typingsSlinky.jupyterlabCsvviewer.modelMod

import typingsSlinky.jupyterlabCsvviewer.modelMod.DSVModel.IOptions
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.ChangedArgs
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.ColumnRegion
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.Metadata
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.RowRegion
import typingsSlinky.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/csvviewer/lib/model", "DSVModel")
@js.native
class DSVModel_ protected ()
  extends DataModel
     with IDisposable {
  /**
    * Create a data model with static CSV data.
    *
    * @param options - The options for initializing the data model.
    */
  def this(options: IOptions) = this()
  
  var _columnCount: js.Any = js.native
  
  /**
    * The column offset cache, starting with row _columnOffsetsStartingRow
    *
    * #### Notes
    * The index of the first character in the data string for row r, column c is
    * _columnOffsets[(r-this._columnOffsetsStartingRow)*numColumns+c]
    */
  var _columnOffsets: js.Any = js.native
  
  /**
    * The row that _columnOffsets[0] represents.
    */
  var _columnOffsetsStartingRow: js.Any = js.native
  
  /**
    * Compute the row offsets and initialize the column offset cache.
    *
    * @param endRow - The last row to parse, from the start of the data (first
    * row is row 1).
    *
    * #### Notes
    * This method supports parsing the data incrementally by calling it with
    * incrementally higher endRow. Rows that have already been parsed will not be
    * parsed again.
    */
  var _computeRowOffsets: js.Any = js.native
  
  var _data: js.Any = js.native
  
  var _delayedParse: js.Any = js.native
  
  var _delimiter: js.Any = js.native
  
  var _doneParsing: js.Any = js.native
  
  /**
    * Get the parsed string field for a row and column.
    *
    * @param row - The row number of the data item.
    * @param column - The column number of the data item.
    * @returns The parsed string for the data item.
    */
  var _getField: js.Any = js.native
  
  /**
    * Get the index in the data string for the first character of a row and
    * column.
    *
    * @param row - The row of the data item.
    * @param column - The column of the data item.
    * @returns - The index into the data string where the data item starts.
    */
  var _getOffsetIndex: js.Any = js.native
  
  /**
    * The header strings.
    */
  var _header: js.Any = js.native
  
  /**
    * The number of rows to parse initially before doing a delayed parse of the
    * entire data.
    */
  var _initialRows: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * The maximum number of rows to parse when there is a cache miss.
    */
  var _maxCacheGet: js.Any = js.native
  
  /**
    * Parse the data string asynchronously.
    *
    * #### Notes
    * It can take several seconds to parse a several hundred megabyte string, so
    * we parse the first 500 rows to get something up on the screen, then we
    * parse the full data string asynchronously.
    */
  var _parseAsync: js.Any = js.native
  
  var _parser: js.Any = js.native
  
  var _quote: js.Any = js.native
  
  var _quoteEscaped: js.Any = js.native
  
  var _ready: js.Any = js.native
  
  /**
    * Reset the parser state.
    */
  var _resetParser: js.Any = js.native
  
  var _rowCount: js.Any = js.native
  
  var _rowDelimiter: js.Any = js.native
  
  /**
    * The index for the start of each row.
    */
  var _rowOffsets: js.Any = js.native
  
  var _startedParsing: js.Any = js.native
  
  /**
    * Get the column count for a region in the data model.
    *
    * @param region - The column region of interest.
    *
    * @returns - The column count for the region.
    *
    * #### Notes
    * This method is called often, and so should be efficient.
    */
  /* InferMemberOverrides */
  override def columnCount(region: ColumnRegion): Double = js.native
  
  /**
    * Get the data value for a cell in the data model.
    *
    * @param region - The cell region of interest.
    *
    * @param row - The row index of the cell of interest.
    *
    * @param column - The column index of the cell of interest.
    *
    * @returns The data value for the specified cell.
    *
    * #### Notes
    * The returned data should be treated as immutable.
    *
    * This method is called often, and so should be efficient.
    */
  /* InferMemberOverrides */
  override def data(region: CellRegion, row: Double, column: Double): js.Any = js.native
  
  /**
    * Emit the `changed` signal for the data model.
    *
    * #### Notes
    * Subclasses should call this method whenever the data model has
    * changed so that attached data grids can update themselves.
    */
  /* InferMemberOverrides */
  /* protected */ override def emitChanged(args: ChangedArgs): Unit = js.native
  
  /**
    * Whether this model has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MDSVModel_ : Boolean = js.native
  
  /**
    * Get the metadata for a cell in the data model.
    *
    * @param region - The cell region of interest.
    *
    * @param row - The row index of the cell of interest.
    *
    * @param column - The column index of the cell of interest.
    *
    * @returns The metadata for the specified cell.
    *
    * #### Notes
    * The returned metadata should be treated as immutable.
    *
    * This method is called often, and so should be efficient.
    *
    * The default implementation returns `{}`.
    */
  /* InferMemberOverrides */
  override def metadata(region: CellRegion, row: Double, column: Double): Metadata = js.native
  
  /**
    * A promise that resolves when the model has parsed all of its data.
    */
  def ready: js.Promise[Unit] = js.native
  
  /**
    * Get the row count for a region in the data model.
    *
    * @param region - The row region of interest.
    *
    * @returns - The row count for the region.
    *
    * #### Notes
    * This method is called often, and so should be efficient.
    */
  /* InferMemberOverrides */
  override def rowCount(region: RowRegion): Double = js.native
}
