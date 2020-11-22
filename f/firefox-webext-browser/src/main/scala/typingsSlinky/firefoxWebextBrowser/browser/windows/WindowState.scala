package typingsSlinky.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state of this browser window. Under some circumstances a Window may not be assigned state property, for example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked
*/
trait WindowState extends js.Object
object WindowState {
  
  @scala.inline
  def docked: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = "docked".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked]
  
  @scala.inline
  def fullscreen: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = "fullscreen".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen]
  
  @scala.inline
  def maximized: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = "maximized".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized]
  
  @scala.inline
  def minimized: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = "minimized".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized]
  
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
}
