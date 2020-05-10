package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: ResourceId = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: ResourceId = js.native
}

object Alarm {
  @scala.inline
  def apply(AlarmARN: ResourceId, AlarmName: ResourceId): Alarm = {
    val __obj = js.Dynamic.literal(AlarmARN = AlarmARN.asInstanceOf[js.Any], AlarmName = AlarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
  @scala.inline
  implicit class AlarmOps[Self <: Alarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmARN(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlarmName(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

