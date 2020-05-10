package typingsSlinky.pulumiAws.userPoolMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolAdminCreateUserConfig
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolDeviceConfiguration
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolEmailConfiguration
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolLambdaConfig
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolPasswordPolicy
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolSchema
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolSmsConfiguration
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolUserPoolAddOns
import typingsSlinky.pulumiAws.inputMod.cognito.UserPoolVerificationMessageTemplate
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolState extends js.Object {
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: js.UndefOr[Input[UserPoolAdminCreateUserConfig]] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `usernameAttributes`.
    */
  val aliasAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of the user pool.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The date the user pool was created.
    */
  val creationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: js.UndefOr[Input[UserPoolDeviceConfiguration]] = js.native
  /**
    * The Email Configuration.
    */
  val emailConfiguration: js.UndefOr[Input[UserPoolEmailConfiguration]] = js.native
  /**
    * A string representing the email verification message. Conflicts with `verificationMessageTemplate` configuration block `emailMessage` argument.
    */
  val emailVerificationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * A string representing the email verification subject. Conflicts with `verificationMessageTemplate` configuration block `emailSubject` argument.
    */
  val emailVerificationSubject: js.UndefOr[Input[String]] = js.native
  /**
    * The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: js.UndefOr[Input[UserPoolLambdaConfig]] = js.native
  /**
    * The date the user pool was last modified.
    */
  val lastModifiedDate: js.UndefOr[Input[String]] = js.native
  /**
    * Set to enable multi-factor authentication. Must be one of the following values (ON, OFF, OPTIONAL)
    */
  val mfaConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the attribute.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: js.UndefOr[Input[UserPoolPasswordPolicy]] = js.native
  /**
    * A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
    */
  val schemas: js.UndefOr[Input[js.Array[Input[UserPoolSchema]]]] = js.native
  /**
    * A string representing the SMS authentication message.
    */
  val smsAuthenticationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * The SMS Configuration.
    */
  val smsConfiguration: js.UndefOr[Input[UserPoolSmsConfiguration]] = js.native
  /**
    * A string representing the SMS verification message. Conflicts with `verificationMessageTemplate` configuration block `smsMessage` argument.
    */
  val smsVerificationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration block for user pool add-ons to enable user pool advanced security mode features.
    */
  val userPoolAddOns: js.UndefOr[Input[UserPoolUserPoolAddOns]] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `aliasAttributes`.
    */
  val usernameAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: js.UndefOr[Input[UserPoolVerificationMessageTemplate]] = js.native
}

object UserPoolState {
  @scala.inline
  def apply(): UserPoolState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolState]
  }
  @scala.inline
  implicit class UserPoolStateOps[Self <: UserPoolState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminCreateUserConfig(value: Input[UserPoolAdminCreateUserConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminCreateUserConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminCreateUserConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminCreateUserConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasAttributes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoVerifiedAttributes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoVerifiedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoVerifiedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoVerifiedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceConfiguration(value: Input[UserPoolDeviceConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailConfiguration(value: Input[UserPoolEmailConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailVerificationMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerificationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailVerificationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerificationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailVerificationSubject(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerificationSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailVerificationSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerificationSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaConfig(value: Input[UserPoolLambdaConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMfaConfiguration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMfaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfaConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordPolicy(value: Input[UserPoolPasswordPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: Input[js.Array[Input[UserPoolSchema]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsAuthenticationMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsAuthenticationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsAuthenticationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsAuthenticationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsConfiguration(value: Input[UserPoolSmsConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsVerificationMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsVerificationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsVerificationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsVerificationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolAddOns(value: Input[UserPoolUserPoolAddOns]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolAddOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolAddOns")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameAttributes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationMessageTemplate(value: Input[UserPoolVerificationMessageTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMessageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMessageTemplate")(js.undefined)
        ret
    }
  }
  
}

