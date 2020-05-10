package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminSetUserMFAPreferenceRequest extends js.Object {
  /**
    * The SMS text message MFA settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.native
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user pool username or alias.
    */
  var Username: UsernameType = js.native
}

object AdminSetUserMFAPreferenceRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserMFAPreferenceRequest]
  }
  @scala.inline
  implicit class AdminSetUserMFAPreferenceRequestOps[Self <: AdminSetUserMFAPreferenceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMSMfaSettings(value: SMSMfaSettingsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSMfaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMSMfaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSMfaSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareTokenMfaSettings(value: SoftwareTokenMfaSettingsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareTokenMfaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareTokenMfaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareTokenMfaSettings")(js.undefined)
        ret
    }
  }
  
}

