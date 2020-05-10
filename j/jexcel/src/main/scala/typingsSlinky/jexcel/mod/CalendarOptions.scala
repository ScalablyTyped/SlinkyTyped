package typingsSlinky.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Column options
// ----------------------------------------------------------------------
@js.native
trait CalendarOptions extends js.Object {
  /** Date format */
  var format: js.UndefOr[String] = js.native
  /** Fullscreen (this is automatic set for screensize < 800) */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Translations can be done here
    * Default: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    */
  var months: js.UndefOr[
    js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  ] = js.native
  // tslint:disable-next-line ban-types
  var onchange: js.UndefOr[js.Function] = js.native
  /** Events */
  // tslint:disable-next-line ban-types
  var onclose: js.UndefOr[js.Function] = js.native
  /** Placeholder */
  var placeholder: js.UndefOr[CellValue] = js.native
  /** Allow keyboard date entry */
  var readonly: js.UndefOr[Boolean] = js.native
  /** Show the reset button */
  var resetButton: js.UndefOr[Boolean] = js.native
  /** Show timepicker */
  var time: js.UndefOr[Boolean] = js.native
  /** Today is default */
  var today: js.UndefOr[Boolean] = js.native
  /** Value */
  var value: js.UndefOr[CellValue] = js.native
  /**
    * Default: ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
    */
  var weekdays: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.native
  /**
    * Default: ["S", "M", "T", "W", "T", "F", "S"]
    */
  var weekdays_short: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.native
}

object CalendarOptions {
  @scala.inline
  def apply(): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarOptions]
  }
  @scala.inline
  implicit class CalendarOptionsOps[Self <: CalendarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: CellValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withResetButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: CellValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Tuple7[String, String, String, String, String, String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays_short(value: js.Tuple7[String, String, String, String, String, String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays_short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays_short: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays_short")(js.undefined)
        ret
    }
  }
  
}

