package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionSetPermissions extends js.Object {
  var DiscardsAutomaticPermissions: Boolean = js.native
  var Permissions: IAccessControlList = js.native
  def Clone(): IActionSetPermissions = js.native
}

object IActionSetPermissions {
  @scala.inline
  def apply(
    Clone: () => IActionSetPermissions,
    DiscardsAutomaticPermissions: Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DiscardsAutomaticPermissions = DiscardsAutomaticPermissions.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetPermissions]
  }
  @scala.inline
  implicit class IActionSetPermissionsOps[Self <: IActionSetPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IActionSetPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDiscardsAutomaticPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscardsAutomaticPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

