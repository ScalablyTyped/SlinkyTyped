package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetUserPoolMfaConfigRequest extends js.Object {
  /**
    * The MFA configuration. Valid values include:    OFF MFA will not be used for any users.    ON MFA is required for all users to sign in.    OPTIONAL MFA will be required only for individual users who have an MFA factor enabled.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The SMS text message MFA configuration.
    */
  var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.native
  /**
    * The software token MFA configuration.
    */
  var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object SetUserPoolMfaConfigRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetUserPoolMfaConfigRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserPoolMfaConfigRequest]
  }
  @scala.inline
  implicit class SetUserPoolMfaConfigRequestOps[Self <: SetUserPoolMfaConfigRequest] (val x: Self) extends AnyVal {
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
    def withMfaConfiguration(value: UserPoolMfaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MfaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMfaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MfaConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsMfaConfiguration(value: SmsMfaConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsMfaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsMfaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsMfaConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareTokenMfaConfiguration(value: SoftwareTokenMfaConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareTokenMfaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareTokenMfaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareTokenMfaConfiguration")(js.undefined)
        ret
    }
  }
  
}

