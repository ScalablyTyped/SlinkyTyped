package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockStatement
  extends BaseNode
     with Statement {
  var body: js.Array[Statement] = js.native
  var innerComments: js.UndefOr[js.Array[Comment]] = js.native
  @JSName("type")
  var type_BlockStatement: typingsSlinky.estree.estreeStrings.BlockStatement = js.native
}

object BlockStatement {
  @scala.inline
  def apply(body: js.Array[Statement], `type`: typingsSlinky.estree.estreeStrings.BlockStatement): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
  @scala.inline
  implicit class BlockStatementOps[Self <: BlockStatement] (val x: Self) extends AnyVal {
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
    def withType(value: typingsSlinky.estree.estreeStrings.BlockStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerComments(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerComments")(js.undefined)
        ret
    }
  }
  
}

