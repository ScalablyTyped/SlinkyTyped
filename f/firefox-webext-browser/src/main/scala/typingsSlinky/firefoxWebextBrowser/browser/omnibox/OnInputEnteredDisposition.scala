package typingsSlinky.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The window disposition for the omnibox query. This is the recommended context to display results. For example,
  * if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation
  * should take place in a new selected tab.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab = this.cast("newForegroundTab")
}

