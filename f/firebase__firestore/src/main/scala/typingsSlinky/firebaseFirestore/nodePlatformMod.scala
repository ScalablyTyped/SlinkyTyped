package typingsSlinky.firebaseFirestore

import org.scalajs.dom.raw.Window
import typingsSlinky.firebaseFirestore.platformMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/platform_node/node_platform", JSImport.Namespace)
@js.native
object nodePlatformMod extends js.Object {
  @js.native
  class NodePlatform () extends Platform {
    @JSName("document")
    val document_NodePlatform: Null = js.native
    @JSName("window")
    def window_MNodePlatform: Window | Null = js.native
  }
  
}

