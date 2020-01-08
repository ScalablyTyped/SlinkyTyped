package typingsSlinky.reactDashTable

import typingsSlinky.reactDashTable.reactDashTableMod.FilterValue
import typingsSlinky.reactDashTable.reactDashTableMod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id[D /* <: js.Object */] extends js.Object {
  var id: IdType[D]
  var value: FilterValue
}

object Anon_Id {
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D], value: FilterValue): Anon_Id[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id[D]]
  }
}

