package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsScopedList extends js.Object {
  /**
    * [Output Only] The list of network endpoint groups that are contained in
    * this scope.
    */
  var networkEndpointGroups: js.UndefOr[js.Array[SchemaNetworkEndpointGroup]] = js.native
  /**
    * [Output Only] An informational warning that replaces the list of network
    * endpoint groups when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNetworkEndpointGroupsScopedList {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsScopedList]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsScopedListOps[Self <: SchemaNetworkEndpointGroupsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkEndpointGroups(value: js.Array[SchemaNetworkEndpointGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpointGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEndpointGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpointGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

