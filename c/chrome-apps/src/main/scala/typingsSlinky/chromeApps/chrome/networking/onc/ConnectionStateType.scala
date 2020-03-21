package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.Connected
  - typingsSlinky.chromeApps.chromeAppsStrings.Connecting
  - typingsSlinky.chromeApps.chromeAppsStrings.NotConnected
*/
trait ConnectionStateType extends js.Object

object ConnectionStateType {
  @scala.inline
  def Connected: typingsSlinky.chromeApps.chromeAppsStrings.Connected = this.cast("Connected")
  @scala.inline
  def Connecting: typingsSlinky.chromeApps.chromeAppsStrings.Connecting = this.cast("Connecting")
  @scala.inline
  def NotConnected: typingsSlinky.chromeApps.chromeAppsStrings.NotConnected = this.cast("NotConnected")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

