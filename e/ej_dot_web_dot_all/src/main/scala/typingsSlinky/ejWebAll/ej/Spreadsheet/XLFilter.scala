package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLFilter extends js.Object {
  
  /** This method is used to clear the filter in filtered columns in the Spreadsheet.
    * @returns {void}
    */
  def clearFilter(): Unit = js.native
  
  /** This method is used to apply filter for the selected range of cells in the Spreadsheet.
    * @param {string|any[]} Pass the range of the selected cells.
    * @returns {void}
    */
  def filter(range: String): Unit = js.native
  def filter(range: js.Array[_]): Unit = js.native
  
  /** This method is used to apply filter for the column by active cell's value in the Spreadsheet.
    * @returns {void}
    */
  def filterByActiveCell(): Unit = js.native
}
