package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCampaignRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: string = js.native
}
object DeleteCampaignRequest {
  
  @scala.inline
  def apply(ApplicationId: string, CampaignId: string): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
  
  @scala.inline
  implicit class DeleteCampaignRequestMutableBuilder[Self <: DeleteCampaignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignId(value: string): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
  }
}
