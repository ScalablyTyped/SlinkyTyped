package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySeriesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
    * This is added after the main summary if present.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
    * series main summary. Each series type has two modes:
    *
    * 1. This series type is the only series type used in the chart
    *
    * 2. This is a combination chart with multiple series types
    *
    * If a definition does not exist for the specific series type and mode, the
    * 'default' lang definitions are used.
    */
  var summary: js.UndefOr[LangAccessibilitySeriesSummaryOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
    * there are multiple xAxes in the chart.
    */
  var xAxisDescription: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
    * there are multiple yAxes in the chart.
    */
  var yAxisDescription: js.UndefOr[String] = js.native
}

object LangAccessibilitySeriesOptions {
  @scala.inline
  def apply(): LangAccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySeriesOptionsOps[Self <: LangAccessibilitySeriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: LangAccessibilitySeriesSummaryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisDescription")(js.undefined)
        ret
    }
  }
  
}

