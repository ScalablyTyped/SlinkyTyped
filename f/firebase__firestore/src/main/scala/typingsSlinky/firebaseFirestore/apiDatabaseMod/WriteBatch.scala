package typingsSlinky.firebaseFirestore.apiDatabaseMod

import typingsSlinky.firebaseFirestore.apiFieldPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "WriteBatch")
@js.native
class WriteBatch protected ()
  extends typingsSlinky.firebaseFirestoreTypes.mod.WriteBatch {
  def this(_firestore: Firestore) = this()
  var _committed: js.Any = js.native
  var _firestore: js.Any = js.native
  var _mutations: js.Any = js.native
  var verifyNotCommitted: js.Any = js.native
  def update(
    documentRef: typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): WriteBatch = js.native
}

