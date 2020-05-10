package typingsSlinky.ckeditorCkeditor5Engine.mod.view.observer

import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutatedChildren extends js.Object {
  var newChildren: js.Array[Node] = js.native
  var node: Element = js.native
  var oldChildren: js.Array[Node] = js.native
  var `type`: String = js.native
}

object MutatedChildren {
  @scala.inline
  def apply(newChildren: js.Array[Node], node: Element, oldChildren: js.Array[Node], `type`: String): MutatedChildren = {
    val __obj = js.Dynamic.literal(newChildren = newChildren.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldChildren = oldChildren.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatedChildren]
  }
  @scala.inline
  implicit class MutatedChildrenOps[Self <: MutatedChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewChildren(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldChildren(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

