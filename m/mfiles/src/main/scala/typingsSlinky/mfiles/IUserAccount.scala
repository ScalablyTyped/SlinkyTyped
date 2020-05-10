package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFUserAccountVaultRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserAccount extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var Enabled: Boolean = js.native
  var ID: Double = js.native
  var InternalUser: Boolean = js.native
  var LoginName: String = js.native
  var VaultLanguage: Double = js.native
  var VaultRoles: MFUserAccountVaultRole = js.native
  def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit = js.native
  def Clone(): IUserAccount = js.native
  def CloneFrom(UserAccount: IUserAccount): Unit = js.native
  def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit = js.native
}

object IUserAccount {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: MFUserAccountVaultRole => Unit,
    Clone: () => IUserAccount,
    CloneFrom: IUserAccount => Unit,
    Enabled: Boolean,
    ID: Double,
    InternalUser: Boolean,
    LoginName: String,
    RemoveVaultRoles: MFUserAccountVaultRole => Unit,
    VaultLanguage: Double,
    VaultRoles: MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AddVaultRoles = js.Any.fromFunction1(AddVaultRoles), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], LoginName = LoginName.asInstanceOf[js.Any], RemoveVaultRoles = js.Any.fromFunction1(RemoveVaultRoles), VaultLanguage = VaultLanguage.asInstanceOf[js.Any], VaultRoles = VaultRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserAccount]
  }
  @scala.inline
  implicit class IUserAccountOps[Self <: IUserAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddVaultRoles(value: MFUserAccountVaultRole => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddVaultRoles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IUserAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IUserAccount => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveVaultRoles(value: MFUserAccountVaultRole => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveVaultRoles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVaultLanguage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultRoles(value: MFUserAccountVaultRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultRoles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

