package typingsSlinky.reconnectingwebsocket.mod

import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.open
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenEvent
  extends CustomEvent[js.UndefOr[scala.Nothing]] {
  
  var isReconnect: Boolean = js.native
  
  @JSName("type")
  var type_OpenEvent: open = js.native
}
