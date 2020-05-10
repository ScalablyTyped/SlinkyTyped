package typingsSlinky.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResourceAutoscalingGroup extends js.Object {
  /**
    * Name of the AutoScaling Group.
    */
  var name: String = js.native
}

object NodeGroupResourceAutoscalingGroup {
  @scala.inline
  def apply(name: String): NodeGroupResourceAutoscalingGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
  }
  @scala.inline
  implicit class NodeGroupResourceAutoscalingGroupOps[Self <: NodeGroupResourceAutoscalingGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

