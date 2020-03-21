package typingsSlinky.novncCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.novncCore.novncCoreStrings.connecting
  - typingsSlinky.novncCore.novncCoreStrings.connected
  - typingsSlinky.novncCore.novncCoreStrings.disconnecting
  - typingsSlinky.novncCore.novncCoreStrings.disconnected
*/
trait NvConnectionState extends js.Object

object NvConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.novncCore.novncCoreStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.novncCore.novncCoreStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsSlinky.novncCore.novncCoreStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsSlinky.novncCore.novncCoreStrings.disconnecting = this.cast("disconnecting")
}

