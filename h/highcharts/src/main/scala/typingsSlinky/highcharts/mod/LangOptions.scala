package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility
    * strings in the chart. Requires the accessibility module to be loaded. For
    * a description of the module and information on its features, see
    * Highcharts Accessibility.
    *
    * For more dynamic control over the accessibility functionality, see
    * accessibility.pointDescriptionFormatter,
    * accessibility.seriesDescriptionFormatter, and
    * accessibility.screenReaderSectionFormatter.
    */
  var accessibility: js.UndefOr[LangAccessibilityOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
    * tooltip title for the context menu holding print and export menu items.
    */
  var contextButtonTitle: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
    * in the `Highcharts.numberFormat` method unless otherwise specified in the
    * function arguments.
    */
  var decimalPoint: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var downloadCSV: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the JPEG download menu item.
    */
  var downloadJPEG: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the PDF download menu item.
    */
  var downloadPDF: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the PNG download menu item.
    */
  var downloadPNG: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the SVG download menu item.
    */
  var downloadSVG: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var downloadXLS: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highmaps) The text for the button that appears when drilling
    * down, linking back to the parent series. The parent series' name is
    * inserted for `{series.name}`.
    */
  var drillUpText: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock) What to show in a date field for invalid dates.
    * Defaults to an empty string.
    */
  var invalidDate: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
    * when the chart is set into the loading state following a call to
    * `chart.showLoading`.
    */
  var loading: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
    * names. Corresponds to the `%B` format in `Highcharts.dateFormat()`.
    */
  var months: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highcharts, Highstock) Configure the Popup strings in the chart.
    * Requires the `annotations.js` or `annotations-advanced.src.js` module to
    * be loaded.
    */
  var navigation: js.UndefOr[js.Object | LangNavigationOptions] = js.native
  /**
    * (Highcharts, Highstock) The text to display when the chart contains no
    * data.
    */
  var noData: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
    * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
    * which use symbols for 10^4, 10^8 and 10^12.
    */
  var numericSymbolMagnitude: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
    * high numbers in axis labels. Replacing any of the positions with `null`
    * causes the full number to be written. Setting `numericSymbols` to `null`
    * disables shortening altogether.
    */
  var numericSymbols: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var openInCloud: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
    * for the menu item to print the chart.
    */
  var printChart: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) The text for the label for the "from" input box in the
    * range selector.
    */
  var rangeSelectorFrom: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) The text for the label for the "to" input box in the
    * range selector.
    */
  var rangeSelectorTo: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) The text for the label for the range selector buttons.
    */
  var rangeSelectorZoom: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
    * when a chart is zoomed.
    */
  var resetZoom: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
    * appearing when a chart is zoomed.
    */
  var resetZoomTitle: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
    * names in abbreviated form. Corresponds to the `%b` format in
    * `Highcharts.dateFormat()`.
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
    * Sunday. If not specified, Highcharts uses the first three letters of the
    * `lang.weekdays` option.
    */
  var shortWeekdays: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
    * Requires the `stock-tools.js` module to be loaded.
    */
  var stockTools: js.UndefOr[js.Object | LangStockToolsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
    * used in the `Highcharts.numberFormat` method unless otherwise specified
    * in the function arguments. Defaults to a single space character, which is
    * recommended in ISO 31-0 and works across Anglo-American and continental
    * European languages.
    */
  var thousandsSep: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
    */
  var viewData: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. View the
    * chart in full screen.
    */
  var viewFullscreen: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
    * names.
    */
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highmaps) The title appearing on hovering the zoom in button. The text
    * itself defaults to "+" and can be changed in the button options.
    */
  var zoomIn: js.UndefOr[String] = js.native
  /**
    * (Highmaps) The title appearing on hovering the zoom out button. The text
    * itself defaults to "-" and can be changed in the button options.
    */
  var zoomOut: js.UndefOr[String] = js.native
}

object LangOptions {
  @scala.inline
  def apply(): LangOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangOptions]
  }
  @scala.inline
  implicit class LangOptionsOps[Self <: LangOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: LangAccessibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withContextButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadCSV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadCSV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadCSV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadCSV")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadJPEG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadJPEG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadJPEG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadJPEG")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadPDF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadPDF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPDF")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadPNG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPNG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadPNG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPNG")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadSVG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadSVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadSVG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadSVG")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadXLS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadXLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadXLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadXLS")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillUpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillUpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillUpText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillUpText")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: js.Object | LangNavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericSymbolMagnitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericSymbolMagnitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericSymbolMagnitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericSymbolMagnitude")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericSymbols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenInCloud(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInCloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenInCloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInCloud")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintChart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printChart")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorZoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withResetZoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withResetZoomTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoomTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetZoomTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetZoomTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShortMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withShortWeekdays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortWeekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortWeekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withStockTools(value: js.Object | LangStockToolsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stockTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStockTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stockTools")(js.undefined)
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
    def withViewData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewData")(js.undefined)
        ret
    }
    @scala.inline
    def withViewFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(js.undefined)
        ret
    }
  }
  
}

