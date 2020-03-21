package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of window. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools
*/
trait WindowType extends js.Object

object WindowType {
  @scala.inline
  def app: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = this.cast("app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = this.cast("devtools")
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
}

