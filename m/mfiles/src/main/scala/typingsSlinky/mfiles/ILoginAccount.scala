package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFLicenseType
import typingsSlinky.mfiles.MFiles.MFLoginAccountType
import typingsSlinky.mfiles.MFiles.MFLoginServerRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoginAccount extends js.Object {
  val AccountName: String = js.native
  var AccountType: MFLoginAccountType = js.native
  var DomainName: String = js.native
  var EmailAddress: String = js.native
  var Enabled: Boolean = js.native
  var FullName: String = js.native
  var LicenseType: MFLicenseType = js.native
  var ServerRoles: MFLoginServerRole = js.native
  var UserName: String = js.native
  def Clone(): ILoginAccount = js.native
  def CloneFrom(LoginAccount: ILoginAccount): Unit = js.native
  def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit = js.native
}

object ILoginAccount {
  @scala.inline
  def apply(
    AccountName: String,
    AccountType: MFLoginAccountType,
    Clone: () => ILoginAccount,
    CloneFrom: ILoginAccount => Unit,
    DomainName: String,
    EmailAddress: String,
    Enabled: Boolean,
    FullName: String,
    LicenseType: MFLicenseType,
    ServerRoles: MFLoginServerRole,
    Set: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Unit,
    UserName: String
  ): ILoginAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountType = AccountType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), DomainName = DomainName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], ServerRoles = ServerRoles.asInstanceOf[js.Any], Set = js.Any.fromFunction7(Set), UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginAccount]
  }
  @scala.inline
  implicit class ILoginAccountOps[Self <: ILoginAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountType(value: MFLoginAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ILoginAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: ILoginAccount => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseType(value: MFLicenseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerRoles(value: MFLoginServerRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(
      value: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

