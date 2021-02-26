package typingsSlinky.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "UnixTransport")
@js.native
class UnixTransport ()
  extends typingsSlinky.ndnJs.transportMod.UnixTransport
object UnixTransport {
  
  @JSImport("ndn-js", "UnixTransport.ConnectionInfo")
  @js.native
  class ConnectionInfo protected ()
    extends typingsSlinky.ndnJs.transportMod.UnixTransport.ConnectionInfo {
    def this(filePath: String) = this()
  }
}
