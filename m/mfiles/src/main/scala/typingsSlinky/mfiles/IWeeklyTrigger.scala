package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFTriggerWeekDay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWeeklyTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  var WeeksInterval: Double = js.native
}

object IWeeklyTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, WeeksInterval: Double): IWeeklyTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], WeeksInterval = WeeksInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeeklyTrigger]
  }
  @scala.inline
  implicit class IWeeklyTriggerOps[Self <: IWeeklyTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysOfTheWeek(value: MFTriggerWeekDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaysOfTheWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeeksInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeksInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

