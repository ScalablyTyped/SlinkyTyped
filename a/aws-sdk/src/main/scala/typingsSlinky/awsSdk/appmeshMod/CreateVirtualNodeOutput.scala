package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualNodeOutput extends js.Object {
  /**
    * The full description of your virtual node following the create call.
    */
  var virtualNode: VirtualNodeData = js.native
}

object CreateVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): CreateVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualNodeOutput]
  }
  @scala.inline
  implicit class CreateVirtualNodeOutputOps[Self <: CreateVirtualNodeOutput] (val x: Self) extends AnyVal {
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

