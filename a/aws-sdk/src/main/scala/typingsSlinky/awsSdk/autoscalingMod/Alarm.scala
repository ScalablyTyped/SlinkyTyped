package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[XmlStringMaxLen255] = js.native
}

object Alarm {
  @scala.inline
  def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  @scala.inline
  implicit class AlarmOps[Self <: Alarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmARN")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(js.undefined)
        ret
    }
  }
  
}

