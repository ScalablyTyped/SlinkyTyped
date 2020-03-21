package typingsSlinky.chromeApps.chrome.bluetoothSocket

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.send")
@js.native
object send extends js.Object {
  /**
    * Sends data on the given Bluetooth socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param [callback] Called with the number of bytes sent.
    */
  def apply(socketId: integer, data: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  def apply(
    socketId: integer,
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function1[/* bytesSent */ integer, Unit]
  ): Unit = js.native
}

