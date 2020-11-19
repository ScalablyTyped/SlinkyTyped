package typingsSlinky.reconnectingwebsocket.mod

import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.error
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorEvent
  extends CustomEvent[js.Any] {
  
  @JSName("type")
  var type_ErrorEvent: error = js.native
}
