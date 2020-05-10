package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualNodeOutput extends js.Object {
  /**
    * The virtual node that was deleted.
    */
  var virtualNode: VirtualNodeData = js.native
}

object DeleteVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): DeleteVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualNodeOutput]
  }
  @scala.inline
  implicit class DeleteVirtualNodeOutputOps[Self <: DeleteVirtualNodeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualNode(value: VirtualNodeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

