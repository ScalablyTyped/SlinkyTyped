package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.PivotTable
import typingsSlinky.activexExcel.Excel.Range
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPivotTable extends js.Object {
  
  val Sh: Worksheet = js.native
  
  val TargetPivotTable: PivotTable = js.native
  
  def TargetRange(Address: String): Range = js.native
  def TargetRange(RowIndex: Double): Range = js.native
  def TargetRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("TargetRange")
  val TargetRange_Original: Range = js.native
}
