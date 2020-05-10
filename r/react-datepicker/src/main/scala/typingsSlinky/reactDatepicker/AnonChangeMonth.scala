package typingsSlinky.reactDatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangeMonth extends js.Object {
  var date: js.Date = js.native
  var nextMonthButtonDisabled: Boolean = js.native
  var nextYearButtonDisabled: Boolean = js.native
  var prevMonthButtonDisabled: Boolean = js.native
  var prevYearButtonDisabled: Boolean = js.native
  def changeMonth(month: Double): Unit = js.native
  def changeYear(year: Double): Unit = js.native
  def decreaseMonth(): Unit = js.native
  def decreaseYear(): Unit = js.native
  def increaseMonth(): Unit = js.native
  def increaseYear(): Unit = js.native
}

object AnonChangeMonth {
  @scala.inline
  def apply(
    changeMonth: Double => Unit,
    changeYear: Double => Unit,
    date: js.Date,
    decreaseMonth: () => Unit,
    decreaseYear: () => Unit,
    increaseMonth: () => Unit,
    increaseYear: () => Unit,
    nextMonthButtonDisabled: Boolean,
    nextYearButtonDisabled: Boolean,
    prevMonthButtonDisabled: Boolean,
    prevYearButtonDisabled: Boolean
  ): AnonChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = js.Any.fromFunction1(changeMonth), changeYear = js.Any.fromFunction1(changeYear), date = date.asInstanceOf[js.Any], decreaseMonth = js.Any.fromFunction0(decreaseMonth), decreaseYear = js.Any.fromFunction0(decreaseYear), increaseMonth = js.Any.fromFunction0(increaseMonth), increaseYear = js.Any.fromFunction0(increaseYear), nextMonthButtonDisabled = nextMonthButtonDisabled.asInstanceOf[js.Any], nextYearButtonDisabled = nextYearButtonDisabled.asInstanceOf[js.Any], prevMonthButtonDisabled = prevMonthButtonDisabled.asInstanceOf[js.Any], prevYearButtonDisabled = prevYearButtonDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangeMonth]
  }
  @scala.inline
  implicit class AnonChangeMonthOps[Self <: AnonChangeMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeMonth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChangeYear(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreaseMonth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDecreaseYear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncreaseMonth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncreaseYear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextMonthButtonDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonthButtonDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextYearButtonDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearButtonDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevMonthButtonDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMonthButtonDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevYearButtonDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYearButtonDisabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

