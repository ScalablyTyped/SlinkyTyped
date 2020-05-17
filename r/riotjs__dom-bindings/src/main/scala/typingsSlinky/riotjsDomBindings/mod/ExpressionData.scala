package typingsSlinky.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.riotjsDomBindings.mod.AttributeExpressionData
  - typingsSlinky.riotjsDomBindings.mod.EventExpressionData
  - typingsSlinky.riotjsDomBindings.mod.TextExpressionData
  - typingsSlinky.riotjsDomBindings.mod.ValueExpressionData
*/
trait ExpressionData extends js.Object

object ExpressionData {
  @scala.inline
  implicit def apply(value: AttributeExpressionData): ExpressionData = value.asInstanceOf[ExpressionData]
  @scala.inline
  implicit def apply(value: EventExpressionData): ExpressionData = value.asInstanceOf[ExpressionData]
  @scala.inline
  implicit def apply(value: TextExpressionData): ExpressionData = value.asInstanceOf[ExpressionData]
  @scala.inline
  implicit def apply(value: ValueExpressionData): ExpressionData = value.asInstanceOf[ExpressionData]
}

