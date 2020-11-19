package typingsSlinky.chromeApps.WebView.Events

import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * String indicating the reason for the exit.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.normal_
  - typingsSlinky.chromeApps.chromeAppsStrings.abnormal
  - typingsSlinky.chromeApps.chromeAppsStrings.crash
  - typingsSlinky.chromeApps.chromeAppsStrings.kill
*/
trait ExitEventReason extends js.Object
object ExitEventReason {
  
  @scala.inline
  def abnormal: typingsSlinky.chromeApps.chromeAppsStrings.abnormal = "abnormal".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.abnormal]
  
  @scala.inline
  def crash: typingsSlinky.chromeApps.chromeAppsStrings.crash = "crash".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.crash]
  
  @scala.inline
  def kill: typingsSlinky.chromeApps.chromeAppsStrings.kill = "kill".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.kill]
  
  @scala.inline
  def normal: normal_ = "normal".asInstanceOf[normal_]
}
