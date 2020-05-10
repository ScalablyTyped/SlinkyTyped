package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePermission extends js.Object {
  // Actions
  var resourceActions: js.UndefOr[js.Array[ResourceAction]] = js.native
}

object RolePermission {
  @scala.inline
  def apply(): RolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RolePermission]
  }
  @scala.inline
  implicit class RolePermissionOps[Self <: RolePermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceActions(value: js.Array[ResourceAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceActions")(js.undefined)
        ret
    }
  }
  
}

