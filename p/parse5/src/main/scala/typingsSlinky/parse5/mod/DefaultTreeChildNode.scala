package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeChildNode
  extends DefaultTreeNode
     with ChildNode {
  /**
    * Parent node.
    */
  var parentNode: DefaultTreeParentNode = js.native
}

object DefaultTreeChildNode {
  @scala.inline
  def apply(nodeName: String, parentNode: DefaultTreeParentNode): DefaultTreeChildNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeChildNode]
  }
  @scala.inline
  implicit class DefaultTreeChildNodeOps[Self <: DefaultTreeChildNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentNode(value: DefaultTreeParentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

