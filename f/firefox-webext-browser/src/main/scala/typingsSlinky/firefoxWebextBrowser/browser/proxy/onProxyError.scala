package typingsSlinky.firefoxWebextBrowser.browser.proxy

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Please use `proxy.onError`.
  * @deprecated proxy.onProxyError has been deprecated and will be removed in Firefox 71\. Use proxy.onError instead.
  */
@JSGlobal("browser.proxy.onProxyError")
@js.native
object onProxyError
  extends TopLevel[WebExtEvent[js.Function1[/* error */ Error, Unit]]]

