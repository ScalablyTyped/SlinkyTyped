package typingsSlinky.luaparse.libAstMod

import typingsSlinky.luaparse.Anon_End
import typingsSlinky.luaparse.luaparseStrings.and
import typingsSlinky.luaparse.luaparseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.LogicalExpression] {
  var left: Expression
  var operator: or | and
  var right: Expression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.LogicalExpression,
    loc: Anon_End = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
}

