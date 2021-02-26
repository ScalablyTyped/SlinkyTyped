package typingsSlinky.cookieSession

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cookieSession.cookieSessionStrings.lax
import typingsSlinky.cookieSession.cookieSessionStrings.none
import typingsSlinky.cookieSession.cookieSessionStrings.strict
import typingsSlinky.keygrip.mod.Keygrip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CookieSessionInterfaces {
  
  @js.native
  trait CookieSessionObject
    extends /* propertyName */ StringDictionary[js.Any] {
    
    /**
      * Is true if the session has been changed during the request.
      */
    var isChanged: js.UndefOr[Boolean] = js.native
    
    /**
      * Is true if the session is new.
      */
    var isNew: js.UndefOr[Boolean] = js.native
    
    /**
      * Determine if the session has been populated with data or is empty.
      */
    var isPopulated: js.UndefOr[Boolean] = js.native
  }
  object CookieSessionObject {
    
    @scala.inline
    def apply(): CookieSessionObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSessionObject]
    }
    
    @scala.inline
    implicit class CookieSessionObjectMutableBuilder[Self <: CookieSessionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsChanged(value: Boolean): Self = StObject.set(x, "isChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChangedUndefined: Self = StObject.set(x, "isChanged", js.undefined)
      
      @scala.inline
      def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNewUndefined: Self = StObject.set(x, "isNew", js.undefined)
      
      @scala.inline
      def setIsPopulated(value: Boolean): Self = StObject.set(x, "isPopulated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPopulatedUndefined: Self = StObject.set(x, "isPopulated", js.undefined)
    }
  }
  
  @js.native
  trait CookieSessionOptions extends StObject {
    
    /**
      * a string indicating the domain of the cookie (no default).
      */
    var domain: js.UndefOr[String] = js.native
    
    /**
      * a Date object indicating the cookie's expiration date (expires at the end of session by default).
      */
    var expires: js.UndefOr[js.Date] = js.native
    
    /**
      * a boolean indicating whether the cookie is only to be sent over HTTP(S), and not made available to client JavaScript (true by default).
      */
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * The list of keys to use to sign & verify cookie values. Set cookies are always signed with keys[0], while the other keys are valid for verification, allowing for key rotation.
      */
    var keys: js.UndefOr[js.Array[String] | Keygrip] = js.native
    
    /**
      * a number representing the milliseconds from Date.now() for expiry.
      */
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
      * The name of the cookie to set, defaults to session.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * a boolean indicating whether to overwrite previously set cookies of the same name (true by default). If this is true, all cookies set during the same request with the same name (regardless of path or domain) are filtered out of the Set-Cookie header when setting this cookie.
      */
    var overwrite: js.UndefOr[Boolean] = js.native
    
    /**
      * a string indicating the path of the cookie (/ by default).
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * a boolean or string indicating whether the cookie is a "same site" cookie (false by default). This can be set to 'strict', 'lax', 'none', or true (which maps to 'strict').
      */
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.native
    
    /**
      * A string which will be used as single key if keys is not provided.
      */
    var secret: js.UndefOr[String] = js.native
    
    /**
      * a boolean indicating whether the cookie is only to be sent over HTTPS (false by default for HTTP, true by default for HTTPS).
      */
    var secure: js.UndefOr[Boolean] = js.native
    
    /**
      * a boolean indicating whether the cookie is only to be sent over HTTPS (use this if you handle SSL not in your node process).
      */
    var secureProxy: js.UndefOr[Boolean] = js.native
    
    /**
      * a boolean indicating whether the cookie is to be signed (true by default). If this is true, another cookie of the same name with the .sig suffix appended will also be sent, with a 27-byte url-safe base64 SHA1 value representing the hash of cookie-name=cookie-value against the
      * first Keygrip key. This signature key is used to detect tampering the next time a cookie is received.
      */
    var signed: js.UndefOr[Boolean] = js.native
  }
  object CookieSessionOptions {
    
    @scala.inline
    def apply(): CookieSessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSessionOptions]
    }
    
    @scala.inline
    implicit class CookieSessionOptionsMutableBuilder[Self <: CookieSessionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[String] | Keygrip): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: strict | lax | none | Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  @js.native
  trait CookieSessionRequest extends StObject {
    
    /**
      * Represents the session for the given request.
      */
    var session: CookieSessionObject | Null = js.native
    
    /**
      * Represents the session options for the current request. These options are a shallow clone of what was provided at middleware construction and can be altered to change cookie setting behavior on a per-request basis.
      */
    var sessionOptions: CookieSessionOptions = js.native
  }
  object CookieSessionRequest {
    
    @scala.inline
    def apply(sessionOptions: CookieSessionOptions): CookieSessionRequest = {
      val __obj = js.Dynamic.literal(sessionOptions = sessionOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieSessionRequest]
    }
    
    @scala.inline
    implicit class CookieSessionRequestMutableBuilder[Self <: CookieSessionRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: CookieSessionObject): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionNull: Self = StObject.set(x, "session", null)
      
      @scala.inline
      def setSessionOptions(value: CookieSessionOptions): Self = StObject.set(x, "sessionOptions", value.asInstanceOf[js.Any])
    }
  }
}
