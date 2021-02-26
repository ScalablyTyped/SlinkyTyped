package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDimensions extends StObject {
  
  /**
    * One or more custom attributes that your application reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.native
  
  /**
    * The name of the event that causes the campaign to be sent or the journey activity to be performed. This can be a standard event that Amazon Pinpoint generates, such as _email.delivered. For campaigns, this can also be a custom event that's specific to your application. For information about standard events, see Streaming Amazon Pinpoint Events in the Amazon Pinpoint Developer Guide.
    */
  var EventType: js.UndefOr[SetDimension] = js.native
  
  /**
    * One or more custom metrics that your application reports to Amazon Pinpoint. You can use these metrics as selection criteria when you create an event filter.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.native
}
object EventDimensions {
  
  @scala.inline
  def apply(): EventDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDimensions]
  }
  
  @scala.inline
  implicit class EventDimensionsMutableBuilder[Self <: EventDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapOfAttributeDimension): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setEventType(value: SetDimension): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setMetrics(value: MapOfMetricDimension): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
  }
}
