package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeToEventRequest extends js.Object {
  /**
    * The event for which you want to receive SNS notifications.
    */
  var event: InspectorEvent = js.native
  /**
    * The ARN of the assessment template that is used during the event for which you want to receive SNS notifications.
    */
  var resourceArn: Arn = js.native
  /**
    * The ARN of the SNS topic to which the SNS notifications are sent.
    */
  var topicArn: Arn = js.native
}

object SubscribeToEventRequest {
  @scala.inline
  def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): SubscribeToEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToEventRequest]
  }
  @scala.inline
  implicit class SubscribeToEventRequestOps[Self <: SubscribeToEventRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: InspectorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

