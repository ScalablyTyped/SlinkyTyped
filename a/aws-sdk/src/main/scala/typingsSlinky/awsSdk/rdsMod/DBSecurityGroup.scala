package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSecurityGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB security group.
    */
  var DBSecurityGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the description of the DB security group.
    */
  var DBSecurityGroupDescription: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  Contains a list of EC2SecurityGroup elements. 
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    *  Contains a list of IPRange elements. 
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  /**
    * Provides the AWS ID of the owner of a specific DB security group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Provides the VpcId of the DB security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBSecurityGroup {
  @scala.inline
  def apply(): DBSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroup]
  }
  @scala.inline
  implicit class DBSecurityGroupOps[Self <: DBSecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBSecurityGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSecurityGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSecurityGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSecurityGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSecurityGroupName")(js.undefined)
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
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
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

