package typingsSlinky.chromeApps.chrome.sockets.tcp

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.sockets.SendInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.send")
@js.native
object send extends js.Object {
  /**
    * @description Sends data on the given TCP socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param callback Called when the send operation completes.
    */
  def apply(
    socketId: integer,
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ SendInfo, Unit]
  ): Unit = js.native
}

