package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueConfigurationDeprecated extends js.Object {
  var Event: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Event] = js.native
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type. 
    */
  var Queue: js.UndefOr[QueueArn] = js.native
}

object QueueConfigurationDeprecated {
  @scala.inline
  def apply(): QueueConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueConfigurationDeprecated]
  }
  @scala.inline
  implicit class QueueConfigurationDeprecatedOps[Self <: QueueConfigurationDeprecated] (val x: Self) extends AnyVal {
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
    def withQueue(value: QueueArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queue")(js.undefined)
        ret
    }
  }
  
}

