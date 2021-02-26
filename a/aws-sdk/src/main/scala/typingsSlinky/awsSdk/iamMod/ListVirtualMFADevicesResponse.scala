package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualMFADevicesResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  
  /**
    *  The list of virtual MFA devices in the current account that match the AssignmentStatus value that was passed in the request.
    */
  var VirtualMFADevices: virtualMFADeviceListType = js.native
}
object ListVirtualMFADevicesResponse {
  
  @scala.inline
  def apply(VirtualMFADevices: virtualMFADeviceListType): ListVirtualMFADevicesResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevices = VirtualMFADevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualMFADevicesResponse]
  }
  
  @scala.inline
  implicit class ListVirtualMFADevicesResponseMutableBuilder[Self <: ListVirtualMFADevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setVirtualMFADevices(value: virtualMFADeviceListType): Self = StObject.set(x, "VirtualMFADevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualMFADevicesVarargs(value: VirtualMFADevice*): Self = StObject.set(x, "VirtualMFADevices", js.Array(value :_*))
  }
}
