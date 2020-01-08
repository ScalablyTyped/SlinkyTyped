package typingsSlinky.awsDashSdk

import typingsSlinky.awsDashSdk.clientsCognitoidentityMod.GetCredentialsForIdentityResponse
import typingsSlinky.awsDashSdk.clientsCognitoidentityMod.GetIdInput
import typingsSlinky.awsDashSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
import typingsSlinky.awsDashSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
import typingsSlinky.awsDashSdk.clientsStsMod.AssumeRoleWithWebIdentityResponse
import typingsSlinky.awsDashSdk.libConfigMod.ConfigurationOptions
import typingsSlinky.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsSlinky.awsDashSdk.libCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", JSImport.Namespace)
@js.native
object libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod extends js.Object {
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
      - typings.awsDashSdk.clientsCognitoidentityMod.GetIdInput
      - typings.awsDashSdk.clientsCognitoidentityMod.GetCredentialsForIdentityInput
      - typings.awsDashSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
      - typings.awsDashSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends js.Object
    
    type ClientConfiguration = ConfigurationOptions
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with Anon_LoginId
  }
  
}

