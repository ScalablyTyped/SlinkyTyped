package typingsSlinky.angularStrap.mgcrea.ngStrap.datepicker

import typingsSlinky.angularStrap.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var dateType: js.UndefOr[String] = js.native
  var daysOfWeekDisabled: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var disabledDates: js.UndefOr[js.Array[IDatepickerDateRange]] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var iconLeft: js.UndefOr[String] = js.native
  var iconRight: js.UndefOr[String] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var minView: js.UndefOr[Double] = js.native
  var modelDateFormat: js.UndefOr[String] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[js.Date] = js.native
  var startView: js.UndefOr[Double] = js.native
  var startWeek: js.UndefOr[Double] = js.native
  var template: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[String] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
}

object IDatepickerOptions {
  @scala.inline
  def apply(): IDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerOptions]
  }
  @scala.inline
  implicit class IDatepickerOptionsOps[Self <: IDatepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateType")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeekDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeekDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double | Hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[IDatepickerDateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minView")(js.undefined)
        ret
    }
    @scala.inline
    def withModelDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeHide(value: /* datepicker */ IDatepicker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeShow(value: /* datepicker */ IDatepicker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: /* datepicker */ IDatepicker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* datepicker */ IDatepicker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startView")(js.undefined)
        ret
    }
    @scala.inline
    def withStartWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

