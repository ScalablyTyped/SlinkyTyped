package typingsSlinky.materialUi.MaterialUI.propTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait utils extends js.Object {
  def addDays(date: js.Date, days: Double): js.Date = js.native
  def addMonths(date: js.Date, months: Double): js.Date = js.native
  def addYears(date: js.Date, years: Double): js.Date = js.native
  def getFirstDayOfMonth(date: js.Date): js.Date = js.native
  def getWeekArray(date: js.Date, firstDayOfWeek: Double): js.Array[js.Array[js.Date | Null]] = js.native
  def getYear(date: js.Date): Double = js.native
  def monthDiff(date1: js.Date, date2: js.Date): Double = js.native
  def setYear(date: js.Date, year: Double): js.Date = js.native
}

object utils {
  @scala.inline
  def apply(
    addDays: (js.Date, Double) => js.Date,
    addMonths: (js.Date, Double) => js.Date,
    addYears: (js.Date, Double) => js.Date,
    getFirstDayOfMonth: js.Date => js.Date,
    getWeekArray: (js.Date, Double) => js.Array[js.Array[js.Date | Null]],
    getYear: js.Date => Double,
    monthDiff: (js.Date, js.Date) => Double,
    setYear: (js.Date, Double) => js.Date
  ): utils = {
    val __obj = js.Dynamic.literal(addDays = js.Any.fromFunction2(addDays), addMonths = js.Any.fromFunction2(addMonths), addYears = js.Any.fromFunction2(addYears), getFirstDayOfMonth = js.Any.fromFunction1(getFirstDayOfMonth), getWeekArray = js.Any.fromFunction2(getWeekArray), getYear = js.Any.fromFunction1(getYear), monthDiff = js.Any.fromFunction2(monthDiff), setYear = js.Any.fromFunction2(setYear))
    __obj.asInstanceOf[utils]
  }
  @scala.inline
  implicit class utilsOps[Self <: utils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDays(value: (js.Date, Double) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDays")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddMonths(value: (js.Date, Double) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonths")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddYears(value: (js.Date, Double) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addYears")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFirstDayOfMonth(value: js.Date => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstDayOfMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWeekArray(value: (js.Date, Double) => js.Array[js.Array[js.Date | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetYear(value: js.Date => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonthDiff(value: (js.Date, js.Date) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthDiff")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetYear(value: (js.Date, Double) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYear")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

