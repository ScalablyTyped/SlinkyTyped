package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.Uninitialized
  - typingsSlinky.chromeApps.chromeAppsStrings.Disabled
  - typingsSlinky.chromeApps.chromeAppsStrings.Enabling
  - typingsSlinky.chromeApps.chromeAppsStrings.Enabled
  - typingsSlinky.chromeApps.chromeAppsStrings.Prohibited
*/
trait DeviceState extends js.Object

object DeviceState {
  @scala.inline
  def Disabled: typingsSlinky.chromeApps.chromeAppsStrings.Disabled = this.cast("Disabled")
  @scala.inline
  def Enabled: typingsSlinky.chromeApps.chromeAppsStrings.Enabled = this.cast("Enabled")
  @scala.inline
  def Enabling: typingsSlinky.chromeApps.chromeAppsStrings.Enabling = this.cast("Enabling")
  @scala.inline
  def Prohibited: typingsSlinky.chromeApps.chromeAppsStrings.Prohibited = this.cast("Prohibited")
  @scala.inline
  def Uninitialized: typingsSlinky.chromeApps.chromeAppsStrings.Uninitialized = this.cast("Uninitialized")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

