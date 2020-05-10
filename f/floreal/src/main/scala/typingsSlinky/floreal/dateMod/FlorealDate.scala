package typingsSlinky.floreal.dateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlorealDate extends js.Object {
  def day(): Double = js.native
  def dayName(): String = js.native
  def dayOfDecade(): Double = js.native
  def dayOfMonth(): Double = js.native
  def dayOfWeek(): Double = js.native
  def dayOfYear(): Double = js.native
  def dayTitle(): String = js.native
  def decade(): Double = js.native
  def firstDayOfYear(): js.Date = js.native
  def isComplementaryDay(): Boolean = js.native
  def isYearSextile(): Boolean = js.native
  def month(): Double = js.native
  def monthName(): String = js.native
  def setDate(year: Double, month: Double, day: Double): Unit = js.native
  def setDay(day: Double): Unit = js.native
  def setMonth(month: Double): Unit = js.native
  def setYear(year: String): Unit = js.native
  def setYearDecimal(year: Double): Unit = js.native
  def toFullDateString(): String = js.native
  def toShortDateString(): String = js.native
  def year(): String = js.native
  def yearDecimal(): Double = js.native
}

object FlorealDate {
  @scala.inline
  def apply(
    day: () => Double,
    dayName: () => String,
    dayOfDecade: () => Double,
    dayOfMonth: () => Double,
    dayOfWeek: () => Double,
    dayOfYear: () => Double,
    dayTitle: () => String,
    decade: () => Double,
    firstDayOfYear: () => js.Date,
    isComplementaryDay: () => Boolean,
    isYearSextile: () => Boolean,
    month: () => Double,
    monthName: () => String,
    setDate: (Double, Double, Double) => Unit,
    setDay: Double => Unit,
    setMonth: Double => Unit,
    setYear: String => Unit,
    setYearDecimal: Double => Unit,
    toFullDateString: () => String,
    toShortDateString: () => String,
    year: () => String,
    yearDecimal: () => Double
  ): FlorealDate = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), dayName = js.Any.fromFunction0(dayName), dayOfDecade = js.Any.fromFunction0(dayOfDecade), dayOfMonth = js.Any.fromFunction0(dayOfMonth), dayOfWeek = js.Any.fromFunction0(dayOfWeek), dayOfYear = js.Any.fromFunction0(dayOfYear), dayTitle = js.Any.fromFunction0(dayTitle), decade = js.Any.fromFunction0(decade), firstDayOfYear = js.Any.fromFunction0(firstDayOfYear), isComplementaryDay = js.Any.fromFunction0(isComplementaryDay), isYearSextile = js.Any.fromFunction0(isYearSextile), month = js.Any.fromFunction0(month), monthName = js.Any.fromFunction0(monthName), setDate = js.Any.fromFunction3(setDate), setDay = js.Any.fromFunction1(setDay), setMonth = js.Any.fromFunction1(setMonth), setYear = js.Any.fromFunction1(setYear), setYearDecimal = js.Any.fromFunction1(setYearDecimal), toFullDateString = js.Any.fromFunction0(toFullDateString), toShortDateString = js.Any.fromFunction0(toShortDateString), year = js.Any.fromFunction0(year), yearDecimal = js.Any.fromFunction0(yearDecimal))
    __obj.asInstanceOf[FlorealDate]
  }
  @scala.inline
  implicit class FlorealDateOps[Self <: FlorealDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDayName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDayOfDecade(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfDecade")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDayOfMonth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDayOfWeek(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDayOfYear(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDayTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDecade(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decade")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirstDayOfYear(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsComplementaryDay(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplementaryDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsYearSextile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isYearSextile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMonth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMonthName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDate(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetDay(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYear(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYearDecimal(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYearDecimal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToFullDateString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFullDateString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToShortDateString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toShortDateString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYear(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYearDecimal(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearDecimal")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

