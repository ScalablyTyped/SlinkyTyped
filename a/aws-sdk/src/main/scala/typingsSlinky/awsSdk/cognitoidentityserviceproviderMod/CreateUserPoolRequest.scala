package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolRequest extends js.Object {
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.  Starting February 1, 2020, the value of AccountRecoverySetting will default to verified_email first and verified_phone_number as the second option for newly created user pools if no value is provided. 
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.native
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.native
  /**
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.native
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.native
  /**
    * A string representing the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * A string representing the email verification subject.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The Lambda trigger configuration information for the new user pool.  In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function. So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.  For more information on using the Lambda API to add permission, see  AddPermission .  For adding permission using the AWS CLI, see  add-permission . 
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * Specifies MFA configuration details.
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The policies associated with the new user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.native
  /**
    * A string used to name the user pool.
    */
  var PoolName: UserPoolNameType = js.native
  /**
    * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
    */
  var Schema: js.UndefOr[SchemaAttributesListType] = js.native
  /**
    * A string representing the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
  /**
    * A string representing the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.native
  /**
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.native
  /**
    * You can choose to set case sensitivity on the username input for the selected sign-in option. For example, when this is set to False, users will be able to sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see .
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.native
  /**
    * The template for the verification message that the user sees when the app requests permission to access the user's information.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}

object CreateUserPoolRequest {
  @scala.inline
  def apply(PoolName: UserPoolNameType): CreateUserPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolRequest]
  }
  @scala.inline
  implicit class CreateUserPoolRequestOps[Self <: CreateUserPoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoolName(value: UserPoolNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolName")(value.asInstanceOf[js.Any])
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
    def withAliasAttributes(value: AliasAttributesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasAttributes")(js.undefined)
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
    def withSchema(value: SchemaAttributesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(js.undefined)
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
    def withUsernameAttributes(value: UsernameAttributesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsernameAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsernameAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameConfiguration(value: UsernameConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsernameConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsernameConfiguration")(js.undefined)
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

