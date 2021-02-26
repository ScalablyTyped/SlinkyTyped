package typingsSlinky.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenInfo extends StObject {
  
  /**
    * Indicates whether your application can refresh access tokens
    * when the user is not present at the browser. Valid parameter values are
    * 'online', which is the default value, and 'offline'. Set the value to
    * 'offline' if your application needs to refresh access tokens when the user
    * is not present at the browser. This value instructs the Google
    * authorization server to return a refresh token and an access token the
    * first time that your application exchanges an authorization code for
    * tokens.
    */
  var access_type: js.UndefOr[String] = js.native
  
  /**
    * The application that is the intended user of the access token.
    */
  var aud: String = js.native
  
  /**
    * The client_id of the authorized presenter. This claim is only needed when
    * the party requesting the ID token is not the same as the audience of the ID
    * token. This may be the case at Google for hybrid apps where a web
    * application and Android app have a different client_id but share the same
    * project.
    */
  var azp: js.UndefOr[String] = js.native
  
  /**
    * The user's email address. This value may not be unique to this user and
    * is not suitable for use as a primary key. Provided only if your scope
    * included the email scope value.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * True if the user's e-mail address has been verified; otherwise false.
    */
  var email_verified: js.UndefOr[Boolean] = js.native
  
  /**
    * The datetime when the token becomes invalid.
    */
  var expiry_date: Double = js.native
  
  /**
    * An array of scopes that the user granted access to.
    */
  var scopes: js.Array[String] = js.native
  
  /**
    * An identifier for the user, unique among all Google accounts and never
    * reused. A Google account can have multiple emails at different points in
    * time, but the sub value is never changed. Use sub within your application
    * as the unique-identifier key for the user.
    */
  var sub: js.UndefOr[String] = js.native
  
  /**
    * This value lets you correlate profile information from multiple Google
    * APIs. It is only present in the response if you included the profile scope
    * in your request in step 1. The field value is an immutable identifier for
    * the logged-in user that can be used to create and manage user sessions in
    * your application. The identifier is the same regardless of which client ID
    * is used to retrieve it. This enables multiple applications in the same
    * organization to correlate profile information.
    */
  var user_id: js.UndefOr[String] = js.native
}
object TokenInfo {
  
  @scala.inline
  def apply(aud: String, expiry_date: Double, scopes: js.Array[String]): TokenInfo = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], expiry_date = expiry_date.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  
  @scala.inline
  implicit class TokenInfoMutableBuilder[Self <: TokenInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_type(value: String): Self = StObject.set(x, "access_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_typeUndefined: Self = StObject.set(x, "access_type", js.undefined)
    
    @scala.inline
    def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    @scala.inline
    def setExpiry_date(value: Double): Self = StObject.set(x, "expiry_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
