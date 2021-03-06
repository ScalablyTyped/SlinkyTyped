package typingsSlinky.firebaseFirestore.coreQueryMod

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "FieldFilter")
@js.native
class FieldFilter protected () extends Filter {
  protected def this(field: FieldPath, op: Operator, value: Value) = this()
  var field: FieldPath = js.native
  var op: Operator = js.native
  var value: Value = js.native
  def isInequality(): Boolean = js.native
  /* protected */ def matchesComparison(comparison: Double): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/core/query", "FieldFilter")
@js.native
object FieldFilter extends js.Object {
  /**
    * Creates a filter based on the provided arguments.
    */
  def create(field: FieldPath, op: Operator, value: Value): FieldFilter = js.native
}

