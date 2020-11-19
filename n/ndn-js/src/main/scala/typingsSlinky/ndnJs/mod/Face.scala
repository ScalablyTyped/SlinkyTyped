package typingsSlinky.ndnJs.mod

import typingsSlinky.ndnJs.faceMod.FaceCtorOptions
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
@JSImport("ndn-js", "Face")
@js.native
object Face extends js.Object {
  
  def getMaxNdnPacketSize(): Double = js.native
}
