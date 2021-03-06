package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSegmentRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: string = js.native
  
  var WriteSegmentRequest: typingsSlinky.awsSdk.pinpointMod.WriteSegmentRequest = js.native
}
object UpdateSegmentRequest {
  
  @scala.inline
  def apply(ApplicationId: string, SegmentId: string, WriteSegmentRequest: WriteSegmentRequest): UpdateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentRequest]
  }
  
  @scala.inline
  implicit class UpdateSegmentRequestMutableBuilder[Self <: UpdateSegmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteSegmentRequest(value: WriteSegmentRequest): Self = StObject.set(x, "WriteSegmentRequest", value.asInstanceOf[js.Any])
  }
}
