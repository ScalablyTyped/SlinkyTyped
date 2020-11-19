package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSegmentResponse extends js.Object {
  
  var SegmentResponse: typingsSlinky.awsSdk.pinpointMod.SegmentResponse = js.native
}
object UpdateSegmentResponse {
  
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): UpdateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentResponse]
  }
  
  @scala.inline
  implicit class UpdateSegmentResponseOps[Self <: UpdateSegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSegmentResponse(value: SegmentResponse): Self = this.set("SegmentResponse", value.asInstanceOf[js.Any])
  }
}
