package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeOutput extends js.Object {
  /**
    * The unique identifier of the node.
    */
  var NodeId: js.UndefOr[ResourceIdString] = js.native
}

object CreateNodeOutput {
  @scala.inline
  def apply(): CreateNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodeOutput]
  }
  @scala.inline
  implicit class CreateNodeOutputOps[Self <: CreateNodeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeId")(js.undefined)
        ret
    }
  }
  
}

