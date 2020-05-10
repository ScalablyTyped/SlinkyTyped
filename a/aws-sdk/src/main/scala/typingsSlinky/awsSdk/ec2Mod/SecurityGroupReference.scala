package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupReference extends js.Object {
  /**
    * The ID of your security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC with the referencing security group.
    */
  var ReferencingVpcId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object SecurityGroupReference {
  @scala.inline
  def apply(): SecurityGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupReference]
  }
  @scala.inline
  implicit class SecurityGroupReferenceOps[Self <: SecurityGroupReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencingVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencingVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencingVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencingVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcPeeringConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(js.undefined)
        ret
    }
  }
  
}

