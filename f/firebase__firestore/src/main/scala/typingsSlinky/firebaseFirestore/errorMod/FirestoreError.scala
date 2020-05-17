package typingsSlinky.firebaseFirestore.errorMod

import typingsSlinky.firebaseFirestoreTypes.mod.FirestoreErrorCode
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.firebaseFirestoreTypes.mod.FirestoreError because var conflicts: message, name, stack. Inlined code */ @JSImport("@firebase/firestore/dist/lib/src/util/error", "FirestoreError")
@js.native
class FirestoreError protected () extends Error {
  def this(code: Code, message: String) = this()
  val code: Code | FirestoreErrorCode = js.native
}

