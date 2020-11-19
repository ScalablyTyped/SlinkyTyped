package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListColumn extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def DataBodyRange(Address: String): Range = js.native
  def DataBodyRange(RowIndex: Double): Range = js.native
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.ListColumn_typekey")
  var ExcelDotListColumn_typekey: ListColumn = js.native
  
  val Index: Double = js.native
  
  val ListDataFormat: typingsSlinky.activexExcel.Excel.ListDataFormat = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Range(Address: String): typingsSlinky.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typingsSlinky.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typingsSlinky.activexExcel.Excel.Range = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  
  val SharePointFormula: String = js.native
  
  def Total(Address: String): Range = js.native
  def Total(RowIndex: Double): Range = js.native
  def Total(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Total")
  val Total_Original: Range = js.native
  
  var TotalsCalculation: XlTotalsCalculation = js.native
  
  val XPath: typingsSlinky.activexExcel.Excel.XPath = js.native
  
  val _Default: String = js.native
}
