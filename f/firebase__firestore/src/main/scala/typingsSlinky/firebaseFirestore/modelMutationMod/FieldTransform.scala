package typingsSlinky.firebaseFirestore.modelMutationMod

import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import typingsSlinky.firebaseFirestore.modelTransformOperationMod.TransformOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "FieldTransform")
@js.native
class FieldTransform protected () extends js.Object {
  def this(field: FieldPath, transform: TransformOperation) = this()
  val field: FieldPath = js.native
  val transform: TransformOperation = js.native
  def isEqual(other: FieldTransform): Boolean = js.native
}

