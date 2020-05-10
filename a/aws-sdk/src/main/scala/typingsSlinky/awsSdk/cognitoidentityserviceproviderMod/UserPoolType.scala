package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolType extends js.Object {
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.native
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.native
  /**
    * Specifies the attributes that are aliased in a user pool.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.native
  /**
    * The Amazon Resource Name (ARN) for the user pool.
    */
  var Arn: js.UndefOr[ArnType] = js.native
  /**
    * Specifies the attributes that are auto-verified in a user pool.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.native
  /**
    * The date the user pool was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: auth.example.com. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  var CustomDomain: js.UndefOr[DomainType] = js.native
  /**
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.native
  /**
    * Holds the domain prefix if the user pool has a domain associated with it.
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.native
  /**
    * The reason why the email configuration cannot send the messages to your users.
    */
  var EmailConfigurationFailure: js.UndefOr[StringType] = js.native
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The subject of the email verification message.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * A number estimating the size of the user pool.
    */
  var EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.native
  /**
    * The ID of the user pool.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.native
  /**
    * The AWS Lambda triggers associated with the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * The date the user pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The name of the user pool.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.native
  /**
    * The policies associated with the user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.native
  /**
    * A container with the schema attributes of a user pool.
    */
  var SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.native
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
  /**
    * The reason why the SMS configuration cannot send the messages to your users.
    */
  var SmsConfigurationFailure: js.UndefOr[StringType] = js.native
  /**
    * The contents of the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The status of a user pool.
    */
  var Status: js.UndefOr[StatusType] = js.native
  /**
    * The user pool add-ons.
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.native
  /**
    * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.native
  /**
    * You can choose to enable case sensitivity on the username input for the selected sign-in option. For example, when this is set to False, users will be able to sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see .
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.native
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}

object UserPoolType {
  @scala.inline
  def apply(): UserPoolType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolType]
  }
  @scala.inline
  implicit class UserPoolTypeOps[Self <: UserPoolType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDomain(value: DomainType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDomain")(js.undefined)
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
    def withDomain(value: DomainType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
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
    def withEmailConfigurationFailure(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailConfigurationFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailConfigurationFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailConfigurationFailure")(js.undefined)
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
    def withEstimatedNumberOfUsers(value: IntegerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedNumberOfUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedNumberOfUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedNumberOfUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
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
    def withName(value: UserPoolNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
    def withSchemaAttributes(value: SchemaAttributesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaAttributes")(js.undefined)
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
    def withSmsConfigurationFailure(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsConfigurationFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsConfigurationFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsConfigurationFailure")(js.undefined)
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
    def withStatus(value: StatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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

