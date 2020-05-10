package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionData extends js.Object {
  var permission_name: String = js.native
  var resource_server_identifier: String = js.native
}

object PermissionData {
  @scala.inline
  def apply(permission_name: String, resource_server_identifier: String): PermissionData = {
    val __obj = js.Dynamic.literal(permission_name = permission_name.asInstanceOf[js.Any], resource_server_identifier = resource_server_identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionData]
  }
  @scala.inline
  implicit class PermissionDataOps[Self <: PermissionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermission_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource_server_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_server_identifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

