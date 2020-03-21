package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TableStyleElement")
@js.native
class TableStyleElement protected () extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.TableStyleElement_typekey")
  var ExcelDotTableStyleElement_typekey: TableStyleElement = js.native
  val Font: typingsSlinky.activexExcel.Excel.Font = js.native
  val HasFormat: Boolean = js.native
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  val Parent: js.Any = js.native
  var StripeSize: Double = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): Unit = js.native
}

