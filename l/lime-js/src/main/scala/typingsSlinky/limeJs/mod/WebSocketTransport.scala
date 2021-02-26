package typingsSlinky.limeJs.mod

import org.scalajs.dom.raw.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "WebSocketTransport")
@js.native
class WebSocketTransport () extends Transport {
  def this(traceEnabled: Boolean) = this()
  
  var webSocket: WebSocket = js.native
}
