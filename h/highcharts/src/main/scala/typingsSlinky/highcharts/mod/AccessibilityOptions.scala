package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add a shortcut
    * button in the screen reader information region to show the data table.
    */
  var addTableShortcut: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
    * to screen reader users. Useful for dynamic data applications and
    * drilldown.
    *
    * Keep in mind that frequent announcements will not be useful to users, as
    * they won't have time to explore the new data. For these applications,
    * consider making snapshots of the data accessible, and do the
    * announcements in batches.
    */
  var announceNewData: js.UndefOr[AccessibilityAnnounceNewDataOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
    * range of datetime axes.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var axisRangeDateFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
    * components to the accessibility module. Should be an object mapping
    * component names to instances of classes inheriting from the
    * Highcharts.AccessibilityComponent base class. Remember to add the
    * component to the keyboardNavigation.order for the keyboard navigation to
    * be usable.
    */
  var customComponents: js.UndefOr[js.Object] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
    * descriptions to charts with a single series.
    */
  var describeSingleSeries: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
    *
    * **Note: Prefer using caption instead.**
    *
    * If the Accessibility module is loaded, this option is included by default
    * as a long description of the chart in the hidden screen reader
    * information region.
    *
    * Note: Since Highcharts now supports captions, it is preferred to define
    * the description there, as the caption benefits all users. The caption
    * will be available to screen reader users. If this option is defined
    * instead, the caption is hidden from screen reader users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
    * functionality for the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Theme to apply to the chart when
    * Windows High Contrast Mode is detected.
    */
  var highContrastTheme: js.UndefOr[js.Object] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
    */
  var keyboardNavigation: js.UndefOr[AccessibilityKeyboardNavigationOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
    * create for screen reader users. More landmarks can make navigation with
    * screen readers easier, but can be distracting if there are lots of charts
    * on the page. Three modes are available:
    *
    * - `all`: Adds regions for all series, legend, menu, information region.
    *
    * - `one`: Adds a single landmark per chart.
    *
    * - `disabled`: No landmarks are added.
    */
  var landmarkVerbosity: js.UndefOr[OptionsLandmarkVerbosityValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
    * the "View as Data Table" link in the screen reader region.
    *
    * By default Highcharts will insert and set focus to a data table
    * representation of the chart.
    */
  var onTableAnchorClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
    * datetime axes when describing them to screen reader users.
    *
    * Defaults to the same format as in tooltip.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var pointDateFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
    * the date/time format used with points on datetime axes when describing
    * them to screen reader users. Receives one argument, `point`, referring to
    * the point to describe. Should return a date format string compatible with
    * dateFormat.
    */
  var pointDateFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for point descriptions. Receives one argument,
    * `point`, referring to the point to describe. Should return a string with
    * the description of the point for a screen reader user. If `false` is
    * returned, the default formatter will be used for that point.
    */
  var pointDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer expose information about individual points
    * to screen readers.
    *
    * Set to `false` to disable.
    */
  var pointDescriptionThreshold: js.UndefOr[Boolean | Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer allow keyboard navigation for it.
    *
    * Set to `false` to disable.
    */
  var pointNavigationThreshold: js.UndefOr[Boolean | Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
    * in the point descriptions. Uses tooltip.valueDecimals if not defined.
    */
  var pointValueDecimals: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
    * the point descriptions. Uses tooltip.valuePrefix if not defined.
    */
  var pointValuePrefix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
    * the point descriptions. Uses tooltip.valueSuffix if not defined.
    */
  var pointValueSuffix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
    * the HTML contents of the hidden screen reader information region.
    * Receives one argument, `chart`, referring to the chart object. Should
    * return a string with the HTML content of the region. By default this
    * returns an automatic description of the chart.
    *
    * The button to view the chart as a data table will be added automatically
    * after the custom HTML content if enabled.
    */
  var screenReaderSectionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Chart_]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for series descriptions. Receives one argument,
    * `series`, referring to the series to describe. Should return a string
    * with the description of the series for a screen reader user. If `false`
    * is returned, the default formatter will be used for that series.
    */
  var seriesDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Series]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
    * type.
    *
    * If the Accessibility module is loaded, this will be included in the
    * description of the chart in the screen reader information region.
    *
    * Highcharts will by default attempt to guess the chart type, but for more
    * complex charts it is recommended to specify this property for clarity.
    */
  var typeDescription: js.UndefOr[String] = js.native
}

object AccessibilityOptions {
  @scala.inline
  def apply(): AccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityOptions]
  }
  @scala.inline
  implicit class AccessibilityOptionsOps[Self <: AccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTableShortcut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTableShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTableShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTableShortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnounceNewData(value: AccessibilityAnnounceNewDataOptions): Self = {
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
    def withAxisRangeDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRangeDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisRangeDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisRangeDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomComponents(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withDescribeSingleSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describeSingleSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribeSingleSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describeSingleSeries")(js.undefined)
        ret
    }
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHighContrastTheme(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrastTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighContrastTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highContrastTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavigation(value: AccessibilityKeyboardNavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmarkVerbosity(value: OptionsLandmarkVerbosityValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarkVerbosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmarkVerbosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landmarkVerbosity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTableAnchorClick(value: /* evt */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableAnchorClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTableAnchorClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTableAnchorClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPointDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPointDateFormatter(value: Point => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDateFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointDateFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDateFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPointDescriptionFormatter(value: Point => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointDescriptionFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPointDescriptionThreshold(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointDescriptionThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointDescriptionThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withPointNavigationThreshold(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointNavigationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointNavigationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointNavigationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withPointValueDecimals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointValueDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointValueDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointValueDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withPointValuePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointValuePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointValuePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointValuePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPointValueSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointValueSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointValueSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointValueSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderSectionFormatter(value: Chart_ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderSectionFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScreenReaderSectionFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderSectionFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesDescriptionFormatter(value: Series => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesDescriptionFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeriesDescriptionFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesDescriptionFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDescription")(js.undefined)
        ret
    }
  }
  
}

