package typingsSlinky.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.audio
  - typings.chromeDashApps.chromeDashAppsStrings.networkingDOTonc
  - typings.chromeDashApps.chromeDashAppsStrings.systemDOTpowerSource
  - typings.chromeDashApps.chromeDashAppsStrings.virtualKeyboard
*/
trait KioskOnlyPermissions extends Permission

object KioskOnlyPermissions {
  @scala.inline
  def audio: typingsSlinky.chromeDashApps.chromeDashAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def networkingDOTonc: typingsSlinky.chromeDashApps.chromeDashAppsStrings.networkingDOTonc = this.cast("networking.onc")
  @scala.inline
  def systemDOTpowerSource: typingsSlinky.chromeDashApps.chromeDashAppsStrings.systemDOTpowerSource = this.cast("system.powerSource")
  @scala.inline
  def virtualKeyboard: typingsSlinky.chromeDashApps.chromeDashAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
}

