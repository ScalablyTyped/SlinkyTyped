package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupResource extends js.Object {
  /**
    * List of objects containing information about AutoScaling Groups.
    */
  var autoscalingGroups: js.UndefOr[Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]]] = js.native
  /**
    * Identifier of the remote access EC2 Security Group.
    */
  var remoteAccessSecurityGroupId: js.UndefOr[Input[String]] = js.native
}

object NodeGroupResource {
  @scala.inline
  def apply(): NodeGroupResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupResource]
  }
  @scala.inline
  implicit class NodeGroupResourceOps[Self <: NodeGroupResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingGroups(value: Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAccessSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAccessSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSecurityGroupId")(js.undefined)
        ret
    }
  }
  
}

