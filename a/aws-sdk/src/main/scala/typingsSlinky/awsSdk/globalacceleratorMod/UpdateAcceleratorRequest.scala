package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator to update.
    */
  var AcceleratorArn: GenericString = js.native
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.native
}

object UpdateAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): UpdateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorRequest]
  }
  @scala.inline
  implicit class UpdateAcceleratorRequestOps[Self <: UpdateAcceleratorRequest] (val x: Self) extends AnyVal {
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
  }
  
}

