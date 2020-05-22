package typingsSlinky.firebaseFirestore.localSimpleDbMod

import typingsSlinky.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/simple_db", "IndexedDbTransactionError")
@js.native
class IndexedDbTransactionError protected () extends FirestoreError {
  def this(cause: js.Error) = this()
}

