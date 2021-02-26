package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSegmentVersionsResponse extends StObject {
  
  var SegmentsResponse: typingsSlinky.awsSdk.pinpointMod.SegmentsResponse = js.native
}
object GetSegmentVersionsResponse {
  
  @scala.inline
  def apply(SegmentsResponse: SegmentsResponse): GetSegmentVersionsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionsResponse]
  }
  
  @scala.inline
  implicit class GetSegmentVersionsResponseMutableBuilder[Self <: GetSegmentVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentsResponse(value: SegmentsResponse): Self = StObject.set(x, "SegmentsResponse", value.asInstanceOf[js.Any])
  }
}
