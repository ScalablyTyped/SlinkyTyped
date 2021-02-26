package typingsSlinky.ndnJs.mod

import typingsSlinky.ndnJs.faceMod.FaceCtorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "Face")
@js.native
class Face ()
  extends typingsSlinky.ndnJs.faceMod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typingsSlinky.ndnJs.transportMod.Transport,
    connectionInfo: typingsSlinky.ndnJs.transportMod.TransportConnectionInfo
  ) = this()
}
/* static members */
object Face {
  
  @JSImport("ndn-js", "Face.getMaxNdnPacketSize")
  @js.native
  def getMaxNdnPacketSize(): Double = js.native
}
