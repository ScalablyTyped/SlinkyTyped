package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetUserMFAPreferenceRequest extends js.Object {
  /**
    * The access token for the user.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * The SMS text message multi-factor authentication (MFA) settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.native
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.native
}

object SetUserMFAPreferenceRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): SetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserMFAPreferenceRequest]
  }
  @scala.inline
  implicit class SetUserMFAPreferenceRequestOps[Self <: SetUserMFAPreferenceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(value.asInstanceOf[js.Any])
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

