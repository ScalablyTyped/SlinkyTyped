package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2SecurityGroup extends js.Object {
  /**
    * Specifies the id of the EC2 security group.
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  Specifies the AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * Provides the status of the EC2 security group. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.native
}

object EC2SecurityGroup {
  @scala.inline
  def apply(): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2SecurityGroup]
  }
  @scala.inline
  implicit class EC2SecurityGroupOps[Self <: EC2SecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEC2SecurityGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2SecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2SecurityGroupOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2SecurityGroupOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2SecurityGroupOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

