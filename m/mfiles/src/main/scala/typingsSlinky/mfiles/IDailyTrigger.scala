package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDailyTrigger extends js.Object {
  var DaysInterval: Double = js.native
}

object IDailyTrigger {
  @scala.inline
  def apply(DaysInterval: Double): IDailyTrigger = {
    val __obj = js.Dynamic.literal(DaysInterval = DaysInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDailyTrigger]
  }
  @scala.inline
  implicit class IDailyTriggerOps[Self <: IDailyTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaysInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

