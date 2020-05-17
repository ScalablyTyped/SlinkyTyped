package typingsSlinky.behavior3.anon

import typingsSlinky.behavior3.b3.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildBaseNode extends js.Object {
  var child: js.UndefOr[BaseNode] = js.native
}

object ChildBaseNode {
  @scala.inline
  def apply(): ChildBaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildBaseNode]
  }
  @scala.inline
  implicit class ChildBaseNodeOps[Self <: ChildBaseNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: BaseNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
  }
  
}

