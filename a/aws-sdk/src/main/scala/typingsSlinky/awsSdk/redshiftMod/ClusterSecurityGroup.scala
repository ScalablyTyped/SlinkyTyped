package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSecurityGroup extends js.Object {
  /**
    * The name of the cluster security group to which the operation was applied.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  /**
    * The list of tags for the cluster security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ClusterSecurityGroup {
  @scala.inline
  def apply(): ClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroup]
  }
  @scala.inline
  implicit class ClusterSecurityGroupOps[Self <: ClusterSecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2SecurityGroups(value: EC2SecurityGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withIPRanges(value: IPRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

