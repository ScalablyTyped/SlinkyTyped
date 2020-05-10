package typingsSlinky.firebaseFirestore.queryMod

import typingsSlinky.firebaseFirestore.modelFieldValueMod.ArrayValue
import typingsSlinky.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "InFilter")
@js.native
class InFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: ArrayValue) = this()
  @JSName("value")
  var value_InFilter: ArrayValue = js.native
}

