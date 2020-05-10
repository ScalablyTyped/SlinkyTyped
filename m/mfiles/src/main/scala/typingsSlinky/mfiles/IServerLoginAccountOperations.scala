package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerLoginAccountOperations extends js.Object {
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit = js.native
  def ForceLogout(AccountNames: IStrings): Unit = js.native
  def GetLoginAccount(AccountName: String): ILoginAccount = js.native
  def GetLoginAccounts(): ILoginAccounts = js.native
  def GetLoginAccountsWithSessions(): ILoginAccounts = js.native
  def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation = js.native
  def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit = js.native
  def RemoveLoginAccount(AccountName: String): Unit = js.native
  def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit = js.native
}

object IServerLoginAccountOperations {
  @scala.inline
  def apply(
    AddLoginAccount: (ILoginAccount, String) => Unit,
    ForceLogout: IStrings => Unit,
    GetLoginAccount: String => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetLoginAccountsWithSessions: () => ILoginAccounts,
    GetPersonalInformationFromDomain: String => ILoginAccountPersonalInformation,
    ModifyLoginAccount: ILoginAccount => Unit,
    RemoveLoginAccount: String => Unit,
    UpdateLoginPassword: (String, String) => Unit
  ): IServerLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = js.Any.fromFunction2(AddLoginAccount), ForceLogout = js.Any.fromFunction1(ForceLogout), GetLoginAccount = js.Any.fromFunction1(GetLoginAccount), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetLoginAccountsWithSessions = js.Any.fromFunction0(GetLoginAccountsWithSessions), GetPersonalInformationFromDomain = js.Any.fromFunction1(GetPersonalInformationFromDomain), ModifyLoginAccount = js.Any.fromFunction1(ModifyLoginAccount), RemoveLoginAccount = js.Any.fromFunction1(RemoveLoginAccount), UpdateLoginPassword = js.Any.fromFunction2(UpdateLoginPassword))
    __obj.asInstanceOf[IServerLoginAccountOperations]
  }
  @scala.inline
  implicit class IServerLoginAccountOperationsOps[Self <: IServerLoginAccountOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLoginAccount(value: (ILoginAccount, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddLoginAccount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForceLogout(value: IStrings => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceLogout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLoginAccount(value: String => ILoginAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoginAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLoginAccounts(value: () => ILoginAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoginAccounts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLoginAccountsWithSessions(value: () => ILoginAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoginAccountsWithSessions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPersonalInformationFromDomain(value: String => ILoginAccountPersonalInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPersonalInformationFromDomain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModifyLoginAccount(value: ILoginAccount => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyLoginAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveLoginAccount(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveLoginAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateLoginPassword(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateLoginPassword")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

