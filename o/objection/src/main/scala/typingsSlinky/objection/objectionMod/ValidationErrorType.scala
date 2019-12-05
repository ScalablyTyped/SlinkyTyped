package typingsSlinky.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.objection.objectionStrings.ModelValidation
  - typings.objection.objectionStrings.RelationExpression
  - typings.objection.objectionStrings.UnallowedRelation
  - typings.objection.objectionStrings.InvalidGraph
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

