package typingsSlinky.graphql.overlappingFieldsCanBeMergedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Reason is a string, or a nested list of conflicts.
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[typingsSlinky.graphql.overlappingFieldsCanBeMergedMod.ConflictReason]
*/
trait ConflictReasonMessage extends js.Object

object ConflictReasonMessage {
  @scala.inline
  implicit def apply(value: js.Array[ConflictReason]): ConflictReasonMessage = value.asInstanceOf[ConflictReasonMessage]
  @scala.inline
  implicit def apply(value: String): ConflictReasonMessage = value.asInstanceOf[ConflictReasonMessage]
}

