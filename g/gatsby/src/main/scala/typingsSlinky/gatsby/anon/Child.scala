package typingsSlinky.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Child extends js.Object {
  var child: typingsSlinky.gatsby.mod.Node = js.native
  var parent: typingsSlinky.gatsby.mod.Node = js.native
}

object Child {
  @scala.inline
  def apply(child: typingsSlinky.gatsby.mod.Node, parent: typingsSlinky.gatsby.mod.Node): Child = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Child]
  }
  @scala.inline
  implicit class ChildOps[Self <: Child] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: typingsSlinky.gatsby.mod.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: typingsSlinky.gatsby.mod.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

