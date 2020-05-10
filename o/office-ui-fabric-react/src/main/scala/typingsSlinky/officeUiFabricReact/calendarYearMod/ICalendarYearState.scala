package typingsSlinky.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarYearState extends js.Object {
  var fromYear: Double = js.native
  var navigatedYear: js.UndefOr[Double] = js.native
  var selectedYear: js.UndefOr[Double] = js.native
}

object ICalendarYearState {
  @scala.inline
  def apply(fromYear: Double): ICalendarYearState = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearState]
  }
  @scala.inline
  implicit class ICalendarYearStateOps[Self <: ICalendarYearState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigatedYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatedYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedYear")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedYear")(js.undefined)
        ret
    }
  }
  
}

