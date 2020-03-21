package typingsSlinky.firefoxWebextBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extension types */
/** The type of extension view. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
*/
trait ViewType extends js.Object

object ViewType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
}

