package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFTriggerMonth
import typingsSlinky.mfiles.MFiles.MFTriggerWeekDay
import typingsSlinky.mfiles.MFiles.MFTriggerWeekOfMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMonthlyDOWTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  var Months: MFTriggerMonth = js.native
  var WhichWeek: MFTriggerWeekOfMonth = js.native
}

object IMonthlyDOWTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, Months: MFTriggerMonth, WhichWeek: MFTriggerWeekOfMonth): IMonthlyDOWTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], WhichWeek = WhichWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonthlyDOWTrigger]
  }
  @scala.inline
  implicit class IMonthlyDOWTriggerOps[Self <: IMonthlyDOWTrigger] (val x: Self) extends AnyVal {
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
    def withMonths(value: MFTriggerMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhichWeek(value: MFTriggerWeekOfMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhichWeek")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

