package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputVpcRequest extends js.Object {
  /**
    * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC network interfaces.
  Requires subnetIds. If none are specified then the VPC default security group will be used.
    */
  var SecurityGroupIds: js.UndefOr[listOfString] = js.native
  /**
    * A list of 2 VPC subnet IDs from the same VPC.
  Subnet IDs must be mapped to two unique availability zones (AZ).
    */
  var SubnetIds: listOfString = js.native
}

object InputVpcRequest {
  @scala.inline
  def apply(SubnetIds: listOfString): InputVpcRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVpcRequest]
  }
  @scala.inline
  implicit class InputVpcRequestOps[Self <: InputVpcRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetIds(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

