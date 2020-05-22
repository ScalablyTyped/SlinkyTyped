package typingsSlinky.firebaseFirestore.simpleDbMod

import typingsSlinky.firebaseFirestore.errorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/simple_db", "IndexedDbTransactionError")
@js.native
class IndexedDbTransactionError protected () extends FirestoreError {
  def this(cause: js.Error) = this()
}

