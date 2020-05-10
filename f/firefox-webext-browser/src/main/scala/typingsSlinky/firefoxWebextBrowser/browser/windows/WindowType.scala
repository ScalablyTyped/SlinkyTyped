package typingsSlinky.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* windows types */
/**
  * The type of browser window this is. Under some circumstances a Window may not be assigned type property, for
  * example when querying closed windows from the `sessions` API.
  */
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
  def app: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = "app".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app]
  @scala.inline
  def devtools: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = "devtools".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools]
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
  @scala.inline
  def panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
  @scala.inline
  def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
}

