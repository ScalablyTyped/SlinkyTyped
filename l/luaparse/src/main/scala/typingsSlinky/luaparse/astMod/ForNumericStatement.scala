package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForNumericStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.ForNumericStatement] {
  var body: js.Array[Statement]
  var end: Expression
  var start: Expression
  var step: Expression | Null
  var variable: Identifier
}

object ForNumericStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.ForNumericStatement,
    variable: Identifier,
    loc: End = null,
    step: Expression = null
  ): ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForNumericStatement]
  }
}

