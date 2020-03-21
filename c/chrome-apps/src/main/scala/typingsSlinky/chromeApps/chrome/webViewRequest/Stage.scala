package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.onBeforeRequest
  - typingsSlinky.chromeApps.chromeAppsStrings.onBeforeSendHeaders
  - typingsSlinky.chromeApps.chromeAppsStrings.onHeadersReceived
  - typingsSlinky.chromeApps.chromeAppsStrings.onAuthRequired
*/
trait Stage extends js.Object

object Stage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAuthRequired: typingsSlinky.chromeApps.chromeAppsStrings.onAuthRequired = this.cast("onAuthRequired")
  @scala.inline
  def onBeforeRequest: typingsSlinky.chromeApps.chromeAppsStrings.onBeforeRequest = this.cast("onBeforeRequest")
  @scala.inline
  def onBeforeSendHeaders: typingsSlinky.chromeApps.chromeAppsStrings.onBeforeSendHeaders = this.cast("onBeforeSendHeaders")
  @scala.inline
  def onHeadersReceived: typingsSlinky.chromeApps.chromeAppsStrings.onHeadersReceived = this.cast("onHeadersReceived")
}

