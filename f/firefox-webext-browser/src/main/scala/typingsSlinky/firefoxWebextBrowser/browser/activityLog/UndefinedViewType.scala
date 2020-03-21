package typingsSlinky.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of view where the activity occurred. Content scripts will not have a viewType. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.background
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel
*/
trait UndefinedViewType extends js.Object

object UndefinedViewType {
  @scala.inline
  def background: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.background = this.cast("background")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devtools_page: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_page = this.cast("devtools_page")
  @scala.inline
  def devtools_panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools_panel = this.cast("devtools_panel")
  @scala.inline
  def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = this.cast("popup")
  @scala.inline
  def sidebar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = this.cast("sidebar")
  @scala.inline
  def tab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
}

