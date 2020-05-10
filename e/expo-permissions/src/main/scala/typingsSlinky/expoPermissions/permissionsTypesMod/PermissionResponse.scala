package typingsSlinky.expoPermissions.permissionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionResponse extends js.Object {
  var expires: PermissionExpiration = js.native
  var permissions: PermissionMap = js.native
  var status: PermissionStatus = js.native
}

object PermissionResponse {
  @scala.inline
  def apply(expires: PermissionExpiration, permissions: PermissionMap, status: PermissionStatus): PermissionResponse = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResponse]
  }
  @scala.inline
  implicit class PermissionResponseOps[Self <: PermissionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: PermissionExpiration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: PermissionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PermissionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

