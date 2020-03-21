package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.LocalStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[Identifier]
}

object LocalStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier],
    loc: AnonEnd = null
  ): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStatement]
  }
}

