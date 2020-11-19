package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.IncludeEmpty
import typingsSlinky.exceljs.anon.PartialAlignment
import typingsSlinky.exceljs.anon.PartialBorders
import typingsSlinky.exceljs.anon.PartialFont
import typingsSlinky.exceljs.anon.PartialProtection
import typingsSlinky.exceljs.anon.PartialStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  var alignment: PartialAlignment = js.native
  
  var border: PartialBorders = js.native
  
  /**
  	 * indicate the collapsed state based on outlineLevel
  	 */
  val collapsed: Boolean = js.native
  
  var defn: js.Any = js.native
  
  /**
  	 * Iterate over all current cells in this column
  	 */
  def eachCell(callback: js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Iterate over all current cells in this column including empty cells
  	 */
  def eachCell(opt: IncludeEmpty, callback: js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit]): Unit = js.native
  
  def equivalentTo(other: Column): Boolean = js.native
  
  var fill: Fill = js.native
  
  var font: PartialFont = js.native
  
  /**
  	 * Can be a string to set one row high header or an array to set multi-row high header
  	 */
  var header: String | js.Array[String] = js.native
  
  val headerCount: Double = js.native
  
  val headers: js.Array[String] = js.native
  
  /**
  	 * Hides the column
  	 */
  var hidden: Boolean = js.native
  
  val isCustomWidth: Boolean = js.native
  
  val isDefault: Boolean = js.native
  
  /**
  	 * The name of the properties associated with this column in each row
  	 */
  var key: String = js.native
  
  /**
  	 * Column letter key
  	 */
  val letter: String = js.native
  
  var numFmt: String = js.native
  
  val number: Double = js.native
  
  /**
  	 * Set an outline level for columns
  	 */
  var outlineLevel: Double = js.native
  
  var protection: PartialProtection = js.native
  
  /**
  	 * Styles applied to the column
  	 */
  var style: PartialStyle = js.native
  
  /**
  	 * The cell values in the column
  	 */
  var values: js.Array[CellValue] = js.native
  
  /**
  	 * The width of the column
  	 */
  var width: Double = js.native
  
  val worksheet: Worksheet = js.native
}
