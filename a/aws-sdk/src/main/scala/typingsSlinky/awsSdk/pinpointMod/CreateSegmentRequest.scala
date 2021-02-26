package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSegmentRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var WriteSegmentRequest: typingsSlinky.awsSdk.pinpointMod.WriteSegmentRequest = js.native
}
object CreateSegmentRequest {
  
  @scala.inline
  def apply(ApplicationId: string, WriteSegmentRequest: WriteSegmentRequest): CreateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentRequest]
  }
  
  @scala.inline
  implicit class CreateSegmentRequestMutableBuilder[Self <: CreateSegmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteSegmentRequest(value: WriteSegmentRequest): Self = StObject.set(x, "WriteSegmentRequest", value.asInstanceOf[js.Any])
  }
}
