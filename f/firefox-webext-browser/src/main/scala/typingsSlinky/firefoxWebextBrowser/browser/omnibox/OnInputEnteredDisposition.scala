package typingsSlinky.firefoxWebextBrowser.browser.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The window disposition for the omnibox query. This is the recommended context to display results. For example, if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation should take place in a new selected tab.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object
object OnInputEnteredDisposition {
  
  @scala.inline
  def currentTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab = "currentTab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.currentTab]
  
  @scala.inline
  def newBackgroundTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newBackgroundTab]
  
  @scala.inline
  def newForegroundTab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newForegroundTab]
}
