package typingsSlinky.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "TcpTransport")
@js.native
class TcpTransport ()
  extends typingsSlinky.ndnJs.transportMod.TcpTransport
object TcpTransport {
  
  @JSImport("ndn-js", "TcpTransport.ConnectionInfo")
  @js.native
  class ConnectionInfo protected ()
    extends typingsSlinky.ndnJs.transportMod.TcpTransport.ConnectionInfo {
    def this(host: String, port: Double) = this()
  }
}
