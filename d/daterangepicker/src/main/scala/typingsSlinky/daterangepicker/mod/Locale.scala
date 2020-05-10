package typingsSlinky.daterangepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  /**
    * Text for apply label.
    */
  var applyLabel: js.UndefOr[String] = js.native
  /**
    * Text for cancel label.
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * Text for the custom range label.
    */
  var customRangeLabel: js.UndefOr[String] = js.native
  /**
    * Weekday names displayed in the header of calendar.
    */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  /**
    * The first day of the week (0-6, Sunday to Saturday).
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    * Format of the date string. example: 'YYYY-MM-DD'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Text for fromLabel label.
    */
  var fromLabel: js.UndefOr[String] = js.native
  /**
    * Month names used in the month select boxes.
    */
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Separator between the startDate and endDate in the attached input element. Example: ' - '
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Text for toLabel label.
    */
  var toLabel: js.UndefOr[String] = js.native
  /**
    * Text for the week label.
    */
  var weekLabel: js.UndefOr[String] = js.native
}

object Locale {
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRangeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRangeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRangeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRangeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeek(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(js.undefined)
        ret
    }
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
    def withFromLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLabel")(js.undefined)
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
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withToLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekLabel")(js.undefined)
        ret
    }
  }
  
}

