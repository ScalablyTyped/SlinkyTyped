package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterType[D /* <: js.Object */] extends js.Object {
  
  def apply(rows: js.Array[Row[D]], columnIds: js.Array[IdType[D]], filterValue: FilterValue): js.Array[Row[D]] = js.native
  
  var autoRemove: js.UndefOr[js.Function1[/* filterValue */ FilterValue, Boolean]] = js.native
}
