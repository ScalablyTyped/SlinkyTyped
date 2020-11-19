package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Range
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShTarget extends js.Object {
  
  val Sh: Worksheet = js.native
  
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Target")
  val Target_Original: Range = js.native
}
