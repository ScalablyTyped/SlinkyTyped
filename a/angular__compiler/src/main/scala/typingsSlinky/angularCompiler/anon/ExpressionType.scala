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
  @scala.inline
  implicit class ExpressionTypeOps[Self <: ExpressionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: InvokeFunctionExpr): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ExpressionType_): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

