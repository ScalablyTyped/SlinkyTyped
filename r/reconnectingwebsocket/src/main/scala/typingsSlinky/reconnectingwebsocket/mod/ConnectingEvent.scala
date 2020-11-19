package typingsSlinky.reconnectingwebsocket.mod

import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.connecting
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectingEvent
  extends CustomEvent[js.Any] {
  
  var code: Double = js.native
  
  var reason: String = js.native
  
  @JSName("type")
  var type_ConnectingEvent: connecting = js.native
  
  var wasClean: Boolean = js.native
}
