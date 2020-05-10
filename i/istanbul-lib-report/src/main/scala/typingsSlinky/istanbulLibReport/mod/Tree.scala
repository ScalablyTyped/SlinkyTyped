package typingsSlinky.istanbulLibReport.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree[N /* <: Node */] extends js.Object {
  def getRoot(): N = js.native
  def visit(visitor: Partial[Visitor[N]], state: js.Any): Unit = js.native
}

object Tree {
  @scala.inline
  def apply[N](getRoot: () => N, visit: (Partial[Visitor[N]], js.Any) => Unit): Tree[N] = {
    val __obj = js.Dynamic.literal(getRoot = js.Any.fromFunction0(getRoot), visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Tree[N]]
  }
  @scala.inline
  implicit class TreeOps[Self[n] <: Tree[n], N] (val x: Self[N]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[N] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[N] with Other]
    @scala.inline
    def withGetRoot(value: () => N): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisit(value: (Partial[Visitor[N]], js.Any) => Unit): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

