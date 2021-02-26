package typingsSlinky.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "Transport")
@js.native
abstract class Transport ()
  extends typingsSlinky.ndnJs.transportMod.Transport
/* static members */
object Transport {
  
  @JSImport("ndn-js", "Transport")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ndn-js", "Transport.ConnectionInfo")
  @js.native
  def ConnectionInfo: typingsSlinky.ndnJs.transportMod.TransportConnectionInfo = js.native
  @scala.inline
  def ConnectionInfo_=(x: typingsSlinky.ndnJs.transportMod.TransportConnectionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConnectionInfo")(x.asInstanceOf[js.Any])
}
