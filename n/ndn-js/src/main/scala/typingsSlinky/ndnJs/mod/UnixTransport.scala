package typingsSlinky.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "UnixTransport")
@js.native
class UnixTransport ()
  extends typingsSlinky.ndnJs.transportMod.Transport
@JSImport("ndn-js", "UnixTransport")
@js.native
object UnixTransport extends js.Object {
  
  @js.native
  class ConnectionInfo protected ()
    extends typingsSlinky.ndnJs.transportMod.UnixTransport.ConnectionInfo {
    def this(filePath: String) = this()
  }
}
