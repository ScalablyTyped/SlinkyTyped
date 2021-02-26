package typingsSlinky.octokitAuthToken

import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.app
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.installation
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.oauth
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.token
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnyResponse = OctokitResponse[js.Any]
  
  @js.native
  trait AppAuthentication extends Authentication {
    
    var token: Token = js.native
    
    var tokenType: app = js.native
    
    var `type`: token = js.native
  }
  object AppAuthentication {
    
    @scala.inline
    def apply(token: Token, tokenType: app, `type`: token): AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppAuthentication]
    }
    
    @scala.inline
    implicit class AppAuthenticationMutableBuilder[Self <: AppAuthentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: app): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.octokitAuthToken.typesMod.OAuthTokenAuthentication
    - typingsSlinky.octokitAuthToken.typesMod.InstallationTokenAuthentication
    - typingsSlinky.octokitAuthToken.typesMod.AppAuthentication
  */
  trait Authentication extends StObject
  object Authentication {
    
    @scala.inline
    def AppAuthentication(token: Token, tokenType: app, `type`: token): typingsSlinky.octokitAuthToken.typesMod.AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.octokitAuthToken.typesMod.AppAuthentication]
    }
    
    @scala.inline
    def InstallationTokenAuthentication(token: Token, tokenType: installation, `type`: token): typingsSlinky.octokitAuthToken.typesMod.InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.octokitAuthToken.typesMod.InstallationTokenAuthentication]
    }
    
    @scala.inline
    def OAuthTokenAuthentication(token: Token, tokenType: oauth, `type`: token): typingsSlinky.octokitAuthToken.typesMod.OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.octokitAuthToken.typesMod.OAuthTokenAuthentication]
    }
  }
  
  type EndpointDefaults = typingsSlinky.octokitTypes.endpointDefaultsMod.EndpointDefaults
  
  type EndpointOptions = typingsSlinky.octokitTypes.endpointOptionsMod.EndpointOptions
  
  @js.native
  trait InstallationTokenAuthentication extends Authentication {
    
    var token: Token = js.native
    
    var tokenType: installation = js.native
    
    var `type`: token = js.native
  }
  object InstallationTokenAuthentication {
    
    @scala.inline
    def apply(token: Token, tokenType: installation, `type`: token): InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallationTokenAuthentication]
    }
    
    @scala.inline
    implicit class InstallationTokenAuthenticationMutableBuilder[Self <: InstallationTokenAuthentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: installation): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuthTokenAuthentication extends Authentication {
    
    var token: Token = js.native
    
    var tokenType: oauth = js.native
    
    var `type`: token = js.native
  }
  object OAuthTokenAuthentication {
    
    @scala.inline
    def apply(token: Token, tokenType: oauth, `type`: token): OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthTokenAuthentication]
    }
    
    @scala.inline
    implicit class OAuthTokenAuthenticationMutableBuilder[Self <: OAuthTokenAuthentication] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: oauth): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestInterface = typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface[js.Object]
  
  type RequestParameters = typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
  
  type Route = typingsSlinky.octokitTypes.routeMod.Route
  
  type StrategyInterface = typingsSlinky.octokitTypes.strategyInterfaceMod.StrategyInterface[js.Array[Token], js.Array[js.Any], Authentication]
  
  type Token = String
}
