package typingsSlinky.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.socket.write")
@js.native
object write extends js.Object {
  def apply(socketId: Double, data: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  def apply(
    socketId: Double,
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function1[/* writeInfo */ WriteInfo, Unit]
  ): Unit = js.native
}

