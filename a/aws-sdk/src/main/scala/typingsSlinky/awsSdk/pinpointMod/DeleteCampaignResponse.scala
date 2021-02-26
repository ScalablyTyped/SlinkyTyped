package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCampaignResponse extends StObject {
  
  var CampaignResponse: typingsSlinky.awsSdk.pinpointMod.CampaignResponse = js.native
}
object DeleteCampaignResponse {
  
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): DeleteCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignResponse]
  }
  
  @scala.inline
  implicit class DeleteCampaignResponseMutableBuilder[Self <: DeleteCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
