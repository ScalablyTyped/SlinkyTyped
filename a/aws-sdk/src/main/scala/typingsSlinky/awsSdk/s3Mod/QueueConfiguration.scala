package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueConfiguration extends js.Object {
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: EventList = js.native
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var QueueArn: typingsSlinky.awsSdk.s3Mod.QueueArn = js.native
}

object QueueConfiguration {
  @scala.inline
  def apply(Events: EventList, QueueArn: QueueArn): QueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfiguration]
  }
  @scala.inline
  implicit class QueueConfigurationOps[Self <: QueueConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: EventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueArn(value: QueueArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: NotificationConfigurationFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
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
  }
  
}

