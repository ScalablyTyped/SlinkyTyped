package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var ExpressionName: StandardName = js.native
  var ExpressionValue: typingsSlinky.awsSdk.cloudsearchMod.ExpressionValue = js.native
}

object Expression {
  @scala.inline
  def apply(ExpressionName: StandardName, ExpressionValue: ExpressionValue): Expression = {
    val __obj = js.Dynamic.literal(ExpressionName = ExpressionName.asInstanceOf[js.Any], ExpressionValue = ExpressionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressionName(value: StandardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionValue(value: ExpressionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

