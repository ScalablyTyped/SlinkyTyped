package typingsSlinky.firebaseFirestore.mutationMod

import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.objectValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "SetMutation")
@js.native
class SetMutation protected () extends Mutation {
  def this(key: DocumentKey, value: ObjectValue, precondition: Precondition) = this()
  val value: ObjectValue = js.native
}

