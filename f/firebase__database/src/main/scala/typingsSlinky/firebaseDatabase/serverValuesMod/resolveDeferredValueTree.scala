package typingsSlinky.firebaseDatabase.serverValuesMod

import typingsSlinky.firebaseDatabase.miscMod.Indexable
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.syncTreeMod.SyncTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredValueTree")
@js.native
object resolveDeferredValueTree extends js.Object {
  def apply(path: Path, node: Node, syncTree: SyncTree, serverValues: Indexable): Node = js.native
}

