package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sparkline extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Sparkline_typekey")
  var ExcelDotSparkline_typekey: Sparkline = js.native
  
  def Location(Address: String): Range = js.native
  def Location(RowIndex: Double): Range = js.native
  def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Location")
  var Location_Original: Range = js.native
  
  def ModifyLocation(Range: Range): Unit = js.native
  
  def ModifySourceData(Formula: String): Unit = js.native
  
  val Parent: js.Any = js.native
  
  var SourceData: String = js.native
}
