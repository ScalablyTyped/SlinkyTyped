package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMountTargetsRequest extends StObject {
  
  /**
    * (Optional) The ID of the access point whose mount targets that you want to list. It must be included in your request if a FileSystemId or MountTargetId is not included in your request. Accepts either an access point ID or ARN as input.
    */
  var AccessPointId: js.UndefOr[typingsSlinky.awsSdk.efsMod.AccessPointId] = js.native
  
  /**
    * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your request if an AccessPointId or MountTargetId is not included. Accepts either a file system ID or ARN as input.
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsSdk.efsMod.FileSystemId] = js.native
  
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeMountTargets operation (String). If present, it specifies to continue the list from where the previous returning call left off.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.efsMod.Marker] = js.native
  
  /**
    * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set to 10, and other values are ignored. The response is paginated at 100 per page if you have more than 100 mount targets.
    */
  var MaxItems: js.UndefOr[typingsSlinky.awsSdk.efsMod.MaxItems] = js.native
  
  /**
    * (Optional) ID of the mount target that you want to have described (String). It must be included in your request if FileSystemId is not included. Accepts either a mount target ID or ARN as input.
    */
  var MountTargetId: js.UndefOr[typingsSlinky.awsSdk.efsMod.MountTargetId] = js.native
}
object DescribeMountTargetsRequest {
  
  @scala.inline
  def apply(): DescribeMountTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMountTargetsRequest]
  }
  
  @scala.inline
  implicit class DescribeMountTargetsRequestMutableBuilder[Self <: DescribeMountTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointId(value: AccessPointId): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountTargetIdUndefined: Self = StObject.set(x, "MountTargetId", js.undefined)
  }
}
