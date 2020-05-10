package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledJobTrigger extends js.Object {
  var BeginDay: Double = js.native
  var BeginMonth: Double = js.native
  var BeginYear: Double = js.native
  var EndDay: Double = js.native
  var EndMonth: Double = js.native
  var EndYear: Double = js.native
  var StartHour: Double = js.native
  var StartMinute: Double = js.native
  var Type: ITriggerType = js.native
  var ValidEndDate: Boolean = js.native
  def Clone(): IScheduledJobTrigger = js.native
}

object IScheduledJobTrigger {
  @scala.inline
  def apply(
    BeginDay: Double,
    BeginMonth: Double,
    BeginYear: Double,
    Clone: () => IScheduledJobTrigger,
    EndDay: Double,
    EndMonth: Double,
    EndYear: Double,
    StartHour: Double,
    StartMinute: Double,
    Type: ITriggerType,
    ValidEndDate: Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal(BeginDay = BeginDay.asInstanceOf[js.Any], BeginMonth = BeginMonth.asInstanceOf[js.Any], BeginYear = BeginYear.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EndDay = EndDay.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], StartHour = StartHour.asInstanceOf[js.Any], StartMinute = StartMinute.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidEndDate = ValidEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
  @scala.inline
  implicit class IScheduledJobTriggerOps[Self <: IScheduledJobTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IScheduledJobTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ITriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidEndDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidEndDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

