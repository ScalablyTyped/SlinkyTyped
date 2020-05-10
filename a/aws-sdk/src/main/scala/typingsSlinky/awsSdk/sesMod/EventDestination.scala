package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestination extends js.Object {
  /**
    * An object that contains the names, default values, and sources of the dimensions associated with an Amazon CloudWatch event destination.
    */
  var CloudWatchDestination: js.UndefOr[typingsSlinky.awsSdk.sesMod.CloudWatchDestination] = js.native
  /**
    * Sets whether Amazon SES publishes events to this destination when you send an email with the associated configuration set. Set to true to enable publishing to this destination; set to false to prevent publishing to this destination. The default value is false.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.sesMod.Enabled] = js.native
  /**
    * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
    */
  var KinesisFirehoseDestination: js.UndefOr[typingsSlinky.awsSdk.sesMod.KinesisFirehoseDestination] = js.native
  /**
    * The type of email sending events to publish to the event destination.
    */
  var MatchingEventTypes: EventTypes = js.native
  /**
    * The name of the event destination. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 64 characters.  
    */
  var Name: EventDestinationName = js.native
  /**
    * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
    */
  var SNSDestination: js.UndefOr[typingsSlinky.awsSdk.sesMod.SNSDestination] = js.native
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
    def withSNSDestination(value: SNSDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNSDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSDestination")(js.undefined)
        ret
    }
  }
  
}

