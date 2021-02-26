package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to query for cell ranges with specific contents.
  *
  * All methods return a collection of cell ranges.
  * @see com.sun.star.sheet.SheetRangesQuery
  * @see com.sun.star.sheet.SheetCellRanges
  */
@js.native
trait XCellRangesQuery extends XInterface {
  
  /**
    * queries all cells with different values in a specified row.
    *
    * This method takes each column of the current cell range(s) and compares all cells with the cell in the specified row. All cells which are different to
    * this comparison cell will be returned.
    * @param aCompare contains a cell address with the row index used for comparison. Only this row index is of interest.
    * @returns all cells of the current cell range(s) which are different to the comparison cell of each column.
    */
  def queryColumnDifferences(aCompare: CellAddress): XSheetCellRanges = js.native
  
  /**
    * queries all cells with the specified content type(s).
    * @param nContentFlags a combination of {@link CellFlags} flags.  Attention: Despite the {@link CellFlags} flags are `long` values, this method expects a
    * @returns all cells of the current cell range(s) with the specified content type(s).
    */
  def queryContentCells(nContentFlags: Double): XSheetCellRanges = js.native
  
  /**
    * queries all empty cells.
    * @returns the empty cells of the current cell range(s).
    */
  def queryEmptyCells(): XSheetCellRanges = js.native
  
  /**
    * queries all formula cells with the specified result type.
    * @param nResultFlags a combination of {@link FormulaResult} flags.
    * @returns all formula cells of the current cell range(s) with the specified result type(s).
    */
  def queryFormulaCells(nResultFlags: Double): XSheetCellRanges = js.native
  
  /**
    * intersects the current cell range(s) with the specified cell range.
    * @param aRange contains the cell range for intersection.
    * @returns all cells of the current cell range(s) which are contained in the passed cell range.
    */
  def queryIntersection(aRange: CellRangeAddress): XSheetCellRanges = js.native
  
  /**
    * queries all cells with different values in a specified column.
    *
    * This method takes each row of the current cell range(s) and compares all cells with the cell in the specified column. All cells which are different to
    * this comparison cell will be returned.
    * @param aCompare contains a cell address with the column index used for comparison. Only this column index is of interest.
    * @returns all cells of the current cell range(s) which are different to the comparison cell of each row.
    */
  def queryRowDifferences(aCompare: CellAddress): XSheetCellRanges = js.native
  
  /**
    * queries all visible cells.
    * @returns the visible (not hidden) cells of the current cell range(s).
    */
  def queryVisibleCells(): XSheetCellRanges = js.native
}
object XCellRangesQuery {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryColumnDifferences: CellAddress => XSheetCellRanges,
    queryContentCells: Double => XSheetCellRanges,
    queryEmptyCells: () => XSheetCellRanges,
    queryFormulaCells: Double => XSheetCellRanges,
    queryInterface: `type` => js.Any,
    queryIntersection: CellRangeAddress => XSheetCellRanges,
    queryRowDifferences: CellAddress => XSheetCellRanges,
    queryVisibleCells: () => XSheetCellRanges,
    release: () => Unit
  ): XCellRangesQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryColumnDifferences = js.Any.fromFunction1(queryColumnDifferences), queryContentCells = js.Any.fromFunction1(queryContentCells), queryEmptyCells = js.Any.fromFunction0(queryEmptyCells), queryFormulaCells = js.Any.fromFunction1(queryFormulaCells), queryInterface = js.Any.fromFunction1(queryInterface), queryIntersection = js.Any.fromFunction1(queryIntersection), queryRowDifferences = js.Any.fromFunction1(queryRowDifferences), queryVisibleCells = js.Any.fromFunction0(queryVisibleCells), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangesQuery]
  }
  
  @scala.inline
  implicit class XCellRangesQueryMutableBuilder[Self <: XCellRangesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryColumnDifferences(value: CellAddress => XSheetCellRanges): Self = StObject.set(x, "queryColumnDifferences", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryContentCells(value: Double => XSheetCellRanges): Self = StObject.set(x, "queryContentCells", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryEmptyCells(value: () => XSheetCellRanges): Self = StObject.set(x, "queryEmptyCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryFormulaCells(value: Double => XSheetCellRanges): Self = StObject.set(x, "queryFormulaCells", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryIntersection(value: CellRangeAddress => XSheetCellRanges): Self = StObject.set(x, "queryIntersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryRowDifferences(value: CellAddress => XSheetCellRanges): Self = StObject.set(x, "queryRowDifferences", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryVisibleCells(value: () => XSheetCellRanges): Self = StObject.set(x, "queryVisibleCells", js.Any.fromFunction0(value))
  }
}
