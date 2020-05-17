package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallStatement
  extends Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.CallStatement] {
  var expression: CallExpression | StringCallExpression | TableCallExpression = js.native
}

object CallStatement {
  @scala.inline
  def apply(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typingsSlinky.luaparse.luaparseStrings.CallStatement
  ): CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStatement]
  }
  @scala.inline
  implicit class CallStatementOps[Self <: CallStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: CallExpression | StringCallExpression | TableCallExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

