package typingsSlinky.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.onBeforeRequest
  - typings.chromeDashApps.chromeDashAppsStrings.onBeforeSendHeaders
  - typings.chromeDashApps.chromeDashAppsStrings.onHeadersReceived
  - typings.chromeDashApps.chromeDashAppsStrings.onAuthRequired
*/
trait Stage extends js.Object

object Stage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAuthRequired: typingsSlinky.chromeDashApps.chromeDashAppsStrings.onAuthRequired = this.cast("onAuthRequired")
  @scala.inline
  def onBeforeRequest: typingsSlinky.chromeDashApps.chromeDashAppsStrings.onBeforeRequest = this.cast("onBeforeRequest")
  @scala.inline
  def onBeforeSendHeaders: typingsSlinky.chromeDashApps.chromeDashAppsStrings.onBeforeSendHeaders = this.cast("onBeforeSendHeaders")
  @scala.inline
  def onHeadersReceived: typingsSlinky.chromeDashApps.chromeDashAppsStrings.onHeadersReceived = this.cast("onHeadersReceived")
}

