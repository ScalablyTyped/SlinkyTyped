package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.Direct
  - typingsSlinky.chromeApps.chromeAppsStrings.Manual
  - typingsSlinky.chromeApps.chromeAppsStrings.PAC
  - typingsSlinky.chromeApps.chromeAppsStrings.WPAD
*/
trait ProxySettingsType extends js.Object

object ProxySettingsType {
  @scala.inline
  def Direct: typingsSlinky.chromeApps.chromeAppsStrings.Direct = this.cast("Direct")
  @scala.inline
  def Manual: typingsSlinky.chromeApps.chromeAppsStrings.Manual = this.cast("Manual")
  @scala.inline
  def PAC: typingsSlinky.chromeApps.chromeAppsStrings.PAC = this.cast("PAC")
  @scala.inline
  def WPAD: typingsSlinky.chromeApps.chromeAppsStrings.WPAD = this.cast("WPAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

