package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.Unknown
  - typingsSlinky.chromeApps.chromeAppsStrings.Offline
  - typingsSlinky.chromeApps.chromeAppsStrings.Online
  - typingsSlinky.chromeApps.chromeAppsStrings.Portal
  - typingsSlinky.chromeApps.chromeAppsStrings.ProxyAuthRequired
*/
trait CaptivePortalStatus extends js.Object

object CaptivePortalStatus {
  @scala.inline
  def Offline: typingsSlinky.chromeApps.chromeAppsStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typingsSlinky.chromeApps.chromeAppsStrings.Online = this.cast("Online")
  @scala.inline
  def Portal: typingsSlinky.chromeApps.chromeAppsStrings.Portal = this.cast("Portal")
  @scala.inline
  def ProxyAuthRequired: typingsSlinky.chromeApps.chromeAppsStrings.ProxyAuthRequired = this.cast("ProxyAuthRequired")
  @scala.inline
  def Unknown: typingsSlinky.chromeApps.chromeAppsStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

