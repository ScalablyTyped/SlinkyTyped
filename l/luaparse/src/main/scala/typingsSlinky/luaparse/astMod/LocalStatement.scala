package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStatement
  extends Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.LocalStatement] {
  var init: js.Array[Expression] = js.native
  var variables: js.Array[Identifier] = js.native
}

object LocalStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier]
  ): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStatement]
  }
  @scala.inline
  implicit class LocalStatementOps[Self <: LocalStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

