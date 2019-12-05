package typingsSlinky.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "UnixTransport")
@js.native
class UnixTransport ()
  extends typingsSlinky.ndnDashJs.transportMod.Transport

@JSImport("ndn-js", "UnixTransport")
@js.native
object UnixTransport extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typingsSlinky.ndnDashJs.transportMod.UnixTransport.ConnectionInfo {
    def this(filePath: String) = this()
  }
  
}

