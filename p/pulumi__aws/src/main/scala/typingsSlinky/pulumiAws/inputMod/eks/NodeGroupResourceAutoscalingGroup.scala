package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResourceAutoscalingGroup extends js.Object {
  /**
    * Name of the AutoScaling Group.
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object NodeGroupResourceAutoscalingGroup {
  @scala.inline
  def apply(): NodeGroupResourceAutoscalingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
  }
  @scala.inline
  implicit class NodeGroupResourceAutoscalingGroupOps[Self <: NodeGroupResourceAutoscalingGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

