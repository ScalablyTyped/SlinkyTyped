package typingsSlinky.firebaseFirestore.apiUserDataReaderMod

import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelMutationMod.FieldMask
import typingsSlinky.firebaseFirestore.modelMutationMod.FieldTransform
import typingsSlinky.firebaseFirestore.modelMutationMod.Mutation
import typingsSlinky.firebaseFirestore.modelMutationMod.Precondition
import typingsSlinky.firebaseFirestore.modelObjectValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/user_data_reader", "ParsedSetData")
@js.native
class ParsedSetData protected () extends js.Object {
  def this(data: ObjectValue, fieldMask: Null, fieldTransforms: js.Array[FieldTransform]) = this()
  def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
  val data: ObjectValue = js.native
  val fieldMask: FieldMask | Null = js.native
  val fieldTransforms: js.Array[FieldTransform] = js.native
  def toMutations(key: DocumentKey, precondition: Precondition): js.Array[Mutation] = js.native
}

