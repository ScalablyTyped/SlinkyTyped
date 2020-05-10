package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmRequest extends js.Object {
  /**
    * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ClientToken] = js.native
  /**
    * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The external ID from IamRoleArn, if present.
    */
  var ExternalId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ExternalId] = js.native
  /**
    * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
    */
  var IamRoleArn: typingsSlinky.awsSdk.cloudhsmMod.IamRoleArn = js.native
  /**
    * The SSH public key to install on the HSM.
    */
  var SshKey: typingsSlinky.awsSdk.cloudhsmMod.SshKey = js.native
  /**
    * The identifier of the subnet in your VPC in which to place the HSM.
    */
  var SubnetId: typingsSlinky.awsSdk.cloudhsmMod.SubnetId = js.native
  var SubscriptionType: typingsSlinky.awsSdk.cloudhsmMod.SubscriptionType = js.native
  /**
    * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.native
}

object CreateHsmRequest {
  @scala.inline
  def apply(IamRoleArn: IamRoleArn, SshKey: SshKey, SubnetId: SubnetId, SubscriptionType: SubscriptionType): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SshKey = SshKey.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
  @scala.inline
  implicit class CreateHsmRequestOps[Self <: CreateHsmRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamRoleArn(value: IamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSshKey(value: SshKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionType(value: SubscriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withEniIp(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: ExternalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(js.undefined)
        ret
    }
    @scala.inline
    def withSyslogIp(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyslogIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyslogIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyslogIp")(js.undefined)
        ret
    }
  }
  
}

