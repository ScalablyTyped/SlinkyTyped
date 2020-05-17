package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Content
import typingsSlinky.gatsby.anon.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends NodeInput {
  @JSName("children")
  var children_Node: js.Array[String] = js.native
  @JSName("internal")
  var internal_Node: Content with Owner = js.native
  @JSName("parent")
  var parent_Node: String = js.native
}

object Node {
  @scala.inline
  def apply(children: js.Array[String], id: String, internal: Content with Owner, parent: String): Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Content with Owner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

