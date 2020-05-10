package typingsSlinky.bootstrapTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimepickerOptions extends js.Object {
  var appendWidgetTo: js.UndefOr[String] = js.native
  var defaultTime: js.UndefOr[String | Boolean | js.Date] = js.native
  var disableFocus: js.UndefOr[Boolean] = js.native
  var disableMousewheel: js.UndefOr[Boolean] = js.native
  var explicitMode: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[TimepickerIconOptions] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var maxHours: js.UndefOr[Double] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var modalBackdrop: js.UndefOr[Boolean] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var showInputs: js.UndefOr[Boolean] = js.native
  var showMeridian: js.UndefOr[Boolean] = js.native
  var showSeconds: js.UndefOr[Boolean] = js.native
  var snapToStep: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String | Boolean] = js.native
}

object TimepickerOptions {
  @scala.inline
  def apply(): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerOptions]
  }
  @scala.inline
  implicit class TimepickerOptionsOps[Self <: TimepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendWidgetTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendWidgetTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendWidgetTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendWidgetTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTime(value: String | Boolean | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMousewheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: TimepickerIconOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHours")(js.undefined)
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
    def withModalBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalBackdrop")(js.undefined)
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
    def withShowInputs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeridian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeridian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToStep")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String | Boolean): Self = {
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
  }
  
}

