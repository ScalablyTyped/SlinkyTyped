package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignsResponse extends StObject {
  
  var CampaignsResponse: typingsSlinky.awsSdk.pinpointMod.CampaignsResponse = js.native
}
object GetCampaignsResponse {
  
  @scala.inline
  def apply(CampaignsResponse: CampaignsResponse): GetCampaignsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignsResponse]
  }
  
  @scala.inline
  implicit class GetCampaignsResponseMutableBuilder[Self <: GetCampaignsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignsResponse(value: CampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
  }
}
