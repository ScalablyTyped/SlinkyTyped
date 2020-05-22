package typingsSlinky.firebaseFirestore.userDataReaderMod

import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.mutationMod.FieldMask
import typingsSlinky.firebaseFirestore.mutationMod.FieldTransform
import typingsSlinky.firebaseFirestore.mutationMod.Mutation
import typingsSlinky.firebaseFirestore.mutationMod.Precondition
import typingsSlinky.firebaseFirestore.objectValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/user_data_reader", "ParsedUpdateData")
@js.native
class ParsedUpdateData protected () extends js.Object {
  def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
  val data: ObjectValue = js.native
  val fieldMask: FieldMask = js.native
  val fieldTransforms: js.Array[FieldTransform] = js.native
  def toMutations(key: DocumentKey, precondition: Precondition): js.Array[Mutation] = js.native
}

