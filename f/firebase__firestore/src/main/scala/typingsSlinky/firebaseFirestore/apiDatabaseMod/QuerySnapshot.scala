package typingsSlinky.firebaseFirestore.apiDatabaseMod

import typingsSlinky.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import typingsSlinky.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "QuerySnapshot")
@js.native
class QuerySnapshot[T] protected ()
  extends typingsSlinky.firebaseFirestoreTypes.mod.QuerySnapshot[T] {
  def this(
    _firestore: Firestore,
    _originalQuery: typingsSlinky.firebaseFirestore.coreQueryMod.Query,
    _snapshot: ViewSnapshot
  ) = this()
  def this(
    _firestore: Firestore,
    _originalQuery: typingsSlinky.firebaseFirestore.coreQueryMod.Query,
    _snapshot: ViewSnapshot,
    _converter: FirestoreDataConverter[T]
  ) = this()
  var _cachedChanges: js.Any = js.native
  var _cachedChangesIncludeMetadataChanges: js.Any = js.native
  val _converter: js.UndefOr[js.Any] = js.native
  val _firestore: js.Any = js.native
  val _originalQuery: js.Any = js.native
  val _snapshot: js.Any = js.native
  var convertToDocumentImpl: js.Any = js.native
}

