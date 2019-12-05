package typingsSlinky.ndnDashJs.ndnDashJsMod

import typingsSlinky.ndnDashJs.faceMod.FaceCtorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Face")
@js.native
class Face ()
  extends typingsSlinky.ndnDashJs.faceMod.Face {
  def this(settings: FaceCtorOptions) = this()
  def this(
    transport: typingsSlinky.ndnDashJs.transportMod.Transport,
    connectionInfo: typingsSlinky.ndnDashJs.transportMod.TransportConnectionInfo
  ) = this()
}

/* static members */
@JSImport("ndn-js", "Face")
@js.native
object Face extends js.Object {
  def getMaxNdnPacketSize(): Double = js.native
}

