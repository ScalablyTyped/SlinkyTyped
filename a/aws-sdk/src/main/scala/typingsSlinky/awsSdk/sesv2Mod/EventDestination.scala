package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestination extends js.Object {
  
  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  var CloudWatchDestination: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.CloudWatchDestination] = js.native
  
  /**
    * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.Enabled] = js.native
  
  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  var KinesisFirehoseDestination: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.KinesisFirehoseDestination] = js.native
  
  /**
    * The types of events that Amazon SES sends to the specified event destinations.
    */
  var MatchingEventTypes: EventTypes = js.native
  
  /**
    * A name that identifies the event destination.
    */
  var Name: EventDestinationName = js.native
  
  /**
    * An object that defines an Amazon Pinpoint project destination for email events. You can send email event data to a Amazon Pinpoint project to view metrics using the Transactional Messaging dashboards that are built in to Amazon Pinpoint. For more information, see Transactional Messaging Charts in the Amazon Pinpoint User Guide.
    */
  var PinpointDestination: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.PinpointDestination] = js.native
  
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.SnsDestination] = js.native
}
object EventDestination {
  
  @scala.inline
  def apply(MatchingEventTypes: EventTypes, Name: EventDestinationName): EventDestination = {
    val __obj = js.Dynamic.literal(MatchingEventTypes = MatchingEventTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestination]
  }
  
  @scala.inline
  implicit class EventDestinationOps[Self <: EventDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchingEventTypesVarargs(value: EventType*): Self = this.set("MatchingEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = this.set("MatchingEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EventDestinationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchDestination(value: CloudWatchDestination): Self = this.set("CloudWatchDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchDestination: Self = this.set("CloudWatchDestination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = this.set("KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseDestination: Self = this.set("KinesisFirehoseDestination", js.undefined)
    
    @scala.inline
    def setPinpointDestination(value: PinpointDestination): Self = this.set("PinpointDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinpointDestination: Self = this.set("PinpointDestination", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = this.set("SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsDestination: Self = this.set("SnsDestination", js.undefined)
  }
}
