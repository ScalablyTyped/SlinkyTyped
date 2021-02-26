package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVirtualMFADeviceResponse extends StObject {
  
  /**
    * A structure containing details about the new virtual MFA device.
    */
  var VirtualMFADevice: typingsSlinky.awsSdk.iamMod.VirtualMFADevice = js.native
}
object CreateVirtualMFADeviceResponse {
  
  @scala.inline
  def apply(VirtualMFADevice: VirtualMFADevice): CreateVirtualMFADeviceResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevice = VirtualMFADevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
  }
  
  @scala.inline
  implicit class CreateVirtualMFADeviceResponseMutableBuilder[Self <: CreateVirtualMFADeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualMFADevice(value: VirtualMFADevice): Self = StObject.set(x, "VirtualMFADevice", value.asInstanceOf[js.Any])
  }
}
