package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.anon.LoginId
import typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityResponse
import typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput
import typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
import typingsSlinky.awsSdk.cognitoidentityMod.IdentityId
import typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId
import typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions
import typingsSlinky.awsSdk.credentialsMod.Credentials
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityResponse
import typingsSlinky.awsSdk.stsMod.arnType
import typingsSlinky.awsSdk.stsMod.clientTokenType
import typingsSlinky.awsSdk.stsMod.roleSessionNameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognitoIdentityCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", "CognitoIdentityCredentials")
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
      * Clears the cached Cognito ID associated with the currently configured identity pool ID.
      */
    def clearCachedId(): Unit = js.native
    
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
  }
  // Needed to expose interfaces on the class
  object CognitoIdentityCredentials {
    
    type ClientConfiguration = ConfigurationOptions
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput
      - typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput
      - typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
      - typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
    */
    trait CognitoIdentityCredentialsInputs extends StObject
    object CognitoIdentityCredentialsInputs {
      
      @scala.inline
      def AssumeRoleWithWebIdentityRequest(RoleArn: arnType, RoleSessionName: roleSessionNameType, WebIdentityToken: clientTokenType): typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest = {
        val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest]
      }
      
      @scala.inline
      def GetCredentialsForIdentityInput(IdentityId: IdentityId): typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput]
      }
      
      @scala.inline
      def GetIdInput(IdentityPoolId: IdentityPoolId): typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput = {
        val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput]
      }
      
      @scala.inline
      def GetOpenIdTokenInput(IdentityId: IdentityId): typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput = {
        val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput]
      }
    }
    
    type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with LoginId
  }
}
