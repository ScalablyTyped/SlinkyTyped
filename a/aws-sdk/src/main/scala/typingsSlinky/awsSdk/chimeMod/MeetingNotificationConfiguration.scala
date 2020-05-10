package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingNotificationConfiguration extends js.Object {
  /**
    * The SNS topic ARN.
    */
  var SnsTopicArn: js.UndefOr[Arn] = js.native
  /**
    * The SQS queue ARN.
    */
  var SqsQueueArn: js.UndefOr[Arn] = js.native
}

object MeetingNotificationConfiguration {
  @scala.inline
  def apply(): MeetingNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingNotificationConfiguration]
  }
  @scala.inline
  implicit class MeetingNotificationConfigurationOps[Self <: MeetingNotificationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnsTopicArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSqsQueueArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqsQueueArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqsQueueArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqsQueueArn")(js.undefined)
        ret
    }
  }
  
}

