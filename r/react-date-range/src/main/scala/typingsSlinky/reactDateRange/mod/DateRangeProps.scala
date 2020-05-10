package typingsSlinky.reactDateRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangeProps
  extends Range
     with CommonCalendarProps {
  /** default: 2 */
  var calendars: js.UndefOr[Double] = js.native
  /** default: false */
  var linkedCalendars: js.UndefOr[Boolean] = js.native
  /** default: false */
  var rangedCalendars: js.UndefOr[Boolean] = js.native
  /** default: none */
  var ranges: js.UndefOr[js.Object] = js.native
  /** default: none */
  var specialDays: js.UndefOr[js.Array[DateContainerType]] = js.native
  /** default: false */
  var twoStepChange: js.UndefOr[Boolean] = js.native
}

object DateRangeProps {
  @scala.inline
  def apply(): DateRangeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeProps]
  }
  @scala.inline
  implicit class DateRangePropsOps[Self <: DateRangeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedCalendars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedCalendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedCalendars")(js.undefined)
        ret
    }
    @scala.inline
    def withRangedCalendars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedCalendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangedCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedCalendars")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialDays(value: js.Array[DateContainerType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDays")(js.undefined)
        ret
    }
    @scala.inline
    def withTwoStepChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoStepChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwoStepChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoStepChange")(js.undefined)
        ret
    }
  }
  
}

