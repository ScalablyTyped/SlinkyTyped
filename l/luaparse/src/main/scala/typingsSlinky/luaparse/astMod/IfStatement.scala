package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.IfStatement] {
  var clauses: js.Array[IfClause | ElseifClause | ElseClause]
}

object IfStatement {
  @scala.inline
  def apply(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typingsSlinky.luaparse.luaparseStrings.IfStatement,
    loc: End = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

