package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking
*/
trait OnBeforeSendHeadersOptions extends js.Object

object OnBeforeSendHeadersOptions {
  @scala.inline
  def blocking: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.blocking = this.cast("blocking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def requestHeaders: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders = this.cast("requestHeaders")
}

