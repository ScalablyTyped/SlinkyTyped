package typingsSlinky.fecha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18nSettings extends js.Object {
  var amPm: js.Tuple2[String, String] = js.native
  var dayNames: Days = js.native
  var dayNamesShort: Days = js.native
  var monthNames: Months = js.native
  var monthNamesShort: Months = js.native
  def DoFn(D: Double): String = js.native
}

object i18nSettings {
  @scala.inline
  def apply(
    DoFn: Double => String,
    amPm: js.Tuple2[String, String],
    dayNames: Days,
    dayNamesShort: Days,
    monthNames: Months,
    monthNamesShort: Months
  ): i18nSettings = {
    val __obj = js.Dynamic.literal(DoFn = js.Any.fromFunction1(DoFn), amPm = amPm.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nSettings]
  }
  @scala.inline
  implicit class i18nSettingsOps[Self <: i18nSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoFn(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAmPm(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayNames(value: Days): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayNamesShort(value: Days): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNames(value: Months): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNamesShort(value: Months): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

