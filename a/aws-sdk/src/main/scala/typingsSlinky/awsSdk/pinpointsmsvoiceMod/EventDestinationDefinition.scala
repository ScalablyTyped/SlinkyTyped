package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationDefinition extends js.Object {
  var CloudWatchLogsDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.CloudWatchLogsDestination] = js.native
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  var KinesisFirehoseDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.KinesisFirehoseDestination] = js.native
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  var SnsDestination: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.SnsDestination] = js.native
}

object EventDestinationDefinition {
  @scala.inline
  def apply(): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestinationDefinition]
  }
  @scala.inline
  implicit class EventDestinationDefinitionOps[Self <: EventDestinationDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
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
    def withMatchingEventTypes(value: EventTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchingEventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchingEventTypes")(js.undefined)
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

