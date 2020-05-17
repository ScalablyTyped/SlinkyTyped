package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A calendar as returned in a sequence by {@link XLocaleData.getAllCalendars()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait Calendar extends js.Object {
  var Days: SafeArray[CalendarItem] = js.native
  var Default: Boolean = js.native
  var Eras: SafeArray[CalendarItem] = js.native
  var MinimumNumberOfDaysForFirstWeek: Double = js.native
  var Months: SafeArray[CalendarItem] = js.native
  var Name: String = js.native
  var StartOfWeek: String = js.native
}

object Calendar {
  @scala.inline
  def apply(
    Days: SafeArray[CalendarItem],
    Default: Boolean,
    Eras: SafeArray[CalendarItem],
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    Name: String,
    StartOfWeek: String
  ): Calendar = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StartOfWeek = StartOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: SafeArray[CalendarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEras(value: SafeArray[CalendarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumNumberOfDaysForFirstWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumNumberOfDaysForFirstWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: SafeArray[CalendarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

