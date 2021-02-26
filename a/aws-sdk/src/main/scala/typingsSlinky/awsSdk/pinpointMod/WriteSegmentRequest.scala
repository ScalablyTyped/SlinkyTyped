package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteSegmentRequest extends StObject {
  
  /**
    * The criteria that define the dimensions for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment. A segment group can consist of zero or more base segments. Your request can include only one segment group.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}
object WriteSegmentRequest {
  
  @scala.inline
  def apply(): WriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteSegmentRequest]
  }
  
  @scala.inline
  implicit class WriteSegmentRequestMutableBuilder[Self <: WriteSegmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: SegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSegmentGroups(value: SegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
