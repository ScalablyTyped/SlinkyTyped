package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.platformPlatformMod.Platform
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/node_platform", JSImport.Namespace)
@js.native
object platformNodeNodePlatformMod extends js.Object {
  @js.native
  class NodePlatform () extends Platform {
    @JSName("document")
    val document_NodePlatform: Null = js.native
    @JSName("window")
    def window_MNodePlatform: Window_ | Null = js.native
  }
  
}

