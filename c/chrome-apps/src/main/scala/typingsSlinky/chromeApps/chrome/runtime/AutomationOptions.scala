package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.chromeApps.chrome.runtime.AutomationDesktop
  - typingsSlinky.chromeApps.chrome.runtime.AutomationNonInteractive
*/
trait AutomationOptions extends js.Object

object AutomationOptions {
  @scala.inline
  implicit def apply(value: AutomationDesktop): AutomationOptions = value.asInstanceOf[AutomationOptions]
  @scala.inline
  implicit def apply(value: AutomationNonInteractive): AutomationOptions = value.asInstanceOf[AutomationOptions]
  @scala.inline
  implicit def apply(value: Boolean): AutomationOptions = value.asInstanceOf[AutomationOptions]
}

