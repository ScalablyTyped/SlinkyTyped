package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSegmentResponse extends StObject {
  
  var SegmentResponse: typingsSlinky.awsSdk.pinpointMod.SegmentResponse = js.native
}
object CreateSegmentResponse {
  
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): CreateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentResponse]
  }
  
  @scala.inline
  implicit class CreateSegmentResponseMutableBuilder[Self <: CreateSegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
