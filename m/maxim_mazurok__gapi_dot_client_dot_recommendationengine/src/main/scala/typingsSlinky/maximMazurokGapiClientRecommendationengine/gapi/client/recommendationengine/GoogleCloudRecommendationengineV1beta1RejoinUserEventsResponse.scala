package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse extends StObject {
  
  /** Number of user events that were joined with latest catalog items. */
  var rejoinedUserEventsCount: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
