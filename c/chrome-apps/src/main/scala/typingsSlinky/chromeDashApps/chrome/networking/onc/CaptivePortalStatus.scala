package typingsSlinky.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.Unknown
  - typings.chromeDashApps.chromeDashAppsStrings.Offline
  - typings.chromeDashApps.chromeDashAppsStrings.Online
  - typings.chromeDashApps.chromeDashAppsStrings.Portal
  - typings.chromeDashApps.chromeDashAppsStrings.ProxyAuthRequired
*/
trait CaptivePortalStatus extends js.Object

object CaptivePortalStatus {
  @scala.inline
  def Offline: typingsSlinky.chromeDashApps.chromeDashAppsStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typingsSlinky.chromeDashApps.chromeDashAppsStrings.Online = this.cast("Online")
  @scala.inline
  def Portal: typingsSlinky.chromeDashApps.chromeDashAppsStrings.Portal = this.cast("Portal")
  @scala.inline
  def ProxyAuthRequired: typingsSlinky.chromeDashApps.chromeDashAppsStrings.ProxyAuthRequired = this.cast("ProxyAuthRequired")
  @scala.inline
  def Unknown: typingsSlinky.chromeDashApps.chromeDashAppsStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

