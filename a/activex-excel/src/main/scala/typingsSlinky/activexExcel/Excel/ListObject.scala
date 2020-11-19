package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObject extends js.Object {
  
  val Active: Boolean = js.native
  
  var AlternativeText: String = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val AutoFilter: typingsSlinky.activexExcel.Excel.AutoFilter = js.native
  
  var Comment: String = js.native
  
  val Creator: XlCreator = js.native
  
  def DataBodyRange(Address: String): Range = js.native
  def DataBodyRange(RowIndex: Double): Range = js.native
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  
  def Delete(): Unit = js.native
  
  var DisplayName: String = js.native
  
  val DisplayRightToLeft: Boolean = js.native
  
  @JSName("Excel.ListObject_typekey")
  var ExcelDotListObject_typekey: ListObject = js.native
  
  def ExportToVisio(): Unit = js.native
  
  def HeaderRowRange(Address: String): Range = js.native
  def HeaderRowRange(RowIndex: Double): Range = js.native
  def HeaderRowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("HeaderRowRange")
  val HeaderRowRange_Original: Range = js.native
  
  def InsertRowRange(Address: String): Range = js.native
  def InsertRowRange(RowIndex: Double): Range = js.native
  def InsertRowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("InsertRowRange")
  val InsertRowRange_Original: Range = js.native
  
  def ListColumns(Index: String): ListColumn = js.native
  def ListColumns(Index: Double): ListColumn = js.native
  @JSName("ListColumns")
  val ListColumns_Original: ListColumns = js.native
  
  def ListRows(Index: String): ListRow = js.native
  def ListRows(Index: Double): ListRow = js.native
  @JSName("ListRows")
  val ListRows_Original: ListRows = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Publish(Target: SafeArray[String], LinkSource: Boolean): String = js.native
  
  val QueryTable: typingsSlinky.activexExcel.Excel.QueryTable = js.native
  
  def Range(Address: String): typingsSlinky.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typingsSlinky.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typingsSlinky.activexExcel.Excel.Range = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  
  def Refresh(): Unit = js.native
  
  def Resize(Range: Range): Unit = js.native
  
  val SharePointURL: String = js.native
  
  var ShowAutoFilter: Boolean = js.native
  
  var ShowHeaders: Boolean = js.native
  
  var ShowTableStyleColumnStripes: Boolean = js.native
  
  var ShowTableStyleFirstColumn: Boolean = js.native
  
  var ShowTableStyleLastColumn: Boolean = js.native
  
  var ShowTableStyleRowStripes: Boolean = js.native
  
  var ShowTotals: Boolean = js.native
  
  val Sort: typingsSlinky.activexExcel.Excel.Sort = js.native
  
  val SourceType: XlListObjectSourceType = js.native
  
  var Summary: String = js.native
  
  var TableStyle: js.Any = js.native
  
  def TotalsRowRange(Address: String): Range = js.native
  def TotalsRowRange(RowIndex: Double): Range = js.native
  def TotalsRowRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("TotalsRowRange")
  val TotalsRowRange_Original: Range = js.native
  
  def Unlink(): Unit = js.native
  
  def Unlist(): Unit = js.native
  
  /** @param iConflictType [iConflictType=0] */
  def UpdateChanges(): Unit = js.native
  def UpdateChanges(iConflictType: XlListConflict): Unit = js.native
  
  val XmlMap: typingsSlinky.activexExcel.Excel.XmlMap = js.native
  
  val _Default: String = js.native
}
