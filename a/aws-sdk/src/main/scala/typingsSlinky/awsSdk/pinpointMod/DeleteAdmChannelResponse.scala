package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAdmChannelResponse extends js.Object {
  
  var ADMChannelResponse: typingsSlinky.awsSdk.pinpointMod.ADMChannelResponse = js.native
}
object DeleteAdmChannelResponse {
  
  @scala.inline
  def apply(ADMChannelResponse: ADMChannelResponse): DeleteAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAdmChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteAdmChannelResponseOps[Self <: DeleteAdmChannelResponse] (val x: Self) extends AnyVal {
    
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
    def setADMChannelResponse(value: ADMChannelResponse): Self = this.set("ADMChannelResponse", value.asInstanceOf[js.Any])
  }
}
