package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualMFADevice extends js.Object {
  /**
    *  The base32 seed defined as specified in RFC3548. The Base32StringSeed is base64-encoded. 
    */
  var Base32StringSeed: js.UndefOr[BootstrapDatum] = js.native
  /**
    * The date and time on which the virtual MFA device was enabled.
    */
  var EnableDate: js.UndefOr[js.Date] = js.native
  /**
    *  A QR code PNG image that encodes otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String where $virtualMFADeviceName is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format. The Base32String value is base64-encoded. 
    */
  var QRCodePNG: js.UndefOr[BootstrapDatum] = js.native
  /**
    * The serial number associated with VirtualMFADevice.
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The IAM user associated with this virtual MFA device.
    */
  var User: js.UndefOr[typingsSlinky.awsSdk.iamMod.User] = js.native
}

object VirtualMFADevice {
  @scala.inline
  def apply(SerialNumber: serialNumberType): VirtualMFADevice = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualMFADevice]
  }
  @scala.inline
  implicit class VirtualMFADeviceOps[Self <: VirtualMFADevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerialNumber(value: serialNumberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase32StringSeedUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base32StringSeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase32StringSeed(value: BootstrapDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base32StringSeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase32StringSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base32StringSeed")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDate")(js.undefined)
        ret
    }
    @scala.inline
    def withQRCodePNGUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QRCodePNG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRCodePNG(value: BootstrapDatum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QRCodePNG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQRCodePNG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QRCodePNG")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

