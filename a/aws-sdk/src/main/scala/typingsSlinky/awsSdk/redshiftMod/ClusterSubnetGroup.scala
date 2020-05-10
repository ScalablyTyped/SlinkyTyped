package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSubnetGroup extends js.Object {
  /**
    * The name of the cluster subnet group.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The description of the cluster subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The status of the cluster subnet group. Possible values are Complete, Incomplete and Invalid. 
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    * A list of the VPC Subnet elements. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The list of tags for the cluster subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The VPC ID of the cluster subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ClusterSubnetGroup {
  @scala.inline
  def apply(): ClusterSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSubnetGroup]
  }
  @scala.inline
  implicit class ClusterSubnetGroupOps[Self <: ClusterSubnetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(js.undefined)
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
    def withSubnetGroupStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetGroupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetGroupStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetGroupStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnets(value: SubnetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnets")(js.undefined)
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
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

