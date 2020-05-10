package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPermissionModifications extends js.Object {
  /**
    * The load permissions to add.
    */
  var Add: js.UndefOr[LoadPermissionListRequest] = js.native
  /**
    * The load permissions to remove.
    */
  var Remove: js.UndefOr[LoadPermissionListRequest] = js.native
}

object LoadPermissionModifications {
  @scala.inline
  def apply(): LoadPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPermissionModifications]
  }
  @scala.inline
  implicit class LoadPermissionModificationsOps[Self <: LoadPermissionModifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: LoadPermissionListRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: LoadPermissionListRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.undefined)
        ret
    }
  }
  
}

