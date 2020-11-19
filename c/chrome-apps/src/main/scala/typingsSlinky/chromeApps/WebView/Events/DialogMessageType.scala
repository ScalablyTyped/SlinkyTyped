package typingsSlinky.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of modal dialog requested by the guest.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.alert
  - typingsSlinky.chromeApps.chromeAppsStrings.confirm
  - typingsSlinky.chromeApps.chromeAppsStrings.prompt
*/
trait DialogMessageType extends js.Object
object DialogMessageType {
  
  @scala.inline
  def alert: typingsSlinky.chromeApps.chromeAppsStrings.alert = "alert".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.alert]
  
  @scala.inline
  def confirm: typingsSlinky.chromeApps.chromeAppsStrings.confirm = "confirm".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.confirm]
  
  @scala.inline
  def prompt: typingsSlinky.chromeApps.chromeAppsStrings.prompt = "prompt".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.prompt]
}
