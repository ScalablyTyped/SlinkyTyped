package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outline extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var AutomaticStyles: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Outline_typekey")
  var ExcelDotOutline_typekey: Outline = js.native
  
  val Parent: js.Any = js.native
  
  def ShowLevels(): js.Any = js.native
  def ShowLevels(RowLevels: js.UndefOr[scala.Nothing], ColumnLevels: Double): js.Any = js.native
  def ShowLevels(RowLevels: Double): js.Any = js.native
  def ShowLevels(RowLevels: Double, ColumnLevels: Double): js.Any = js.native
  
  var SummaryColumn: XlSummaryColumn = js.native
  
  var SummaryRow: XlSummaryRow = js.native
}
