package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVirtualMFADeviceRequest extends StObject {
  
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the same as the ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType = js.native
}
object DeleteVirtualMFADeviceRequest {
  
  @scala.inline
  def apply(SerialNumber: serialNumberType): DeleteVirtualMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualMFADeviceRequest]
  }
  
  @scala.inline
  implicit class DeleteVirtualMFADeviceRequestMutableBuilder[Self <: DeleteVirtualMFADeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
  }
}
