package typingsSlinky.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.authmosphere.anon.Code
import typingsSlinky.authmosphere.anon.RefreshToken
import typingsSlinky.authmosphere.anon.TokenInfoEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauthconfigMod {
  
  type AuthorizationCodeGrantConfig = CredentialsConfig with GrantConfigBase with Code
  
  type ClientCredentialsGrantConfig = CredentialsConfig with GrantConfigBase
  
  @js.native
  trait CredentialsClientConfig extends CredentialsConfig {
    
    var clientId: String = js.native
    
    var clientSecret: String = js.native
  }
  object CredentialsClientConfig {
    
    @scala.inline
    def apply(clientId: String, clientSecret: String): CredentialsClientConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsClientConfig]
    }
    
    @scala.inline
    implicit class CredentialsClientConfigMutableBuilder[Self <: CredentialsClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.authmosphere.oauthconfigMod.CredentialsDirConfig
    - typingsSlinky.authmosphere.oauthconfigMod.CredentialsClientConfig
  */
  trait CredentialsConfig extends StObject
  object CredentialsConfig {
    
    @scala.inline
    def CredentialsClientConfig(clientId: String, clientSecret: String): typingsSlinky.authmosphere.oauthconfigMod.CredentialsClientConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.authmosphere.oauthconfigMod.CredentialsClientConfig]
    }
    
    @scala.inline
    def CredentialsDirConfig(credentialsDir: String): typingsSlinky.authmosphere.oauthconfigMod.CredentialsDirConfig = {
      val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.authmosphere.oauthconfigMod.CredentialsDirConfig]
    }
  }
  
  @js.native
  trait CredentialsDirConfig extends CredentialsConfig {
    
    var credentialsDir: String = js.native
  }
  object CredentialsDirConfig {
    
    @scala.inline
    def apply(credentialsDir: String): CredentialsDirConfig = {
      val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsDirConfig]
    }
    
    @scala.inline
    implicit class CredentialsDirConfigMutableBuilder[Self <: CredentialsDirConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentialsDir(value: String): Self = StObject.set(x, "credentialsDir", value.asInstanceOf[js.Any])
    }
  }
  
  type CredentialsPasswordConfig = CredentialsDirConfig | CredentialsUserClientConfig
  
  type CredentialsUserClientConfig = CredentialsClientConfig with CredentialsUserConfig
  
  @js.native
  trait CredentialsUserConfig extends StObject {
    
    var applicationPassword: String = js.native
    
    var applicationUsername: String = js.native
  }
  object CredentialsUserConfig {
    
    @scala.inline
    def apply(applicationPassword: String, applicationUsername: String): CredentialsUserConfig = {
      val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsUserConfig]
    }
    
    @scala.inline
    implicit class CredentialsUserConfigMutableBuilder[Self <: CredentialsUserConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationPassword(value: String): Self = StObject.set(x, "applicationPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUsername(value: String): Self = StObject.set(x, "applicationUsername", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GrantConfigBase extends StObject {
    
    var accessTokenEndpoint: String = js.native
    
    var bodyParams: js.UndefOr[StringDictionary[String]] = js.native
    
    var grantType: String = js.native
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.native
    
    var scopes: js.UndefOr[js.Array[String]] = js.native
  }
  object GrantConfigBase {
    
    @scala.inline
    def apply(accessTokenEndpoint: String, grantType: String): GrantConfigBase = {
      val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrantConfigBase]
    }
    
    @scala.inline
    implicit class GrantConfigBaseMutableBuilder[Self <: GrantConfigBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTokenEndpoint(value: String): Self = StObject.set(x, "accessTokenEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyParams(value: StringDictionary[String]): Self = StObject.set(x, "bodyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyParamsUndefined: Self = StObject.set(x, "bodyParams", js.undefined)
      
      @scala.inline
      def setGrantType(value: String): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
  
  type OAuthConfig = ClientCredentialsGrantConfig | AuthorizationCodeGrantConfig | PasswordCredentialsGrantConfig | RefreshGrantConfig
  
  type PasswordCredentialsGrantConfig = CredentialsPasswordConfig with GrantConfigBase
  
  type RefreshGrantConfig = CredentialsConfig with GrantConfigBase with RefreshToken
  
  type TokenCacheOAuthConfig = (ClientCredentialsGrantConfig | PasswordCredentialsGrantConfig) with TokenInfoEndpoint
}
