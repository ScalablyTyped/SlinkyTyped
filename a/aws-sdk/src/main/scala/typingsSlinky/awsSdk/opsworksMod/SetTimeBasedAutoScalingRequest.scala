package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimeBasedAutoScalingRequest extends js.Object {
  /**
    * An AutoScalingSchedule with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object SetTimeBasedAutoScalingRequest {
  @scala.inline
  def apply(InstanceId: String): SetTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimeBasedAutoScalingRequest]
  }
  @scala.inline
  implicit class SetTimeBasedAutoScalingRequestOps[Self <: SetTimeBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScalingSchedule(value: WeeklyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingSchedule")(js.undefined)
        ret
    }
  }
  
}

