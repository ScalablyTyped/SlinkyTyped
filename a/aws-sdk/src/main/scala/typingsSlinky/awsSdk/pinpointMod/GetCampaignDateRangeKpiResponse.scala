package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignDateRangeKpiResponse extends StObject {
  
  var CampaignDateRangeKpiResponse: typingsSlinky.awsSdk.pinpointMod.CampaignDateRangeKpiResponse = js.native
}
object GetCampaignDateRangeKpiResponse {
  
  @scala.inline
  def apply(CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse): GetCampaignDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(CampaignDateRangeKpiResponse = CampaignDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignDateRangeKpiResponse]
  }
  
  @scala.inline
  implicit class GetCampaignDateRangeKpiResponseMutableBuilder[Self <: GetCampaignDateRangeKpiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignDateRangeKpiResponse(value: CampaignDateRangeKpiResponse): Self = StObject.set(x, "CampaignDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
