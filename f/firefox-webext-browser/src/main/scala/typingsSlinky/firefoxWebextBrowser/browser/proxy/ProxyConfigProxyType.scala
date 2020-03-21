package typingsSlinky.firefoxWebextBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of proxy to use. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.system
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig
*/
trait ProxyConfigProxyType extends js.Object

object ProxyConfigProxyType {
  @scala.inline
  def autoConfig: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig = this.cast("autoConfig")
  @scala.inline
  def autoDetect: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect = this.cast("autoDetect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual = this.cast("manual")
  @scala.inline
  def none: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = this.cast("none")
  @scala.inline
  def system: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.system = this.cast("system")
}

