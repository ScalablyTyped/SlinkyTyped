package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.typesMod.TargetId
import typingsSlinky.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/local_view_changes", JSImport.Namespace)
@js.native
object localViewChangesMod extends js.Object {
  @js.native
  class LocalViewChanges protected () extends js.Object {
    def this(targetId: TargetId, fromCache: Boolean, addedKeys: DocumentKeySet_, removedKeys: DocumentKeySet_) = this()
    val addedKeys: DocumentKeySet_ = js.native
    val fromCache: Boolean = js.native
    val removedKeys: DocumentKeySet_ = js.native
    val targetId: TargetId = js.native
  }
  
  /* static members */
  @js.native
  object LocalViewChanges extends js.Object {
    def fromSnapshot(targetId: TargetId, viewSnapshot: ViewSnapshot): LocalViewChanges = js.native
  }
  
}

