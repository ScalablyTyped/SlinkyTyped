package typingsSlinky.arangodb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.ArangoDB.HttpMethod
import typingsSlinky.arangodb.anon.Headers
import typingsSlinky.arangodb.arangodbStrings.PLAINTEXT
import typingsSlinky.arangodb.arangodbStrings.`HMAC-SHA1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth1Mod {
  
  @JSImport("@arangodb/foxx/oauth1", JSImport.Namespace)
  @js.native
  def apply(options: OAuth1Options): OAuth1Client = js.native
  
  @js.native
  trait OAuth1Client extends StObject {
    
    def createSignedRequest(
      method: HttpMethod,
      url: String,
      parameters: String,
      oauth_token: String,
      oauth_token_secret: String
    ): Headers = js.native
    def createSignedRequest(
      method: HttpMethod,
      url: String,
      parameters: StringDictionary[js.UndefOr[String]],
      oauth_token: String,
      oauth_token_secret: String
    ): Headers = js.native
    def createSignedRequest(method: HttpMethod, url: String, parameters: Null, oauth_token: String, oauth_token_secret: String): Headers = js.native
    
    def exchangeRequestToken(oauth_token: String, oauth_verifier: String): js.Any = js.native
    def exchangeRequestToken(oauth_token: String, oauth_verifier: String, qs: StringDictionary[js.UndefOr[String]]): js.Any = js.native
    
    def fetchActiveUser(oauth_token: String, oauth_token_secret: String): js.Any = js.native
    def fetchActiveUser(oauth_token: String, oauth_token_secret: String, qs: StringDictionary[js.UndefOr[String]]): js.Any = js.native
    
    def fetchRequestToken(oauth_callback: String): js.Any = js.native
    def fetchRequestToken(oauth_callback: String, qs: StringDictionary[js.UndefOr[String]]): js.Any = js.native
    
    def getAuthUrl(oauth_token: String): String = js.native
    def getAuthUrl(oauth_token: String, qs: StringDictionary[js.UndefOr[String]]): String = js.native
  }
  
  @js.native
  trait OAuth1Options extends StObject {
    
    var accessTokenEndpoint: String = js.native
    
    var activeUserEndpoint: js.UndefOr[String] = js.native
    
    var authEndpoint: String = js.native
    
    var clientId: String = js.native
    
    var clientSecret: String = js.native
    
    var requestTokenEndpoint: String = js.native
    
    var signatureMethod: js.UndefOr[`HMAC-SHA1` | PLAINTEXT] = js.native
  }
  object OAuth1Options {
    
    @scala.inline
    def apply(
      accessTokenEndpoint: String,
      authEndpoint: String,
      clientId: String,
      clientSecret: String,
      requestTokenEndpoint: String
    ): OAuth1Options = {
      val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], requestTokenEndpoint = requestTokenEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth1Options]
    }
    
    @scala.inline
    implicit class OAuth1OptionsMutableBuilder[Self <: OAuth1Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTokenEndpoint(value: String): Self = StObject.set(x, "accessTokenEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUserEndpoint(value: String): Self = StObject.set(x, "activeUserEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUserEndpointUndefined: Self = StObject.set(x, "activeUserEndpoint", js.undefined)
      
      @scala.inline
      def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTokenEndpoint(value: String): Self = StObject.set(x, "requestTokenEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureMethod(value: `HMAC-SHA1` | PLAINTEXT): Self = StObject.set(x, "signatureMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureMethodUndefined: Self = StObject.set(x, "signatureMethod", js.undefined)
    }
  }
}
