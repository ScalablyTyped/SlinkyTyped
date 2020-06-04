package typingsSlinky.expoPermissions.permissionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionInfo extends js.Object {
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
  var expires: PermissionExpiration
  var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.undefined
  var status: PermissionStatus
}

object PermissionInfo {
  @scala.inline
  def apply(expires: PermissionExpiration, status: PermissionStatus): PermissionInfo = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionInfo]
  }
  @scala.inline
  implicit class PermissionInfoOps[Self <: PermissionInfo] (val x: Self) extends AnyVal {
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
    def setStatus(value: PermissionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setAndroid(value: PermissionDetailsLocationAndroid): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setIos(value: PermissionDetailsLocationIOS): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
  
}

