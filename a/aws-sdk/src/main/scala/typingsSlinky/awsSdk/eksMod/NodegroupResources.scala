package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodegroupResources extends js.Object {
  /**
    * The Auto Scaling groups associated with the node group.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * The remote access security group associated with the node group. This security group controls SSH access to the worker nodes.
    */
  var remoteAccessSecurityGroup: js.UndefOr[String] = js.native
}

object NodegroupResources {
  @scala.inline
  def apply(): NodegroupResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupResources]
  }
  @scala.inline
  implicit class NodegroupResourcesOps[Self <: NodegroupResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroups(value: AutoScalingGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAccessSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAccessSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccessSecurityGroup")(js.undefined)
        ret
    }
  }
  
}

