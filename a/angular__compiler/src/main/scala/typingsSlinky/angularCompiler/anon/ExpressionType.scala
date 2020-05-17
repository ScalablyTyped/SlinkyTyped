package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.outputAstMod.ExpressionType_
import typingsSlinky.angularCompiler.outputAstMod.InvokeFunctionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionType extends js.Object {
  var expression: InvokeFunctionExpr = js.native
  var `type`: ExpressionType_ = js.native
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
    def withExpression(value: InvokeFunctionExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExpressionType_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

