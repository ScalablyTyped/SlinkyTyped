package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlEntry extends js.Object {
  var ChangePermissionsPermission: MFPermission = js.native
  var EditPermission: MFPermission = js.native
  var IsGroup: Boolean = js.native
  var ReadPermission: MFPermission = js.native
  var UserOrGroupID: Double = js.native
  def Clone(): IAccessControlEntry = js.native
}

object IAccessControlEntry {
  @scala.inline
  def apply(
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntry,
    EditPermission: MFPermission,
    IsGroup: Boolean,
    ReadPermission: MFPermission,
    UserOrGroupID: Double
  ): IAccessControlEntry = {
    val __obj = js.Dynamic.literal(ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EditPermission = EditPermission.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntry]
  }
  @scala.inline
  implicit class IAccessControlEntryOps[Self <: IAccessControlEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangePermissionsPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangePermissionsPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAccessControlEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserOrGroupID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserOrGroupID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

