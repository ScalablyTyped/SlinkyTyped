package typingsSlinky.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenSetParameters
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * The raw access token in JWT format
    */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * When the token set was received the expires_at field was calculated based on current timestamp
    * and the expires_in. When recalling a TokenSet instance just the expires_at should be passed in.
    */
  var expires_at: js.UndefOr[Double] = js.native
  
  /**
    * The raw id token in JWT format
    */
  var id_token: js.UndefOr[String] = js.native
  
  /**
    * Refresh token, opaque string value
    */
  var refresh_token: js.UndefOr[String] = js.native
  
  /**
    * space-separated scope(s) used for the authentication request
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * State value passed in the authentication request
    */
  var session_state: js.UndefOr[String] = js.native
  
  /**
    * Usually "Bearer"
    */
  var token_type: js.UndefOr[String] = js.native
}
object TokenSetParameters {
  
  @scala.inline
  def apply(): TokenSetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenSetParameters]
  }
  
  @scala.inline
  implicit class TokenSetParametersMutableBuilder[Self <: TokenSetParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    
    @scala.inline
    def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    @scala.inline
    def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
  }
}
