package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerFormatDateOptions extends js.Object {
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
}

object DatepickerFormatDateOptions {
  @scala.inline
  def apply(): DatepickerFormatDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerFormatDateOptions]
  }
  @scala.inline
  implicit class DatepickerFormatDateOptionsOps[Self <: DatepickerFormatDateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDayNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(js.undefined)
        ret
    }
  }
  
}

