package typingsSlinky.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.Connected
  - typings.chromeDashApps.chromeDashAppsStrings.Connecting
  - typings.chromeDashApps.chromeDashAppsStrings.NotConnected
*/
trait ConnectionStateType extends js.Object

object ConnectionStateType {
  @scala.inline
  def Connected: typingsSlinky.chromeDashApps.chromeDashAppsStrings.Connected = this.cast("Connected")
  @scala.inline
  def Connecting: typingsSlinky.chromeDashApps.chromeDashAppsStrings.Connecting = this.cast("Connecting")
  @scala.inline
  def NotConnected: typingsSlinky.chromeDashApps.chromeDashAppsStrings.NotConnected = this.cast("NotConnected")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

