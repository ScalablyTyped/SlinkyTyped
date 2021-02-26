package typingsSlinky.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolCookies extends StObject {
  
  /**
    * Retrieve or delete all cookies visible to the current page or set a cookie. Normally this shouldn't be used directly, instead the cookie convenience methods should be used:
    * <code>getCookie</code>, <code>getCookies</code>, <code>setCookie</code>, <code>deleteCookie</code>, <code>deleteCookies</code>.
    *
    * @see getCookies
    * @see getCookie
    * @see setCookie
    * @see deleteCookie
    * @see deleteCookies
    */
  def cookie(method: String): this.type = js.native
  def cookie(method: String, callbackOrCookie: js.Function0[Unit]): this.type = js.native
}
