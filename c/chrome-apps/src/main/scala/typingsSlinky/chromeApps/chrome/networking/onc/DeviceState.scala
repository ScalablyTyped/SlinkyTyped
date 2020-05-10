package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chromeAppsStrings.Disabled_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The current state of the device. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.Uninitialized
  - typingsSlinky.chromeApps.chromeAppsStrings.Disabled_
  - typingsSlinky.chromeApps.chromeAppsStrings.Enabling
  - typingsSlinky.chromeApps.chromeAppsStrings.Enabled
  - typingsSlinky.chromeApps.chromeAppsStrings.Prohibited
*/
trait DeviceState extends js.Object

object DeviceState {
  @scala.inline
  def Disabled: Disabled_ = "Disabled".asInstanceOf[Disabled_]
  @scala.inline
  def Enabled: typingsSlinky.chromeApps.chromeAppsStrings.Enabled = "Enabled".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.Enabled]
  @scala.inline
  def Enabling: typingsSlinky.chromeApps.chromeAppsStrings.Enabling = "Enabling".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.Enabling]
  @scala.inline
  def Prohibited: typingsSlinky.chromeApps.chromeAppsStrings.Prohibited = "Prohibited".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.Prohibited]
  @scala.inline
  def Uninitialized: typingsSlinky.chromeApps.chromeAppsStrings.Uninitialized = "Uninitialized".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.Uninitialized]
}

