package typingsSlinky.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The underlying reason behind the cookie's change. If a cookie was inserted, or removed via an explicit call to
  * `cookies.remove`, "cause" will be "explicit". If a cookie was automatically removed due to expiry, "cause" will
  * be "expired". If a cookie was removed due to being overwritten with an already-expired expiration date, "cause"
  * will be set to "expired_overwrite". If a cookie was automatically removed due to garbage collection, "cause"
  * will be "evicted". If a cookie was automatically removed due to a "set" call that overwrote it, "cause" will be
  * "overwrite". Plan your response accordingly.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite
*/
trait OnChangedCause extends js.Object
object OnChangedCause {
  
  @scala.inline
  def evicted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted = "evicted".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.evicted]
  
  @scala.inline
  def expired: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired = "expired".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired]
  
  @scala.inline
  def expired_overwrite: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite = "expired_overwrite".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.expired_overwrite]
  
  @scala.inline
  def explicit: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit = "explicit".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.explicit]
  
  @scala.inline
  def overwrite: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite = "overwrite".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite]
}
