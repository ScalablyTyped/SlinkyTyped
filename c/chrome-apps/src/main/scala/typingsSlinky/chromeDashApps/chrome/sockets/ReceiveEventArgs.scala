package typingsSlinky.chromeDashApps.chrome.sockets

import typingsSlinky.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveEventArgs extends js.Object {
  /** The data received, with a maxium size of *bufferSize*. */
  var data: scala.scalajs.js.typedarray.ArrayBuffer
  /** The socket identifier. */
  var socketId: integer
}

object ReceiveEventArgs {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer, socketId: integer): ReceiveEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceiveEventArgs]
  }
}

