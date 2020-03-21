package typingsSlinky.chromeApps.chrome.bluetoothSocket

import typingsSlinky.chromeApps.chromeAppsStrings.disconnected_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.disconnected_
  - typingsSlinky.chromeApps.chromeAppsStrings.system_error
  - typingsSlinky.chromeApps.chromeAppsStrings.not_connected
*/
trait OnReceiveErrorCode extends js.Object

object OnReceiveErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnected: disconnected_ = this.cast("disconnected")
  @scala.inline
  def not_connected: typingsSlinky.chromeApps.chromeAppsStrings.not_connected = this.cast("not_connected")
  @scala.inline
  def system_error: typingsSlinky.chromeApps.chromeAppsStrings.system_error = this.cast("system_error")
}

