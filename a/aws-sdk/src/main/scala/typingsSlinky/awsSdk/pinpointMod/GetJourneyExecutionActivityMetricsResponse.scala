package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJourneyExecutionActivityMetricsResponse extends StObject {
  
  var JourneyExecutionActivityMetricsResponse: typingsSlinky.awsSdk.pinpointMod.JourneyExecutionActivityMetricsResponse = js.native
}
object GetJourneyExecutionActivityMetricsResponse {
  
  @scala.inline
  def apply(JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse): GetJourneyExecutionActivityMetricsResponse = {
    val __obj = js.Dynamic.literal(JourneyExecutionActivityMetricsResponse = JourneyExecutionActivityMetricsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionActivityMetricsResponse]
  }
  
  @scala.inline
  implicit class GetJourneyExecutionActivityMetricsResponseMutableBuilder[Self <: GetJourneyExecutionActivityMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneyExecutionActivityMetricsResponse(value: JourneyExecutionActivityMetricsResponse): Self = StObject.set(x, "JourneyExecutionActivityMetricsResponse", value.asInstanceOf[js.Any])
  }
}
