package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeNode extends js.Object {
  /**
    * The name of the node. E.g. {@link Document} will have `nodeName` equal to '#document'`.
    */
  var nodeName: String = js.native
}

object DefaultTreeNode {
  @scala.inline
  def apply(nodeName: String): DefaultTreeNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeNode]
  }
  @scala.inline
  implicit class DefaultTreeNodeOps[Self <: DefaultTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

