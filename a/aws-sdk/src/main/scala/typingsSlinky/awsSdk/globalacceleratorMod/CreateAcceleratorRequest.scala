package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAcceleratorRequest extends js.Object {
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of an accelerator.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * Optionally, if you've added your own IP address pool to Global Accelerator, you can choose IP addresses from your own pool to use for the accelerator's static IP addresses. You can specify one or two addresses, separated by a comma. Do not include the /32 suffix. If you specify only one IP address from your IP address range, Global Accelerator assigns a second static IP address for the accelerator from the AWS IP address pool. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  var IpAddresses: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpAddresses] = js.native
  /**
    * The name of an accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: GenericString = js.native
  /**
    * Create tags for an accelerator. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Tags] = js.native
}

object CreateAcceleratorRequest {
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, Name: GenericString): CreateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcceleratorRequest]
  }
  @scala.inline
  implicit class CreateAcceleratorRequestOps[Self <: CreateAcceleratorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdempotencyToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    def withIpAddresses(value: IpAddresses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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

