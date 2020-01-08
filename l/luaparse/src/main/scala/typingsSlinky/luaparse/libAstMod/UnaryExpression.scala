package typingsSlinky.luaparse.libAstMod

import typingsSlinky.luaparse.Anon_End
import typingsSlinky.luaparse.luaparseStrings.Numbersign
import typingsSlinky.luaparse.luaparseStrings.Tilde
import typingsSlinky.luaparse.luaparseStrings.`-_`
import typingsSlinky.luaparse.luaparseStrings.not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.UnaryExpression] {
  var argument: Expression
  var operator: not | `-_` | Tilde | Numbersign
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typingsSlinky.luaparse.luaparseStrings.UnaryExpression,
    loc: Anon_End = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}

