package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.dom.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndNode extends js.Object {
  var endNode: node = js.native
  var startNode: node = js.native
}

object EndNode {
  @scala.inline
  def apply(endNode: node, startNode: node): EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndNode]
  }
  @scala.inline
  implicit class EndNodeOps[Self <: EndNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndNode(value: node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartNode(value: node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

