package typingsSlinky.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "WebSocketTransport")
@js.native
class WebSocketTransport ()
  extends typingsSlinky.ndnJs.transportMod.Transport
@JSImport("ndn-js", "WebSocketTransport")
@js.native
object WebSocketTransport extends js.Object {
  
  @js.native
  class ConnectionInfo protected ()
    extends typingsSlinky.ndnJs.transportMod.WebSocketTransport.ConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
  }
}
