package typingsSlinky.cssom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpression extends js.Object {
  var expression: String = js.native
  var idx: Double = js.native
}

object AnonExpression {
  @scala.inline
  def apply(expression: String, idx: Double): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpression]
  }
  @scala.inline
  implicit class AnonExpressionOps[Self <: AnonExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

