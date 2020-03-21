package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityResponse
import typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput
import typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
import typingsSlinky.awsSdk.configMod.ConfigurationOptions
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", JSImport.Namespace)
@js.native
object cognitoIdentityCredentialsMod extends js.Object {
  @js.native
  /**
    * Creates a new credentials object.
    */
  class CognitoIdentityCredentials () extends Credentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
    /**
      * The raw data response from the call to AWS.CognitoIdentity.getCredentialsForIdentity(), or AWS.STS.assumeRoleWithWebIdentity().
      */
    var data: GetCredentialsForIdentityResponse | AssumeRoleWithWebIdentityResponse = js.native
    /**
      * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
      */
    var identityId: String = js.native
    /**
      * The map of params passed to AWS.CognitoIdentity.getId(), AWS.CognitoIdentity.getOpenIdToken(), and AWS.STS.assumeRoleWithWebIdentity().
      */
    var params: GetIdInput | GetOpenIdTokenInput | AssumeRoleWithWebIdentityRequest = js.native
    /**
      * Clears the cached Cognito ID associated with the currently configured identity pool ID.
      */
    def clearCachedId(): Unit = js.native
  }
  
  // Needed to expose interfaces on the class
  @js.native
  object CognitoIdentityCredentials extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput
      - typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput
      - typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
      - typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends js.Object
    
    type ClientConfiguration = ConfigurationOptions
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with AnonLoginId
  }
  
}

