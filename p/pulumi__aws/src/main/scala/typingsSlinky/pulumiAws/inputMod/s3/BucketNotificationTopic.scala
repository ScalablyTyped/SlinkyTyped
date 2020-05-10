package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketNotificationTopic extends js.Object {
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: Input[js.Array[Input[String]]] = js.native
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies Amazon SNS topic ARN.
    */
  var topicArn: Input[String] = js.native
}

object BucketNotificationTopic {
  @scala.inline
  def apply(events: Input[js.Array[Input[String]]], topicArn: Input[String]): BucketNotificationTopic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationTopic]
  }
  @scala.inline
  implicit class BucketNotificationTopicOps[Self <: BucketNotificationTopic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSuffix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

