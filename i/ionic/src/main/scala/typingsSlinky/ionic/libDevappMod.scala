package typingsSlinky.ionic

import typingsSlinky.atIonicDiscover.distCommMod.CommServer
import typingsSlinky.ionic.libDevappMod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/devapp", JSImport.Namespace)
@js.native
object libDevappMod extends js.Object {
  @js.native
  class Publisher ()
    extends typingsSlinky.atIonicDiscover.atIonicDiscoverMod.Publisher
  
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  def createCommServer(id: String, port: Double): js.Promise[CommServer] = js.native
  def createPublisher(name: String, port: Double, commPort: Double): js.Promise[Publisher] = js.native
}

