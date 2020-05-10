package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new
    * data in charts. If addPoint or addSeries is used, and only one
    * series/point is added, the `newPointAnnounce` and `newSeriesAnnounce`
    * strings are used. The `...Single` versions will be used if there is only
    * one chart on the page, and the `...Multiple` versions will be used if
    * there are multiple charts on the page. For all other new data events, the
    * `newDataAnnounce` string will be used.
    */
  var announceNewData: js.UndefOr[LangAccessibilityAnnounceNewDataOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
    */
  var axis: js.UndefOr[LangAccessibilityAxisOptions] = js.native
  var chartContainerLabel: js.UndefOr[String] = js.native
  var chartHeading: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
    * This is added to the chart information region.
    *
    * If there is only a single series type used in the chart, we use the
    * format string for the series type, or default if missing. There is one
    * format string for cases where there is only a single series in the chart,
    * and one for multiple series of the same type.
    */
  var chartTypes: js.UndefOr[LangAccessibilityChartTypesOptions] = js.native
  var credits: js.UndefOr[String] = js.native
  var defaultChartTitle: js.UndefOr[String] = js.native
  var drillUpButton: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
    * for accessibility module.
    */
  var exporting: js.UndefOr[LangAccessibilityExportingOptions] = js.native
  var legendItem: js.UndefOr[String] = js.native
  var legendLabel: js.UndefOr[String] = js.native
  var mapZoomIn: js.UndefOr[String] = js.native
  var mapZoomOut: js.UndefOr[String] = js.native
  var rangeSelectorButton: js.UndefOr[String] = js.native
  var rangeSelectorMaxInput: js.UndefOr[String] = js.native
  var rangeSelectorMinInput: js.UndefOr[String] = js.native
  var resetZoomButton: js.UndefOr[String] = js.native
  var screenReaderRegionLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
    * series types. For more dynamic control over the series element
    * descriptions, see accessibility.seriesDescriptionFormatter.
    */
  var series: js.UndefOr[LangAccessibilitySeriesOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
    * series types. The relevant description is added to the screen reader
    * information region when these series types are used.
    */
  var seriesTypeDescriptions: js.UndefOr[LangAccessibilitySeriesTypeDescriptionsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
    * Announced by screen readers.
    */
  var svgContainerEnd: js.UndefOr[String] = js.native
  var svgContainerLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
    * SVG element. Leave this empty to disable adding the title element.
    * Browsers will display this content when hovering over elements in the
    * chart. Assistive technology may use this element to label the chart.
    */
  var svgContainerTitle: js.UndefOr[String] = js.native
  var tableSummary: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
    * formatting numbers for screen readers. Note that many screen readers will
    * not handle space as a thousands separator, and will consider "11 700" as
    * two numbers.
    *
    * Set to `null` to use the separator defined in lang.thousandsSep.
    */
  var thousandsSep: js.UndefOr[String] = js.native
  var viewAsDataTable: js.UndefOr[String] = js.native
}

object LangAccessibilityOptions {
  @scala.inline
  def apply(): LangAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityOptions]
  }
  @scala.inline
  implicit class LangAccessibilityOptionsOps[Self <: LangAccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnounceNewData(value: LangAccessibilityAnnounceNewDataOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announceNewData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnounceNewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announceNewData")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: LangAccessibilityAxisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withChartContainerLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartContainerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartContainerLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartContainerLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withChartHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withChartTypes(value: LangAccessibilityChartTypesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withCredits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credits")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChartTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChartTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChartTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChartTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillUpButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillUpButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillUpButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillUpButton")(js.undefined)
        ret
    }
    @scala.inline
    def withExporting(value: LangAccessibilityExportingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporting")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMapZoomIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapZoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapZoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withMapZoomOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapZoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapZoomOut")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorMaxInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorMaxInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorMaxInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorMaxInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorMinInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorMinInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorMinInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorMinInput")(js.undefined)
        ret
    }
    @scala.inline
    def withResetZoomButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoomButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetZoomButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoomButton")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderRegionLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderRegionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderRegionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderRegionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: LangAccessibilitySeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesTypeDescriptions(value: LangAccessibilitySeriesTypeDescriptionsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesTypeDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTypeDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgContainerEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgContainerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgContainerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgContainerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgContainerLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgContainerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgContainerLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgContainerLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgContainerTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgContainerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgContainerTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgContainerTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandsSep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandsSep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSep")(js.undefined)
        ret
    }
    @scala.inline
    def withViewAsDataTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewAsDataTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewAsDataTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewAsDataTable")(js.undefined)
        ret
    }
  }
  
}

