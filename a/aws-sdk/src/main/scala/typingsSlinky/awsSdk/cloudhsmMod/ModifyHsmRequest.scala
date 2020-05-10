package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHsmRequest extends js.Object {
  /**
    * The new IP address for the elastic network interface (ENI) attached to the HSM. If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the new subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The new external ID.
    */
  var ExternalId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ExternalId] = js.native
  /**
    * The ARN of the HSM to modify.
    */
  var HsmArn: typingsSlinky.awsSdk.cloudhsmMod.HsmArn = js.native
  /**
    * The new IAM role ARN.
    */
  var IamRoleArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.IamRoleArn] = js.native
  /**
    * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the current subnet.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.SubnetId] = js.native
  /**
    * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.native
}

object ModifyHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn): ModifyHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHsmRequest]
  }
  @scala.inline
  implicit class ModifyHsmRequestOps[Self <: ModifyHsmRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmArn(value: HsmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(value.asInstanceOf[js.Any])
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
    def withIamRoleArn(value: IamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
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

