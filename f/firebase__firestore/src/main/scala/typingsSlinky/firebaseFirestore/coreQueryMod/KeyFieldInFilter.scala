package typingsSlinky.firebaseFirestore.coreQueryMod

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "KeyFieldInFilter")
@js.native
class KeyFieldInFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: Value) = this()
  val keys: js.Any = js.native
}

