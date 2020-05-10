package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.luaparseStrings.and
import typingsSlinky.luaparse.luaparseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.LogicalExpression] {
  var left: Expression = js.native
  var operator: or | and = js.native
  var right: Expression = js.native
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.LogicalExpression
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
  @scala.inline
  implicit class LogicalExpressionOps[Self <: LogicalExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: or | and): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

