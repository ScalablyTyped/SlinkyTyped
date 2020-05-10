package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationSubnetGroup extends js.Object {
  /**
    * A description for the replication subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The identifier of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.native
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    * The subnets that are in the subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ReplicationSubnetGroup {
  @scala.inline
  def apply(): ReplicationSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationSubnetGroup]
  }
  @scala.inline
  implicit class ReplicationSubnetGroupOps[Self <: ReplicationSubnetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationSubnetGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationSubnetGroupIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupIdentifier")(js.undefined)
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

