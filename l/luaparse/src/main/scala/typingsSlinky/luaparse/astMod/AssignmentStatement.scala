package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.AssignmentStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[IndexExpression | MemberExpression | Identifier]
}

object AssignmentStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier],
    loc: AnonEnd = null
  ): AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentStatement]
  }
}

