package typingsSlinky.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  def isRoot(): Boolean = js.native
  def visit(visitor: Visitor[Node], state: js.Any): Unit = js.native
}

object Node {
  @scala.inline
  def apply(isRoot: () => Boolean, visit: (Visitor[Node], js.Any) => Unit): Node = {
    val __obj = js.Dynamic.literal(isRoot = js.Any.fromFunction0(isRoot), visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRoot(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisit(value: (Visitor[Node], js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

