package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcAttributeRequest extends js.Object {
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typingsSlinky.awsSdk.ec2Mod.VpcId = js.native
}

object ModifyVpcAttributeRequest {
  @scala.inline
  def apply(VpcId: VpcId): ModifyVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcAttributeRequest]
  }
  @scala.inline
  implicit class ModifyVpcAttributeRequestOps[Self <: ModifyVpcAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableDnsHostnames(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDnsSupport(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDnsSupport")(js.undefined)
        ret
    }
  }
  
}

