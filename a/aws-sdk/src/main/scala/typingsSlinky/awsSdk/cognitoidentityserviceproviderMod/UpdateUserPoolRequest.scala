package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserPoolRequest extends js.Object {
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.native
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.native
  /**
    * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user pools.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.native
  /**
    * Device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.native
  /**
    * Email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.native
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The subject of the email verification message.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The AWS Lambda configuration information from the request to update the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * A container with the policies you wish to update in a user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.native
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
  /**
    * A container with information about the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.native
  /**
    * The user pool ID for the user pool you want to update.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.native
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}

object UpdateUserPoolRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): UpdateUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolRequest]
  }
  @scala.inline
  implicit class UpdateUserPoolRequestOps[Self <: UpdateUserPoolRequest] (val x: Self) extends AnyVal {
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
    def withAccountRecoverySetting(value: AccountRecoverySettingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountRecoverySetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountRecoverySetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountRecoverySetting")(js.undefined)
        ret
    }
    @scala.inline
    def withAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminCreateUserConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminCreateUserConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminCreateUserConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoVerifiedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoVerifiedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoVerifiedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceConfiguration(value: DeviceConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailConfiguration(value: EmailConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailVerificationMessage(value: EmailVerificationMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailVerificationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailVerificationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailVerificationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailVerificationSubject(value: EmailVerificationSubjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailVerificationSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailVerificationSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailVerificationSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaConfig(value: LambdaConfigType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaConfig")(js.undefined)
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
    def withPolicies(value: UserPoolPolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsAuthenticationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsAuthenticationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsAuthenticationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsConfiguration(value: SmsConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsVerificationMessage(value: SmsVerificationMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsVerificationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsVerificationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsVerificationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolAddOns(value: UserPoolAddOnsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolAddOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolAddOns")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolTags(value: UserPoolTagsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolTags")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationMessageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerificationMessageTemplate")(js.undefined)
        ret
    }
  }
  
}

