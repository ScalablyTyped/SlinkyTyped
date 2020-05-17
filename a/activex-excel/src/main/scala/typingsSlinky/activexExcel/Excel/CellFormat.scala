package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexExcel.activexExcelNumbers.`0`
import typingsSlinky.activexExcel.activexExcelNumbers.`10`
import typingsSlinky.activexExcel.activexExcelNumbers.`11`
import typingsSlinky.activexExcel.activexExcelNumbers.`12`
import typingsSlinky.activexExcel.activexExcelNumbers.`13`
import typingsSlinky.activexExcel.activexExcelNumbers.`14`
import typingsSlinky.activexExcel.activexExcelNumbers.`15`
import typingsSlinky.activexExcel.activexExcelNumbers.`1`
import typingsSlinky.activexExcel.activexExcelNumbers.`2`
import typingsSlinky.activexExcel.activexExcelNumbers.`3`
import typingsSlinky.activexExcel.activexExcelNumbers.`4`
import typingsSlinky.activexExcel.activexExcelNumbers.`5`
import typingsSlinky.activexExcel.activexExcelNumbers.`6`
import typingsSlinky.activexExcel.activexExcelNumbers.`7`
import typingsSlinky.activexExcel.activexExcelNumbers.`8`
import typingsSlinky.activexExcel.activexExcelNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellFormat extends js.Object {
  var AddIndent: Boolean = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.CellFormat_typekey")
  var ExcelDotCellFormat_typekey: CellFormat = js.native
  var Font: typingsSlinky.activexExcel.Excel.Font = js.native
  var FormulaHidden: Boolean | Null = js.native
  var HorizontalAlignment: HorizontalAlignments = js.native
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  var Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
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

