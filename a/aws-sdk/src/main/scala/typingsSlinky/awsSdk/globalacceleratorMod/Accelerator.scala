package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accelerator extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.native
  /**
    * The date and time that the accelerator was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The Domain Name System (DNS) name that Global Accelerator creates that points to your accelerator's static IP addresses.  The naming convention for the DNS name is the following: A lowercase letter a, followed by a 16-bit random hex string, followed by .awsglobalaccelerator.com. For example: a1234567890abcdef.awsglobalaccelerator.com. For more information about the default DNS name, see  Support for DNS Addressing in Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var DnsName: js.UndefOr[GenericString] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * The static IP addresses that Global Accelerator associates with the accelerator.
    */
  var IpSets: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpSets] = js.native
  /**
    * The date and time that the accelerator was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the accelerator. The name must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.native
  /**
    * Describes the deployment status of the accelerator.
    */
  var Status: js.UndefOr[AcceleratorStatus] = js.native
}

object Accelerator {
  @scala.inline
  def apply(): Accelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accelerator]
  }
  @scala.inline
  implicit class AcceleratorOps[Self <: Accelerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorArn(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleratorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: GenericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddressType(value: IpAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressType")(js.undefined)
        ret
    }
    @scala.inline
    def withIpSets(value: IpSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpSets")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AcceleratorStatus): Self = {
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

