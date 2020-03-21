package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN_OR_EQUAL
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN_OR_EQUAL
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.EQUAL
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.IN
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS_ANY
*/
trait FieldFilterOp extends js.Object

object FieldFilterOp {
  @scala.inline
  def ARRAY_CONTAINS: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS = this.cast("ARRAY_CONTAINS")
  @scala.inline
  def ARRAY_CONTAINS_ANY: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS_ANY = this.cast("ARRAY_CONTAINS_ANY")
  @scala.inline
  def EQUAL: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.EQUAL = this.cast("EQUAL")
  @scala.inline
  def GREATER_THAN: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN = this.cast("GREATER_THAN")
  @scala.inline
  def GREATER_THAN_OR_EQUAL: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN_OR_EQUAL = this.cast("GREATER_THAN_OR_EQUAL")
  @scala.inline
  def IN: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.IN = this.cast("IN")
  @scala.inline
  def LESS_THAN: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN = this.cast("LESS_THAN")
  @scala.inline
  def LESS_THAN_OR_EQUAL: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN_OR_EQUAL = this.cast("LESS_THAN_OR_EQUAL")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

