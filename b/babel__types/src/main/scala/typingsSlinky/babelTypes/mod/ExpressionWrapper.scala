package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExpressionStatement_
  - typingsSlinky.babelTypes.mod.ParenthesizedExpression_
  - typingsSlinky.babelTypes.mod.TypeCastExpression_
*/
trait ExpressionWrapper extends Node

object ExpressionWrapper {
  @scala.inline
  implicit def apply(value: ExpressionStatement_): ExpressionWrapper = value.asInstanceOf[ExpressionWrapper]
  @scala.inline
  implicit def apply(value: ParenthesizedExpression_): ExpressionWrapper = value.asInstanceOf[ExpressionWrapper]
  @scala.inline
  implicit def apply(value: TypeCastExpression_): ExpressionWrapper = value.asInstanceOf[ExpressionWrapper]
}

