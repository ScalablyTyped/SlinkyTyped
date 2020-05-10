package typingsSlinky.csso

import typingsSlinky.cssTree.mod.CssNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAst extends js.Object {
  var ast: CssNode = js.native
}

object AnonAst {
  @scala.inline
  def apply(ast: CssNode): AnonAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAst]
  }
  @scala.inline
  implicit class AnonAstOps[Self <: AnonAst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAst(value: CssNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

