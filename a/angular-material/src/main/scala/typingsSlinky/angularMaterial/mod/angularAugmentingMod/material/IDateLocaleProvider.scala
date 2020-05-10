package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateLocaleProvider extends js.Object {
  var dates: js.Array[String] = js.native
  var days: js.Array[String] = js.native
  var firstDayOfWeek: Double = js.native
  var months: js.Array[String] = js.native
  var msgCalendar: String = js.native
  var msgOpenCalendar: String = js.native
  var shortDays: js.Array[String] = js.native
  var shortMonths: js.Array[String] = js.native
  def formatDate(date: js.Date): String = js.native
  def monthHeaderFormatter(date: js.Date): String = js.native
  def parseDate(dateString: String): js.Date = js.native
  def weekNumberFormatter(weekNumber: Double): String = js.native
}

object IDateLocaleProvider {
  @scala.inline
  def apply(
    dates: js.Array[String],
    days: js.Array[String],
    firstDayOfWeek: Double,
    formatDate: js.Date => String,
    monthHeaderFormatter: js.Date => String,
    months: js.Array[String],
    msgCalendar: String,
    msgOpenCalendar: String,
    parseDate: String => js.Date,
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    weekNumberFormatter: Double => String
  ): IDateLocaleProvider = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], formatDate = js.Any.fromFunction1(formatDate), monthHeaderFormatter = js.Any.fromFunction1(monthHeaderFormatter), months = months.asInstanceOf[js.Any], msgCalendar = msgCalendar.asInstanceOf[js.Any], msgOpenCalendar = msgOpenCalendar.asInstanceOf[js.Any], parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], weekNumberFormatter = js.Any.fromFunction1(weekNumberFormatter))
    __obj.asInstanceOf[IDateLocaleProvider]
  }
  @scala.inline
  implicit class IDateLocaleProviderOps[Self <: IDateLocaleProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatDate(value: js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonthHeaderFormatter(value: js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgCalendar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgOpenCalendar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgOpenCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseDate(value: String => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShortDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekNumberFormatter(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberFormatter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

