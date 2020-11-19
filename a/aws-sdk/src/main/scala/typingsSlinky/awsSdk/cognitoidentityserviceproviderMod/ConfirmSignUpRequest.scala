package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmSignUpRequest extends js.Object {
  
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for ConfirmSignUp calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.native
  
  /**
    * The ID of the app client associated with the user pool.
    */
  var ClientId: ClientIdType = js.native
  
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the ConfirmSignUp API action, Amazon Cognito invokes the function that is assigned to the post confirmation trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your ConfirmSignUp request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  
  /**
    * The confirmation code sent by a user's request to confirm registration.
    */
  var ConfirmationCode: ConfirmationCodeType = js.native
  
  /**
    * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user being confirmed. If set to False, the API will throw an AliasExistsException error.
    */
  var ForceAliasCreation: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ForceAliasCreation] = js.native
  
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.native
  
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.native
  
  /**
    * The user name of the user whose registration you wish to confirm.
    */
  var Username: UsernameType = js.native
}
object ConfirmSignUpRequest {
  
  @scala.inline
  def apply(ClientId: ClientIdType, ConfirmationCode: ConfirmationCodeType, Username: UsernameType): ConfirmSignUpRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ConfirmationCode = ConfirmationCode.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSignUpRequest]
  }
  
  @scala.inline
  implicit class ConfirmSignUpRequestOps[Self <: ConfirmSignUpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationCode(value: ConfirmationCodeType): Self = this.set("ConfirmationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = this.set("AnalyticsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsMetadata: Self = this.set("AnalyticsMetadata", js.undefined)
    
    @scala.inline
    def setClientMetadata(value: ClientMetadataType): Self = this.set("ClientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("ClientMetadata", js.undefined)
    
    @scala.inline
    def setForceAliasCreation(value: ForceAliasCreation): Self = this.set("ForceAliasCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAliasCreation: Self = this.set("ForceAliasCreation", js.undefined)
    
    @scala.inline
    def setSecretHash(value: SecretHashType): Self = this.set("SecretHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretHash: Self = this.set("SecretHash", js.undefined)
    
    @scala.inline
    def setUserContextData(value: UserContextDataType): Self = this.set("UserContextData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserContextData: Self = this.set("UserContextData", js.undefined)
  }
}
