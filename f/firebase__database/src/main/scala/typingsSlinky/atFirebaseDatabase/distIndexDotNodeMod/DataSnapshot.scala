package typingsSlinky.atFirebaseDatabase.distIndexDotNodeMod

import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "DataSnapshot")
@js.native
class DataSnapshot protected ()
  extends typingsSlinky.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot {
  /**
    * @param {!Node} node_ A SnapshotNode to wrap.
    * @param {!Reference} ref_ The ref of the location this snapshot came from.
    * @param {!Index} index_ The iteration order for this snapshot
    */
  def this(
    node_ : Node,
    ref_ : typingsSlinky.atFirebaseDatabase.distSrcApiReferenceMod.Reference,
    index_ : Index
  ) = this()
}

