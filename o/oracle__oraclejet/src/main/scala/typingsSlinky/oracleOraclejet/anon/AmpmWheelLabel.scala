package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpmWheelLabel extends js.Object {
  var ampmWheelLabel: js.UndefOr[String] = js.native
  var cancelText: js.UndefOr[String] = js.native
  var currentTimeText: js.UndefOr[String] = js.native
  var dateTimeRange: js.UndefOr[MessageDetail] = js.native
  var hourWheelLabel: js.UndefOr[String] = js.native
  var minuteWheelLabel: js.UndefOr[String] = js.native
  var okText: js.UndefOr[String] = js.native
  var regexp: js.UndefOr[MessageSummary] = js.native
  var required: js.UndefOr[Hint] = js.native
  var tooltipTime: js.UndefOr[String] = js.native
  var tooltipTimeDisabled: js.UndefOr[String] = js.native
}

object AmpmWheelLabel {
  @scala.inline
  def apply(): AmpmWheelLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpmWheelLabel]
  }
  @scala.inline
  implicit class AmpmWheelLabelOps[Self <: AmpmWheelLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpmWheelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmWheelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpmWheelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampmWheelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTimeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTimeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimeText")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeRange(value: MessageDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withHourWheelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourWheelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourWheelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourWheelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteWheelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteWheelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteWheelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteWheelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexp(value: MessageSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Hint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTimeDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTimeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTimeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTimeDisabled")(js.undefined)
        ret
    }
  }
  
}

