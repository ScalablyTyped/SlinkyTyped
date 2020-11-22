package typingsSlinky.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cookies types */
/**
  * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies). 'no_restriction' corresponds to a cookie set without a 'SameSite' attribute, 'lax' to 'SameSite=Lax', and 'strict' to 'SameSite=Strict'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict
*/
trait SameSiteStatus extends js.Object
object SameSiteStatus {
  
  @scala.inline
  def lax: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax = "lax".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.lax]
  
  @scala.inline
  def no_restriction: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction = "no_restriction".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_restriction]
  
  @scala.inline
  def strict: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict = "strict".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.strict]
}
