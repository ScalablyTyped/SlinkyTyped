package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoTextOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFrame extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var AutoMargins: Boolean = js.native
  var AutoSize: Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.TextFrame_typekey")
  var ExcelDotTextFrame_typekey: TextFrame = js.native
  var HorizontalAlignment: XlHAlign = js.native
  var HorizontalOverflow: XlOartHorizontalOverflow = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: Double = js.native
  var VerticalAlignment: XlVAlign = js.native
  var VerticalOverflow: XlOartVerticalOverflow = js.native
  def Characters(): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typingsSlinky.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typingsSlinky.activexExcel.Excel.Characters = js.native
}

