package typingsSlinky.expoPermissions.permissionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResponse extends js.Object {
  var expires: PermissionExpiration
  var permissions: PermissionMap
  var status: PermissionStatus
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpires(value: PermissionExpiration): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: PermissionMap): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PermissionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

