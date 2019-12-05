package typingsSlinky.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of window. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.panel
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.app
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools
*/
trait WindowType extends js.Object

object WindowType {
  @scala.inline
  def app: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.devtools = this.cast("devtools")
  @scala.inline
  def normal: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup = this.cast("popup")
}

