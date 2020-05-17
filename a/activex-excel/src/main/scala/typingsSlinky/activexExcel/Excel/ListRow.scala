package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRow extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ListRow_typekey")
  var ExcelDotListRow_typekey: ListRow = js.native
  val Index: Double = js.native
  val InvalidData: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  def Delete(): Unit = js.native
  def Range(Address: String): typingsSlinky.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typingsSlinky.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typingsSlinky.activexExcel.Excel.Range = js.native
}

