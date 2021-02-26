package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualMFADevicesRequest extends StObject {
  
  /**
    *  The status (Unassigned or Assigned) of the devices to list. If you do not specify an AssignmentStatus, the operation defaults to Any, which lists both assigned and unassigned virtual MFA devices.,
    */
  var AssignmentStatus: js.UndefOr[assignmentStatusType] = js.native
  
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.native
  
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.native
}
object ListVirtualMFADevicesRequest {
  
  @scala.inline
  def apply(): ListVirtualMFADevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualMFADevicesRequest]
  }
  
  @scala.inline
  implicit class ListVirtualMFADevicesRequestMutableBuilder[Self <: ListVirtualMFADevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentStatus(value: assignmentStatusType): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
    
    @scala.inline
    def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: maxItemsType): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
