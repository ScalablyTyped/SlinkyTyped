package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse extends StObject {
  
  /** The total count of events purged as a result of the operation. */
  var purgedEventsCount: js.UndefOr[String] = js.native
  
  /** A sampling of events deleted (or will be deleted) depending on the `force` property in the request. Max of 500 items will be returned. */
  var userEventsSample: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]] = js.native
}
object GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPurgedEventsCount(value: String): Self = StObject.set(x, "purgedEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgedEventsCountUndefined: Self = StObject.set(x, "purgedEventsCount", js.undefined)
    
    @scala.inline
    def setUserEventsSample(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEventsSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEventsSampleUndefined: Self = StObject.set(x, "userEventsSample", js.undefined)
    
    @scala.inline
    def setUserEventsSampleVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEventsSample", js.Array(value :_*))
  }
}
