package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.outputAstMod.ExpressionType_
import typingsSlinky.angularCompiler.outputAstMod.InvokeFunctionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionType extends js.Object {
  var expression: InvokeFunctionExpr
  var `type`: ExpressionType_
}

object ExpressionType {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, `type`: ExpressionType_): ExpressionType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionType]
  }
}

