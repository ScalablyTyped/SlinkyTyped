package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualMFADevice extends StObject {
  
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
  implicit class VirtualMFADeviceMutableBuilder[Self <: VirtualMFADevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase32StringSeed(value: BootstrapDatum): Self = StObject.set(x, "Base32StringSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase32StringSeedUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Base32StringSeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase32StringSeedUndefined: Self = StObject.set(x, "Base32StringSeed", js.undefined)
    
    @scala.inline
    def setEnableDate(value: js.Date): Self = StObject.set(x, "EnableDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDateUndefined: Self = StObject.set(x, "EnableDate", js.undefined)
    
    @scala.inline
    def setQRCodePNG(value: BootstrapDatum): Self = StObject.set(x, "QRCodePNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRCodePNGUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "QRCodePNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRCodePNGUndefined: Self = StObject.set(x, "QRCodePNG", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
