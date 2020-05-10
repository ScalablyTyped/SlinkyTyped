package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ec2Config extends js.Object {
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList = js.native
  /**
    * The ARN of the subnet and the security group that DataSync uses to access the target EFS file system.
    */
  var SubnetArn: Ec2SubnetArn = js.native
}

object Ec2Config {
  @scala.inline
  def apply(SecurityGroupArns: Ec2SecurityGroupArnList, SubnetArn: Ec2SubnetArn): Ec2Config = {
    val __obj = js.Dynamic.literal(SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], SubnetArn = SubnetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2Config]
  }
  @scala.inline
  implicit class Ec2ConfigOps[Self <: Ec2Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetArn(value: Ec2SubnetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

