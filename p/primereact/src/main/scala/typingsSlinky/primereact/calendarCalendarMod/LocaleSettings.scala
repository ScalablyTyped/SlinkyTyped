package typingsSlinky.primereact.calendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleSettings extends js.Object {
  var clear: String = js.native
  var dayNames: js.Array[String] = js.native
  var dayNamesMin: js.Array[String] = js.native
  var dayNamesShort: js.Array[String] = js.native
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  var monthNames: js.Array[String] = js.native
  var monthNamesShort: js.Array[String] = js.native
  var today: String = js.native
}

object LocaleSettings {
  @scala.inline
  def apply(
    clear: String,
    dayNames: js.Array[String],
    dayNamesMin: js.Array[String],
    dayNamesShort: js.Array[String],
    monthNames: js.Array[String],
    monthNamesShort: js.Array[String],
    today: String
  ): LocaleSettings = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesMin = dayNamesMin.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSettings]
  }
  @scala.inline
  implicit class LocaleSettingsOps[Self <: LocaleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayNamesMin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
  }
  
}

