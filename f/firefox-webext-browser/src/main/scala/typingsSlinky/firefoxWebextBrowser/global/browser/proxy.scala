package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.proxy.OnRequestDetails
import typingsSlinky.firefoxWebextBrowser.browser.proxy.ProxyOnRequestEvent
import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to global proxy settings for Firefox and proxy event listeners to handle dynamic proxy implementations.
  *
  * Permissions: `proxy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.proxy")
@js.native
object proxy extends js.Object {
  
  /** Notifies about errors caused by the invalid use of the proxy API. */
  val onError: WebExtEvent[js.Function1[/* error */ js.Error, Unit]] = js.native
  
  /* proxy events */
  /** Fired when proxy data is needed for a request. */
  val onRequest: ProxyOnRequestEvent[js.Function1[/* details */ OnRequestDetails, Unit]] = js.native
  
  /* proxy properties */
  /** Configures proxy settings. This setting's value is an object of type ProxyConfig. */
  val settings: Setting = js.native
}
