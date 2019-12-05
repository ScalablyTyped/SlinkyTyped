package typingsSlinky.chromeDashApps.chrome.sockets.tcp

import typingsSlinky.chromeDashApps.chrome.integer
import typingsSlinky.chromeDashApps.chrome.sockets.SocketProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcp.update")
@js.native
object update extends js.Object {
  /** Updates the socket properties. */
  def apply(socketId: integer, properties: SocketProperties): Unit = js.native
  def apply(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = js.native
}

