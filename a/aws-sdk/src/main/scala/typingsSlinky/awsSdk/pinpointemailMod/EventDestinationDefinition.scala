package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestinationDefinition extends StObject {
  
  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  var CloudWatchDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.CloudWatchDestination] = js.native
  
  /**
    * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.Enabled] = js.native
  
  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  var KinesisFirehoseDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.KinesisFirehoseDestination] = js.native
  
  /**
    * An array that specifies which events Amazon Pinpoint should send to the destinations in this EventDestinationDefinition.
    */
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  
  /**
    * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
    */
  var PinpointDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.PinpointDestination] = js.native
  
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.SnsDestination] = js.native
}
object EventDestinationDefinition {
  
  @scala.inline
  def apply(): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestinationDefinition]
  }
  
  @scala.inline
  implicit class EventDestinationDefinitionMutableBuilder[Self <: EventDestinationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchDestination(value: CloudWatchDestination): Self = StObject.set(x, "CloudWatchDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchDestinationUndefined: Self = StObject.set(x, "CloudWatchDestination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
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
    def setPinpointDestination(value: PinpointDestination): Self = StObject.set(x, "PinpointDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointDestinationUndefined: Self = StObject.set(x, "PinpointDestination", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
