package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommenderConfigurationsResponse extends StObject {
  
  var ListRecommenderConfigurationsResponse: typingsSlinky.awsSdk.pinpointMod.ListRecommenderConfigurationsResponse = js.native
}
object GetRecommenderConfigurationsResponse {
  
  @scala.inline
  def apply(ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse): GetRecommenderConfigurationsResponse = {
    val __obj = js.Dynamic.literal(ListRecommenderConfigurationsResponse = ListRecommenderConfigurationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationsResponse]
  }
  
  @scala.inline
  implicit class GetRecommenderConfigurationsResponseMutableBuilder[Self <: GetRecommenderConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListRecommenderConfigurationsResponse(value: ListRecommenderConfigurationsResponse): Self = StObject.set(x, "ListRecommenderConfigurationsResponse", value.asInstanceOf[js.Any])
  }
}
