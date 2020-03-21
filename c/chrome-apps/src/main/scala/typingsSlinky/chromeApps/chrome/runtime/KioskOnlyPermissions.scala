package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.audio
  - typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc
  - typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard
*/
trait KioskOnlyPermissions extends Permission

object KioskOnlyPermissions {
  @scala.inline
  def audio: typingsSlinky.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def networkingDotonc: typingsSlinky.chromeApps.chromeAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def systemDotpowerSource: typingsSlinky.chromeApps.chromeAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def virtualKeyboard: typingsSlinky.chromeApps.chromeAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
}

