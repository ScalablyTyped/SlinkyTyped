package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTarget extends StObject {
  
  var Cancel: Boolean = js.native
  
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Target")
  val Target_Original: Range = js.native
}
