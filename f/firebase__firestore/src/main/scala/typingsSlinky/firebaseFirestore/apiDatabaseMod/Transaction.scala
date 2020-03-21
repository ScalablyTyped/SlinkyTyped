package typingsSlinky.firebaseFirestore.apiDatabaseMod

import typingsSlinky.firebaseFirestore.apiFieldPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "Transaction")
@js.native
class Transaction protected ()
  extends typingsSlinky.firebaseFirestoreTypes.mod.Transaction {
  def this(
    _firestore: Firestore,
    _transaction: typingsSlinky.firebaseFirestore.coreTransactionMod.Transaction
  ) = this()
  var _firestore: js.Any = js.native
  var _transaction: js.Any = js.native
  def update(
    documentRef: typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): Transaction = js.native
}

