package typingsSlinky.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless
  * the '--enable-panels' flag is set.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel
*/
trait CreateType extends js.Object
object CreateType {
  
  @scala.inline
  def detached_panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel = "detached_panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel]
  
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
  
  @scala.inline
  def panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
  
  @scala.inline
  def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
}
