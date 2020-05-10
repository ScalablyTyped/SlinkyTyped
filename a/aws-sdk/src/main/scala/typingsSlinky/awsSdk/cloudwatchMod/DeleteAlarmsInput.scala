package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAlarmsInput extends js.Object {
  /**
    * The alarms to be deleted.
    */
  var AlarmNames: typingsSlinky.awsSdk.cloudwatchMod.AlarmNames = js.native
}

object DeleteAlarmsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): DeleteAlarmsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmsInput]
  }
  @scala.inline
  implicit class DeleteAlarmsInputOps[Self <: DeleteAlarmsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmNames(value: AlarmNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

