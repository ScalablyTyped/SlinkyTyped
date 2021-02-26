package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignUpRequest extends StObject {
  
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for SignUp calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.native
  
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType = js.native
  
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the SignUp API action, Amazon Cognito invokes any functions that are assigned to the following triggers: pre sign-up, custom message, and post confirmation. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your SignUp request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  
  /**
    * The password of the user you wish to register.
    */
  var Password: PasswordType = js.native
  
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.native
  
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.native
  
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.native
  
  /**
    * The user name of the user you wish to register.
    */
  var Username: UsernameType = js.native
  
  /**
    * The validation data in the request to register a user.
    */
  var ValidationData: js.UndefOr[AttributeListType] = js.native
}
object SignUpRequest {
  
  @scala.inline
  def apply(ClientId: ClientIdType, Password: PasswordType, Username: UsernameType): SignUpRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpRequest]
  }
  
  @scala.inline
  implicit class SignUpRequestMutableBuilder[Self <: SignUpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = StObject.set(x, "AnalyticsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsMetadataUndefined: Self = StObject.set(x, "AnalyticsMetadata", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: ClientMetadataType): Self = StObject.set(x, "ClientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "ClientMetadata", js.undefined)
    
    @scala.inline
    def setPassword(value: PasswordType): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretHash(value: SecretHashType): Self = StObject.set(x, "SecretHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretHashUndefined: Self = StObject.set(x, "SecretHash", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: AttributeListType): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    
    @scala.inline
    def setUserAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "UserAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserContextData(value: UserContextDataType): Self = StObject.set(x, "UserContextData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserContextDataUndefined: Self = StObject.set(x, "UserContextData", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationData(value: AttributeListType): Self = StObject.set(x, "ValidationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationDataUndefined: Self = StObject.set(x, "ValidationData", js.undefined)
    
    @scala.inline
    def setValidationDataVarargs(value: AttributeType*): Self = StObject.set(x, "ValidationData", js.Array(value :_*))
  }
}
