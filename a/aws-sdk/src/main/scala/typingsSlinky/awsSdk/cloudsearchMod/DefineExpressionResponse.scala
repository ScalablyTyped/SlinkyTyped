package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineExpressionResponse extends js.Object {
  var Expression: ExpressionStatus = js.native
}

object DefineExpressionResponse {
  @scala.inline
  def apply(Expression: ExpressionStatus): DefineExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineExpressionResponse]
  }
  @scala.inline
  implicit class DefineExpressionResponseOps[Self <: DefineExpressionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: ExpressionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

