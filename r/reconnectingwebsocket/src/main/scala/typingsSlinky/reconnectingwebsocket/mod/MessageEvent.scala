package typingsSlinky.reconnectingwebsocket.mod

import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.message
import typingsSlinky.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEvent
  extends CustomEvent[js.Any] {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: reconnectingwebsocket.reconnectingwebsocket.GlobalMessageEvent['data'] */ js.Any = js.native
  
  @JSName("type")
  var type_MessageEvent: message = js.native
}
