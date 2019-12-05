package typingsSlinky.activexDashExcel.Excel

import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`0`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`10`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`11`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`12`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`13`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`14`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`15`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`1`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`2`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`3`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`4`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`5`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`6`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`7`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`8`
import typingsSlinky.activexDashExcel.activexDashExcelNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CellFormat")
@js.native
class CellFormat protected () extends js.Object {
  var AddIndent: Boolean = js.native
  val Application: typingsSlinky.activexDashExcel.Excel.Application = js.native
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.CellFormat_typekey`: CellFormat = js.native
  var Font: typingsSlinky.activexDashExcel.Excel.Font = js.native
  var FormulaHidden: Boolean | Null = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  var Interior: typingsSlinky.activexDashExcel.Excel.Interior = js.native
  var Locked: Boolean | Null = js.native
  var MergeCells: Boolean = js.native
  var NumberFormat: String | Null = js.native
  var NumberFormatLocal: String | Null = js.native
  var Orientation: Double | XlOrientation = js.native
  val Parent: js.Any = js.native
  var ShrinkToFit: Boolean | Null = js.native
  var VerticalAlignment: VerticalAlignments = js.native
  var WrapText: Boolean | Null = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): Unit = js.native
}

