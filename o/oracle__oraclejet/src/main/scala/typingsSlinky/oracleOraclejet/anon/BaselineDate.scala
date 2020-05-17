package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaselineDate extends js.Object {
  var baselineDate: js.UndefOr[ConverterTooltipDisplay] = js.native
  var baselineEnd: js.UndefOr[ConverterTooltipDisplay] = js.native
  var baselineStart: js.UndefOr[ConverterTooltipDisplay] = js.native
  var date: js.UndefOr[ConverterTooltipDisplay] = js.native
  var end: js.UndefOr[ConverterTooltipDisplay] = js.native
  var label: js.UndefOr[TooltipDisplayTooltipLabel] = js.native
  var progress: js.UndefOr[ConverterTooltipDisplayTooltipLabel] = js.native
  var row: js.UndefOr[TooltipDisplayTooltipLabel] = js.native
  var start: js.UndefOr[ConverterTooltipDisplay] = js.native
}

object BaselineDate {
  @scala.inline
  def apply(): BaselineDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineDate]
  }
  @scala.inline
  implicit class BaselineDateOps[Self <: BaselineDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineDate(value: ConverterTooltipDisplay): Self = {
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
    def withBaselineEnd(value: ConverterTooltipDisplay): Self = {
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
    def withBaselineStart(value: ConverterTooltipDisplay): Self = {
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
    def withDate(value: ConverterTooltipDisplay): Self = {
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
    def withEnd(value: ConverterTooltipDisplay): Self = {
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
    def withLabel(value: TooltipDisplayTooltipLabel): Self = {
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
    def withProgress(value: ConverterTooltipDisplayTooltipLabel): Self = {
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
    def withRow(value: TooltipDisplayTooltipLabel): Self = {
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
    def withStart(value: ConverterTooltipDisplay): Self = {
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

