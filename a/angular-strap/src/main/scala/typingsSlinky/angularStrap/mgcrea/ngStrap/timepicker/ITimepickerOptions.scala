package typingsSlinky.angularStrap.mgcrea.ngStrap.timepicker

import typingsSlinky.angularStrap.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimepickerOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var arrowBehaviour: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var hourStep: js.UndefOr[Double] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var iconDown: js.UndefOr[String] = js.native
  var iconUp: js.UndefOr[String] = js.native
   // TODO
  var length: js.UndefOr[Double] = js.native
   // TODO
  var maxTime: js.UndefOr[js.Date] = js.native
  var minTime: js.UndefOr[js.Date] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var modelTimeFormat: js.UndefOr[String] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var roundDisplay: js.UndefOr[Boolean] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var template: js.UndefOr[String] = js.native
  var timeFormat: js.UndefOr[String] = js.native
  var timeType: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[String] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
}

object ITimepickerOptions {
  @scala.inline
  def apply(): ITimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepickerOptions]
  }
  @scala.inline
  implicit class ITimepickerOptionsOps[Self <: ITimepickerOptions] (val x: Self) extends AnyVal {
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
    def withArrowBehaviour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowBehaviour")(js.undefined)
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
    def withHourStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(js.undefined)
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
    def withIconDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDown")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUp")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(js.undefined)
        ret
    }
    @scala.inline
    def withModelTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeHide(value: /* timepicker */ ITimepicker => Unit): Self = {
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
    def withOnBeforeShow(value: /* timepicker */ ITimepicker => Unit): Self = {
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
    def withOnHide(value: /* timepicker */ ITimepicker => Unit): Self = {
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
    def withOnShow(value: /* timepicker */ ITimepicker => Unit): Self = {
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
    def withRoundDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(js.undefined)
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
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeType")(js.undefined)
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

