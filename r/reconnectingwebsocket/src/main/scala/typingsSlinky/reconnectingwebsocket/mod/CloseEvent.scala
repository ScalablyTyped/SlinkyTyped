package typingsSlinky.reconnectingwebsocket.mod

import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.close
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEvent
  extends CustomEvent[js.Any] {
  @JSName("type")
  var type_CloseEvent: close = js.native
}

