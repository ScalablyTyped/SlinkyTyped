package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.IS_NAN
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.IS_NULL
*/
trait UnaryFilterOp extends js.Object

object UnaryFilterOp {
  @scala.inline
  def IS_NAN: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.IS_NAN = this.cast("IS_NAN")
  @scala.inline
  def IS_NULL: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.IS_NULL = this.cast("IS_NULL")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

