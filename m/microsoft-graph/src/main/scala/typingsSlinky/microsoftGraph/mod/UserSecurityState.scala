package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSecurityState extends js.Object {
  // AAD User object identifier (GUID) - represents the physical/multi-account user entity.
  var aadUserId: js.UndefOr[String] = js.native
  // Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
  var accountName: js.UndefOr[String] = js.native
  // NetBIOS/Active Directory domain of user account (that is, domain/account format).
  var domainName: js.UndefOr[String] = js.native
  // For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
  var emailRole: js.UndefOr[EmailRole] = js.native
  // Indicates whether the user logged on through a VPN.
  var isVpn: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var logonDateTime: js.UndefOr[String] = js.native
  // User sign-in ID.
  var logonId: js.UndefOr[String] = js.native
  // IP Address the sign-in request originated from.
  var logonIp: js.UndefOr[String] = js.native
  // Location (by IP address mapping) associated with a user sign-in event by this user.
  var logonLocation: js.UndefOr[String] = js.native
  // Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
  var logonType: js.UndefOr[LogonType] = js.native
  // Active Directory (on-premises) Security Identifier (SID) of the user.
  var onPremisesSecurityIdentifier: js.UndefOr[String] = js.native
  /**
    * Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
  /**
    * User account type (group membership), per Windows definition. Possible values are: unknown, standard, power,
    * administrator.
    */
  var userAccountType: js.UndefOr[UserAccountSecurityType] = js.native
  // User sign-in name - internet format: (user account name)@(user account DNS domain name).
  var userPrincipalName: js.UndefOr[String] = js.native
}

object UserSecurityState {
  @scala.inline
  def apply(): UserSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSecurityState]
  }
  @scala.inline
  implicit class UserSecurityStateOps[Self <: UserSecurityState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAadUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aadUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAadUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aadUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailRole(value: EmailRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRole")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVpn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVpn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogonDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogonDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLogonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogonIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogonIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonIp")(js.undefined)
        ret
    }
    @scala.inline
    def withLogonLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogonLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLogonType(value: LogonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesSecurityIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSecurityIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesSecurityIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesSecurityIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAccountType(value: UserAccountSecurityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccountType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
  }
  
}

