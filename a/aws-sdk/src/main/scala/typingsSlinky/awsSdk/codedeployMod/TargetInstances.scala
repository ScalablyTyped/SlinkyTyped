package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstances extends js.Object {
  /**
    * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  /**
    * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call as tagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  /**
    * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a blue/green deployment. Cannot be used in the same call as ec2TagSet.
    */
  var tagFilters: js.UndefOr[EC2TagFilterList] = js.native
}

object TargetInstances {
  @scala.inline
  def apply(): TargetInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstances]
  }
  @scala.inline
  implicit class TargetInstancesOps[Self <: TargetInstances] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroups(value: AutoScalingGroupNameList): Self = {
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
    def withEc2TagSet(value: EC2TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2TagSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFilters(value: EC2TagFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFilters")(js.undefined)
        ret
    }
  }
  
}

