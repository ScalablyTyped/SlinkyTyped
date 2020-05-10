package typingsSlinky.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  def End(): Pos = js.native
  def Pos(): typingsSlinky.mvdanSh.mod.Pos = js.native
}

object Node {
  @scala.inline
  def apply(End: () => Pos, Pos: () => Pos): Node = {
    val __obj = js.Dynamic.literal(End = js.Any.fromFunction0(End), Pos = js.Any.fromFunction0(Pos))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => Pos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPos(value: () => Pos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pos")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

