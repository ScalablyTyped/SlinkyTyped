package typingsSlinky.activexDashExcel.Excel

import typingsSlinky.activexDashOffice.Office.MsoTextOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: typingsSlinky.activexDashExcel.Excel.Application = js.native
  var AutoMargins: Boolean = js.native
  var AutoSize: Boolean = js.native
  val Creator: XlCreator = js.native
  var `Excel.TextFrame_typekey`: TextFrame = js.native
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
  def Characters(): typingsSlinky.activexDashExcel.Excel.Characters = js.native
  def Characters(Start: Double): typingsSlinky.activexDashExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typingsSlinky.activexDashExcel.Excel.Characters = js.native
}

