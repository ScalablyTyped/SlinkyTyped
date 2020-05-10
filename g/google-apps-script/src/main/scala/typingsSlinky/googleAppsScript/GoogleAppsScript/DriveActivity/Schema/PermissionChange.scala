package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionChange extends js.Object {
  var addedPermissions: js.UndefOr[js.Array[Permission]] = js.native
  var removedPermissions: js.UndefOr[js.Array[Permission]] = js.native
}

object PermissionChange {
  @scala.inline
  def apply(): PermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionChange]
  }
  @scala.inline
  implicit class PermissionChangeOps[Self <: PermissionChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovedPermissions(value: js.Array[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedPermissions")(js.undefined)
        ret
    }
  }
  
}

