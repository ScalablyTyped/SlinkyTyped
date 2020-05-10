package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  /**
    * The list of job states that will trigger a notification for this job.
    */
  var JobStatesToNotify: js.UndefOr[JobStateList] = js.native
  /**
    * Any change in job state will trigger a notification for this job.
    */
  var NotifyAll: js.UndefOr[Boolean] = js.native
  /**
    * The new SNS TopicArn that you want to associate with this job. You can create Amazon Resource Names (ARNs) for topics by using the CreateTopic Amazon SNS API action. You can subscribe email addresses to an Amazon SNS topic through the AWS Management Console, or by using the Subscribe AWS Simple Notification Service (SNS) API action.
    */
  var SnsTopicARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.SnsTopicARN] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobStatesToNotify(value: JobStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatesToNotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatesToNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatesToNotify")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicARN(value: SnsTopicARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicARN")(js.undefined)
        ret
    }
  }
  
}

