package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAlarmRequest extends js.Object {
  /**
    * The name of the alarm to delete.
    */
  var alarmName: ResourceName = js.native
}

object DeleteAlarmRequest {
  @scala.inline
  def apply(alarmName: ResourceName): DeleteAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmRequest]
  }
  @scala.inline
  implicit class DeleteAlarmRequestOps[Self <: DeleteAlarmRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarmName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

