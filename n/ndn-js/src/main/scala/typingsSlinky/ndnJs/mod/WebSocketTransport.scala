package typingsSlinky.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "WebSocketTransport")
@js.native
class WebSocketTransport ()
  extends typingsSlinky.ndnJs.transportMod.WebSocketTransport
object WebSocketTransport {
  
  @JSImport("ndn-js", "WebSocketTransport.ConnectionInfo")
  @js.native
  class ConnectionInfo protected ()
    extends typingsSlinky.ndnJs.transportMod.WebSocketTransport.ConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
  }
}
