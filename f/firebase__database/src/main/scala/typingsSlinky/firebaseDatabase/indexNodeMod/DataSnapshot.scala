package typingsSlinky.firebaseDatabase.indexNodeMod

import typingsSlinky.firebaseDatabase.indexMod.Index
import typingsSlinky.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/index.node", "DataSnapshot")
@js.native
class DataSnapshot protected ()
  extends typingsSlinky.firebaseDatabase.dataSnapshotMod.DataSnapshot {
  /**
    * @param {!Node} node_ A SnapshotNode to wrap.
    * @param {!Reference} ref_ The ref of the location this snapshot came from.
    * @param {!Index} index_ The iteration order for this snapshot
    */
  def this(node_ : Node, ref_ : typingsSlinky.firebaseDatabase.referenceMod.Reference, index_ : Index) = this()
}
