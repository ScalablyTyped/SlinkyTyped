package typingsSlinky.novncDashCore.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.novncDashCore.novncDashCoreStrings.connecting
  - typings.novncDashCore.novncDashCoreStrings.connected
  - typings.novncDashCore.novncDashCoreStrings.disconnecting
  - typings.novncDashCore.novncDashCoreStrings.disconnected
*/
trait NvConnectionState extends js.Object

object NvConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.novncDashCore.novncDashCoreStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.novncDashCore.novncDashCoreStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsSlinky.novncDashCore.novncDashCoreStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsSlinky.novncDashCore.novncDashCoreStrings.disconnecting = this.cast("disconnecting")
}

