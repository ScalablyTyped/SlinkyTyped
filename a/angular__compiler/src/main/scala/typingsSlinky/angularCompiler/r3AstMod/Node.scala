package typingsSlinky.angularCompiler.r3AstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var sourceSpan: ParseSourceSpan = js.native
  def visit[Result](visitor: Visitor[Result]): Result = js.native
}

object Node {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => js.Any): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceSpan(value: ParseSourceSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisit(value: Visitor[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

