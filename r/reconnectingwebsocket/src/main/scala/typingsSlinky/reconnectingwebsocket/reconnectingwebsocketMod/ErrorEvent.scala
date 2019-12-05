package typingsSlinky.reconnectingwebsocket.reconnectingwebsocketMod

import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.error
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEvent
  extends CustomEvent[js.Any] {
  @JSName("type")
  var type_ErrorEvent: error = js.native
}

