package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.objection.objectionStrings.ModelValidation
  - typingsSlinky.objection.objectionStrings.RelationExpression
  - typingsSlinky.objection.objectionStrings.UnallowedRelation
  - typingsSlinky.objection.objectionStrings.InvalidGraph
*/
trait ValidationErrorType extends js.Object

object ValidationErrorType {
  @scala.inline
  def InvalidGraph: typingsSlinky.objection.objectionStrings.InvalidGraph = this.cast("InvalidGraph")
  @scala.inline
  def ModelValidation: typingsSlinky.objection.objectionStrings.ModelValidation = this.cast("ModelValidation")
  @scala.inline
  def RelationExpression: typingsSlinky.objection.objectionStrings.RelationExpression = this.cast("RelationExpression")
  @scala.inline
  def UnallowedRelation: typingsSlinky.objection.objectionStrings.UnallowedRelation = this.cast("UnallowedRelation")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

