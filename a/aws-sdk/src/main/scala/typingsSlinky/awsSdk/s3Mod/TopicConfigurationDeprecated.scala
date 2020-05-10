package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicConfigurationDeprecated extends js.Object {
  /**
    * Bucket event for which to send notifications.
    */
  var Event: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Event] = js.native
  /**
    * A collection of events related to objects
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.
    */
  var Topic: js.UndefOr[TopicArn] = js.native
}

object TopicConfigurationDeprecated {
  @scala.inline
  def apply(): TopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicConfigurationDeprecated]
  }
  @scala.inline
  implicit class TopicConfigurationDeprecatedOps[Self <: TopicConfigurationDeprecated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: EventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: NotificationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: TopicArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Topic")(js.undefined)
        ret
    }
  }
  
}

