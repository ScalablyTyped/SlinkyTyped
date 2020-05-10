package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestination extends js.Object {
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
    * The types of events that Amazon Pinpoint sends to the specified event destinations.
    */
  var MatchingEventTypes: EventTypes = js.native
  /**
    * A name that identifies the event destination.
    */
  var Name: EventDestinationName = js.native
  /**
    * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
    */
  var PinpointDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.PinpointDestination] = js.native
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.SnsDestination] = js.native
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
    def withMatchingEventTypes(value: EventTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchingEventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: EventDestinationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchDestination(value: CloudWatchDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisFirehoseDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisFirehoseDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withPinpointDestination(value: PinpointDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PinpointDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinpointDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PinpointDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsDestination(value: SnsDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsDestination")(js.undefined)
        ret
    }
  }
  
}

