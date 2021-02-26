package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestination extends StObject {
  
  var CloudWatchLogsDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.CloudWatchLogsDestination] = js.native
  
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  var KinesisFirehoseDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.KinesisFirehoseDestination] = js.native
  
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  
  /**
    * A name that identifies the event destination configuration.
    */
  var Name: js.UndefOr[String] = js.native
  
  var SnsDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.SnsDestination] = js.native
}
object EventDestination {
  
  @scala.inline
  def apply(): EventDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestination]
  }
  
  @scala.inline
  implicit class EventDestinationMutableBuilder[Self <: EventDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsDestinationUndefined: Self = StObject.set(x, "CloudWatchLogsDestination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingEventTypesUndefined: Self = StObject.set(x, "MatchingEventTypes", js.undefined)
    
    @scala.inline
    def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
