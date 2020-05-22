package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionSelector extends js.Object {
  var expression: typingsSlinky.angularCompiler.outputAstMod.Expression
  var selector: String
}

object ExpressionSelector {
  @scala.inline
  def apply(expression: typingsSlinky.angularCompiler.outputAstMod.Expression, selector: String): ExpressionSelector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionSelector]
  }
}

