package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.insecure
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.weak
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.broken
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.secure
*/
trait SecurityInfoState extends js.Object

object SecurityInfoState {
  @scala.inline
  def broken: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insecure: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.insecure = this.cast("insecure")
  @scala.inline
  def secure: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.secure = this.cast("secure")
  @scala.inline
  def weak: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.weak = this.cast("weak")
}

