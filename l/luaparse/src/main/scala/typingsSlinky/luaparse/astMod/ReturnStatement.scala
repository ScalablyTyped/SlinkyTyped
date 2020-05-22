package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.ReturnStatement] {
  var arguments: js.Array[Expression]
}

object ReturnStatement {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.ReturnStatement,
    loc: End = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
}

