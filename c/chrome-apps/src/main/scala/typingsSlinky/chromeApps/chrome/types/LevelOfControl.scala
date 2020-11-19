package typingsSlinky.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of
  * • not_controllable: cannot be controlled by any extension
  * • controlled_by_other_extensions: controlled by extensions with higher precedence
  * • controllable_by_this_extension: can be controlled by this app
  * • controlled_by_this_extension: controlled by this app
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.not_controllable
  - typingsSlinky.chromeApps.chromeAppsStrings.controlled_by_other_extensions
  - typingsSlinky.chromeApps.chromeAppsStrings.controllable_by_this_extension
  - typingsSlinky.chromeApps.chromeAppsStrings.controlled_by_this_extension
*/
trait LevelOfControl extends js.Object
object LevelOfControl {
  
  @scala.inline
  def controllable_by_this_extension: typingsSlinky.chromeApps.chromeAppsStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.controllable_by_this_extension]
  
  @scala.inline
  def controlled_by_other_extensions: typingsSlinky.chromeApps.chromeAppsStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.controlled_by_other_extensions]
  
  @scala.inline
  def controlled_by_this_extension: typingsSlinky.chromeApps.chromeAppsStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.controlled_by_this_extension]
  
  @scala.inline
  def not_controllable: typingsSlinky.chromeApps.chromeAppsStrings.not_controllable = "not_controllable".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.not_controllable]
}
