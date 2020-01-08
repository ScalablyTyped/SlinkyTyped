package typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod

import typingsSlinky.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentChange
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "changesFromSnapshot")
@js.native
object changesFromSnapshot extends js.Object {
  def apply[T](firestore: Firestore, includeMetadataChanges: Boolean, snapshot: ViewSnapshot): js.Array[DocumentChange[T]] = js.native
  def apply[T](
    firestore: Firestore,
    includeMetadataChanges: Boolean,
    snapshot: ViewSnapshot,
    converter: FirestoreDataConverter[T]
  ): js.Array[DocumentChange[T]] = js.native
}

