package typingsSlinky.awsSdkCredentialProviderCognitoIdentity

import typingsSlinky.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typingsSlinky.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognitoProviderParametersMod {
  
  @js.native
  trait CognitoProviderParameters extends StObject {
    
    /**
      * The SDK client with which the credential provider will contact the Amazon
      * Cognito service.
      */
    var client: CognitoIdentityClient = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the role to be assumed when multiple
      * roles were received in the token from the identity provider. For example,
      * a SAML-based identity provider. This parameter is optional for identity
      * providers that do not support role customization.
      */
    var customRoleArn: js.UndefOr[String] = js.native
    
    /**
      * A set of key-value pairs that map external identity provider names to
      * login tokens or functions that return promises for login tokens. The
      * latter should be used when login tokens must be periodically refreshed.
      *
      * Logins should not be specified when trying to get credentials for an
      * unauthenticated identity.
      */
    var logins: js.UndefOr[Logins] = js.native
  }
  object CognitoProviderParameters {
    
    @scala.inline
    def apply(client: CognitoIdentityClient): CognitoProviderParameters = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoProviderParameters]
    }
    
    @scala.inline
    implicit class CognitoProviderParametersMutableBuilder[Self <: CognitoProviderParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: CognitoIdentityClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRoleArn(value: String): Self = StObject.set(x, "customRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRoleArnUndefined: Self = StObject.set(x, "customRoleArn", js.undefined)
      
      @scala.inline
      def setLogins(value: Logins): Self = StObject.set(x, "logins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginsUndefined: Self = StObject.set(x, "logins", js.undefined)
    }
  }
}
