package typingsSlinky.firebaseFirestore.inputValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/input_validation", "validateOptionalArrayElements")
@js.native
object validateOptionalArrayElements extends js.Object {
  def apply[T](
    functionName: String,
    optionName: String,
    typeDescription: String,
    argument: js.UndefOr[js.Array[T]],
    validator: js.Function1[/* arg0 */ T, Boolean]
  ): Unit = js.native
}

