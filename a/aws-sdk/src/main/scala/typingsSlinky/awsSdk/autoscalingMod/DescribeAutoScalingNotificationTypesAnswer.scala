package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
  /**
    * The notification types.
    */
  var AutoScalingNotificationTypes: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AutoScalingNotificationTypes] = js.native
}

object DescribeAutoScalingNotificationTypesAnswer {
  @scala.inline
  def apply(): DescribeAutoScalingNotificationTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoScalingNotificationTypesAnswer]
  }
  @scala.inline
  implicit class DescribeAutoScalingNotificationTypesAnswerOps[Self <: DescribeAutoScalingNotificationTypesAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingNotificationTypes(value: AutoScalingNotificationTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingNotificationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingNotificationTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingNotificationTypes")(js.undefined)
        ret
    }
  }
  
}

