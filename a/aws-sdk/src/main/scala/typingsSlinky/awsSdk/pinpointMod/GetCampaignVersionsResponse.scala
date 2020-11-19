package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignVersionsResponse extends js.Object {
  
  var CampaignsResponse: typingsSlinky.awsSdk.pinpointMod.CampaignsResponse = js.native
}
object GetCampaignVersionsResponse {
  
  @scala.inline
  def apply(CampaignsResponse: CampaignsResponse): GetCampaignVersionsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionsResponse]
  }
  
  @scala.inline
  implicit class GetCampaignVersionsResponseOps[Self <: GetCampaignVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCampaignsResponse(value: CampaignsResponse): Self = this.set("CampaignsResponse", value.asInstanceOf[js.Any])
  }
}
