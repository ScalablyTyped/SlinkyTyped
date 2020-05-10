package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserOperations extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount = js.native
  def AddUserAccount(User: IUserAccount): IUserAccount = js.native
  def GetLoginAccountOfUser(UserID: Double): ILoginAccount = js.native
  def GetLoginAccounts(): ILoginAccounts = js.native
  def GetUserAccount(UserID: Double): IUserAccount = js.native
  def GetUserAccounts(): IUserAccounts = js.native
  def GetUserIDByGUID(UserGUID: String): Double = js.native
  def GetUserList(): IKeyNamePairs = js.native
  def ModifyUserAccount(User: IUserAccount): Unit = js.native
  def RemoveUserAccount(UserID: Double): Unit = js.native
}

object IVaultUserOperations {
  @scala.inline
  def apply(
    AddOrUndeleteUserAccount: IUserAccount => IUserAccount,
    AddUserAccount: IUserAccount => IUserAccount,
    GetLoginAccountOfUser: Double => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetUserAccount: Double => IUserAccount,
    GetUserAccounts: () => IUserAccounts,
    GetUserIDByGUID: String => Double,
    GetUserList: () => IKeyNamePairs,
    ModifyUserAccount: IUserAccount => Unit,
    RemoveUserAccount: Double => Unit
  ): IVaultUserOperations = {
    val __obj = js.Dynamic.literal(AddOrUndeleteUserAccount = js.Any.fromFunction1(AddOrUndeleteUserAccount), AddUserAccount = js.Any.fromFunction1(AddUserAccount), GetLoginAccountOfUser = js.Any.fromFunction1(GetLoginAccountOfUser), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetUserAccount = js.Any.fromFunction1(GetUserAccount), GetUserAccounts = js.Any.fromFunction0(GetUserAccounts), GetUserIDByGUID = js.Any.fromFunction1(GetUserIDByGUID), GetUserList = js.Any.fromFunction0(GetUserList), ModifyUserAccount = js.Any.fromFunction1(ModifyUserAccount), RemoveUserAccount = js.Any.fromFunction1(RemoveUserAccount))
    __obj.asInstanceOf[IVaultUserOperations]
  }
  @scala.inline
  implicit class IVaultUserOperationsOps[Self <: IVaultUserOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOrUndeleteUserAccount(value: IUserAccount => IUserAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddOrUndeleteUserAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddUserAccount(value: IUserAccount => IUserAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddUserAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLoginAccountOfUser(value: Double => ILoginAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoginAccountOfUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLoginAccounts(value: () => ILoginAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoginAccounts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserAccount(value: Double => IUserAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUserAccounts(value: () => IUserAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserAccounts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserIDByGUID(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserIDByGUID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUserList(value: () => IKeyNamePairs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModifyUserAccount(value: IUserAccount => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyUserAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveUserAccount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveUserAccount")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

