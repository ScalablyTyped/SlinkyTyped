package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XCell
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the cells or to sub-ranges of all sheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
@js.native
trait XCellRangesAccess extends XInterface {
  
  /**
    * Returns a single cell within the range.
    * @param nColumn is the column index of the cell inside the sheet.
    * @param nRow is the row index of the cell inside the sheet.
    * @param nSheet is the sheet index of the sheet inside the document.
    * @returns the specified cell.
    * @see com.sun.star.table.Cell
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellByPosition(nColumn: Double, nRow: Double, nSheet: Double): XCell = js.native
  
  /**
    * Returns a sub-range of cells within the range.
    * @param nLeft is the column index of the first cell inside the range.
    * @param nTop is the row index of the first cell inside the range.
    * @param nRight is the column index of the last cell inside the range.
    * @param nBottom is the row index of the last cell inside the range.
    * @param nSheet is the sheet index of the sheet inside the document.
    * @returns the specified cell range.
    * @see com.sun.star.table.CellRange
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellRangeByPosition(nLeft: Double, nTop: Double, nRight: Double, nBottom: Double, nSheet: Double): XCellRange = js.native
  
  /**
    * Returns a sub-range of cells within the range.
    *
    * The sub-range is specified by its name. The format of the range name is dependent of the context of the table. In spreadsheets valid names may be
    * "Sheet1.A1:C5" or "$Sheet1.$B$2" or even defined names for cell ranges such as "MySpecialCell".
    * @param aRange the name of the sub-range.
    * @returns the specified cell ranges.
    * @see com.sun.star.table.CellRange
    */
  def getCellRangesByName(aRange: String): SafeArray[XCellRange] = js.native
}
object XCellRangesAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getCellByPosition: (Double, Double, Double) => XCell,
    getCellRangeByPosition: (Double, Double, Double, Double, Double) => XCellRange,
    getCellRangesByName: String => SafeArray[XCellRange],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRangesAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCellByPosition = js.Any.fromFunction3(getCellByPosition), getCellRangeByPosition = js.Any.fromFunction5(getCellRangeByPosition), getCellRangesByName = js.Any.fromFunction1(getCellRangesByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangesAccess]
  }
  
  @scala.inline
  implicit class XCellRangesAccessMutableBuilder[Self <: XCellRangesAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCellByPosition(value: (Double, Double, Double) => XCell): Self = StObject.set(x, "getCellByPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCellRangeByPosition(value: (Double, Double, Double, Double, Double) => XCellRange): Self = StObject.set(x, "getCellRangeByPosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetCellRangesByName(value: String => SafeArray[XCellRange]): Self = StObject.set(x, "getCellRangesByName", js.Any.fromFunction1(value))
  }
}
