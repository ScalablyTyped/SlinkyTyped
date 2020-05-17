package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnStatement
  extends Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.ReturnStatement] {
  var arguments: js.Array[Expression] = js.native
}

object ReturnStatement {
  @scala.inline
  def apply(arguments: js.Array[Expression], `type`: typingsSlinky.luaparse.luaparseStrings.ReturnStatement): ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
  @scala.inline
  implicit class ReturnStatementOps[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

