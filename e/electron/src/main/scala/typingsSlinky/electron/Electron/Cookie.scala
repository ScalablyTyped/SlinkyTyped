package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.lax
import typingsSlinky.electron.electronStrings.no_restriction
import typingsSlinky.electron.electronStrings.strict
import typingsSlinky.electron.electronStrings.unspecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cookie extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/cookie
  /**
    * The domain of the cookie; this will be normalized with a preceding dot so that
    * it's also valid for subdomains.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The expiration date of the cookie as the number of seconds since the UNIX epoch.
    * Not provided for session cookies.
    */
  var expirationDate: js.UndefOr[Double] = js.native
  
  /**
    * Whether the cookie is a host-only cookie; this will only be `true` if no domain
    * was passed.
    */
  var hostOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the cookie is marked as HTTP only.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the cookie.
    */
  var name: String = js.native
  
  /**
    * The path of the cookie.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The Same Site policy applied to this cookie.  Can be `unspecified`,
    * `no_restriction`, `lax` or `strict`.
    */
  var sameSite: unspecified | no_restriction | lax | strict = js.native
  
  /**
    * Whether the cookie is marked as secure.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the cookie is a session cookie or a persistent cookie with an expiration
    * date.
    */
  var session: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the cookie.
    */
  var value: String = js.native
}
object Cookie {
  
  @scala.inline
  def apply(name: String, sameSite: unspecified | no_restriction | lax | strict, value: String): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostOnlyUndefined: Self = StObject.set(x, "hostOnly", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSameSite(value: unspecified | no_restriction | lax | strict): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
