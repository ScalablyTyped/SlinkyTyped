package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlEntryData extends js.Object {
  var AttachObjectsPermission: MFPermission = js.native
  var ChangePermissionsPermission: MFPermission = js.native
  var DeletePermission: MFPermission = js.native
  var EditPermission: MFPermission = js.native
  var ReadPermission: MFPermission = js.native
  def Clone(): IAccessControlEntryData = js.native
  def SetAllPermissions(Permission: MFPermission): Unit = js.native
}

object IAccessControlEntryData {
  @scala.inline
  def apply(
    AttachObjectsPermission: MFPermission,
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntryData,
    DeletePermission: MFPermission,
    EditPermission: MFPermission,
    ReadPermission: MFPermission,
    SetAllPermissions: MFPermission => Unit
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission.asInstanceOf[js.Any], ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DeletePermission = DeletePermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], SetAllPermissions = js.Any.fromFunction1(SetAllPermissions))
    __obj.asInstanceOf[IAccessControlEntryData]
  }
  @scala.inline
  implicit class IAccessControlEntryDataOps[Self <: IAccessControlEntryData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachObjectsPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachObjectsPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePermissionsPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangePermissionsPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAccessControlEntryData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeletePermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletePermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadPermission(value: MFPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAllPermissions(value: MFPermission => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAllPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

