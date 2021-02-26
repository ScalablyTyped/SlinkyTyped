package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJourneyExecutionMetricsResponse extends StObject {
  
  var JourneyExecutionMetricsResponse: typingsSlinky.awsSdk.pinpointMod.JourneyExecutionMetricsResponse = js.native
}
object GetJourneyExecutionMetricsResponse {
  
  @scala.inline
  def apply(JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse): GetJourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionMetricsResponse = JourneyExecutionMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionMetricsResponse]
  }
  
  @scala.inline
  implicit class GetJourneyExecutionMetricsResponseMutableBuilder[Self <: GetJourneyExecutionMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneyExecutionMetricsResponse(value: JourneyExecutionMetricsResponse): Self = StObject.set(x, "JourneyExecutionMetricsResponse", value.asInstanceOf[js.Any])
  }
}
