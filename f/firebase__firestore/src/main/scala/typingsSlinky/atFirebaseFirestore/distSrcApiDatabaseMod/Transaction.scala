package typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod

import typingsSlinky.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "Transaction")
@js.native
class Transaction protected ()
  extends typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Transaction {
  def this(
    _firestore: Firestore,
    _transaction: typingsSlinky.atFirebaseFirestore.distSrcCoreTransactionMod.Transaction
  ) = this()
  var _firestore: js.Any = js.native
  var _transaction: js.Any = js.native
  def update(
    documentRef: typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): Transaction = js.native
}

