package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
*/
trait OnHeadersReceivedOptions extends js.Object

object OnHeadersReceivedOptions {
  @scala.inline
  def blocking: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def responseHeaders: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders = this.cast("responseHeaders")
}

