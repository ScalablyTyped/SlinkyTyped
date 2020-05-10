package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunNotification extends js.Object {
  /**
    * The date of the notification.
    */
  var date: js.Date = js.native
  /**
    * The Boolean value that specifies whether the notification represents an error.
    */
  var error: Bool = js.native
  /**
    * The event for which a notification is sent.
    */
  var event: InspectorEvent = js.native
  /**
    * The message included in the notification.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The status code of the SNS notification.
    */
  var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.native
  /**
    * The SNS topic to which the SNS notification is sent.
    */
  var snsTopicArn: js.UndefOr[Arn] = js.native
}

object AssessmentRunNotification {
  @scala.inline
  def apply(date: js.Date, error: Bool, event: InspectorEvent): AssessmentRunNotification = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunNotification]
  }
  @scala.inline
  implicit class AssessmentRunNotificationOps[Self <: AssessmentRunNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: InspectorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsPublishStatusCode(value: AssessmentRunNotificationSnsStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsPublishStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsPublishStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsPublishStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopicArn")(js.undefined)
        ret
    }
  }
  
}

