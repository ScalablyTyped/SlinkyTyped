package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForGenericStatement
  extends Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.ForGenericStatement] {
  var body: js.Array[Statement] = js.native
  var iterators: js.Array[Expression] = js.native
  var variables: js.Array[Identifier] = js.native
}

object ForGenericStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier]
  ): ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForGenericStatement]
  }
  @scala.inline
  implicit class ForGenericStatementOps[Self <: ForGenericStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Array[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterators(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterators")(value.asInstanceOf[js.Any])
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

