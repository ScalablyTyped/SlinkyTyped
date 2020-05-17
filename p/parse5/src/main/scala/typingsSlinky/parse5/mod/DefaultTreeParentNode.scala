package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeParentNode
  extends DefaultTreeNode
     with ParentNode {
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode] = js.native
}

object DefaultTreeParentNode {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: String): DefaultTreeParentNode = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeParentNode]
  }
  @scala.inline
  implicit class DefaultTreeParentNodeOps[Self <: DefaultTreeParentNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildNodes(value: js.Array[DefaultTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

