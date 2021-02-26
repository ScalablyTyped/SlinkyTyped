package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCampaignActivitiesResponse extends StObject {
  
  var ActivitiesResponse: typingsSlinky.awsSdk.pinpointMod.ActivitiesResponse = js.native
}
object GetCampaignActivitiesResponse {
  
  @scala.inline
  def apply(ActivitiesResponse: ActivitiesResponse): GetCampaignActivitiesResponse = {
    val __obj = js.Dynamic.literal(ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignActivitiesResponse]
  }
  
  @scala.inline
  implicit class GetCampaignActivitiesResponseMutableBuilder[Self <: GetCampaignActivitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivitiesResponse(value: ActivitiesResponse): Self = StObject.set(x, "ActivitiesResponse", value.asInstanceOf[js.Any])
  }
}
