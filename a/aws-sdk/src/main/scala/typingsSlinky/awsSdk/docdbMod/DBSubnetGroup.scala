package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSubnetGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB subnet group.
    */
  var DBSubnetGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the description of the subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the subnet group.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    * Detailed information about one or more subnets within a subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * Provides the virtual private cloud (VPC) ID of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBSubnetGroup {
  @scala.inline
  def apply(): DBSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroup]
  }
  @scala.inline
  implicit class DBSubnetGroupOps[Self <: DBSubnetGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSubnetGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSubnetGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroupName")(js.undefined)
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

