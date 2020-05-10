package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2SecurityGroup extends js.Object {
  /**
    * The name of the EC2 Security Group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * The status of the EC2 security group.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The list of tags for the EC2 security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
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

