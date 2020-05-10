package typingsSlinky.firefoxWebextBrowser.browser.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and
  * 'tab' are supported. showDefaults cannot be used with this option.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
*/
trait OverrideContextContext extends js.Object

object OverrideContextContext {
  @scala.inline
  def bookmark: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
  @scala.inline
  def tab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
}

