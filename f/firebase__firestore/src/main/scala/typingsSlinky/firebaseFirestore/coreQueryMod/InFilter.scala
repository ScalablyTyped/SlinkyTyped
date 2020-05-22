package typingsSlinky.firebaseFirestore.coreQueryMod

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "InFilter")
@js.native
class InFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: Value) = this()
}

