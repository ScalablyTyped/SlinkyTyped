package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaselineDate extends js.Object {
  var baselineDate: js.UndefOr[AnonConverterTooltipDisplay] = js.native
  var baselineEnd: js.UndefOr[AnonConverterTooltipDisplay] = js.native
  var baselineStart: js.UndefOr[AnonConverterTooltipDisplay] = js.native
  var date: js.UndefOr[AnonConverterTooltipDisplay] = js.native
  var end: js.UndefOr[AnonConverterTooltipDisplay] = js.native
  var label: js.UndefOr[AnonTooltipDisplayTooltipLabel] = js.native
  var progress: js.UndefOr[AnonConverterTooltipDisplayTooltipLabel] = js.native
  var row: js.UndefOr[AnonTooltipDisplayTooltipLabel] = js.native
  var start: js.UndefOr[AnonConverterTooltipDisplay] = js.native
}

object AnonBaselineDate {
  @scala.inline
  def apply(): AnonBaselineDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaselineDate]
  }
  @scala.inline
  implicit class AnonBaselineDateOps[Self <: AnonBaselineDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineDate(value: AnonConverterTooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineDate")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineEnd(value: AnonConverterTooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineStart(value: AnonConverterTooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: AnonConverterTooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: AnonConverterTooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonTooltipDisplayTooltipLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: AnonConverterTooltipDisplayTooltipLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: AnonTooltipDisplayTooltipLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: AnonConverterTooltipDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

