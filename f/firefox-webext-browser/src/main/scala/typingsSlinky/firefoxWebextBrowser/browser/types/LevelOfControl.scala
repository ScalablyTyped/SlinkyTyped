package typingsSlinky.firefoxWebextBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of
  *
  * *   `not_controllable`: cannot be controlled by any extension
  * *   `controlled_by_other_extensions`: controlled by extensions with higher precedence
  * *   `controllable_by_this_extension`: can be controlled by this extension
  * *   `controlled_by_this_extension`: controlled by this extension
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension
*/
trait LevelOfControl extends js.Object
object LevelOfControl {
  
  @scala.inline
  def controllable_by_this_extension: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controllable_by_this_extension]
  
  @scala.inline
  def controlled_by_other_extensions: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_other_extensions]
  
  @scala.inline
  def controlled_by_this_extension: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.controlled_by_this_extension]
  
  @scala.inline
  def not_controllable: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable = "not_controllable".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_controllable]
}
