package typingsSlinky.calHeatmap.mod.global.CalHeatMap

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  /** Called after drawing the empty calendar, and before filling it with data. */
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  			 * Called after getting the data from source, but before filling the calendar.
  			 * This callback must return a json object formatted in the expected data format.
  			 * afterLoadData() is used to do some works on the data, especially when the data source is not returning data in the expected format.
  			 */
  var afterLoadData: js.UndefOr[js.Function1[/* data */ js.Any, DataFormat]] = js.native
  /**
  			 * Called after shifting the calendar one domain forward.
  			 * The date argument is the start date of the domain that was added.
  			 */
  var afterLoadNextDomain: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  /**
  			 * Called after shifting the calendar one domain back.
  			 * The date argument is the start date of the domain that was added.
  			 */
  var afterLoadPreviousDomain: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  // ================================================
  // Other
  // ================================================
  /** Animation duration, in milliseconds. Default value: 500 */
  var animationDuration: js.UndefOr[Double] = js.native
  /** Space between each subDomain cell, in pixel. Default: 2 */
  var cellPadding: js.UndefOr[Double] = js.native
  /** subDomain cell's border radius, for rounder corner, in pixel. Default: 0 */
  var cellRadius: js.UndefOr[Double] = js.native
  /** Size of each subDomain cell, in pixels. Default: 10 */
  var cellSize: js.UndefOr[Double] = js.native
  /**
  			 * Control the number of columns to split the domain dates into. Default: null
  			 * Each domain is split into an arbitrary number of columns (or rows depending on the
  			 * reading direction). You can overwrite that number with colLimit, and force all dates on the
  			 * same line, or split them into more columns.
  			 * That setting limit the maximum number of columns, and doesn't necessary means that each rows will
  			 * contains that number of columns.
  			 */
  var colLimit: js.UndefOr[Double] = js.native
  /**
  			 * Whether to consider missing date:value couple in the data source as equal to 0.  Default: false
  			 * By default, when the a date is not associated to a value, it's considered as null, and rendered as a no value cell.
  			 * You should ask yourself, if the API is not returning result for a date, is it because there is really no value
  			 * associated to this date, or because it's supposed to be equal to 0, and it's skipped in order to save bandwidth ?
  			 */
  var considerMissingDataAsZero: js.UndefOr[Boolean] = js.native
  /**
  			 * Data used to fill the calendar. Default: ""
  			 * String is interpreted as a URL to an API, which should be returning the data used to fill the calendar.
  			 */
  var data: js.UndefOr[String | js.Object] = js.native
  /**
  			 * Engine used to parse the data. Default: json
  			 * Valid values:
  			 *  "json" - Interpret the data as json.
  			 *  "csv"  - Interpret the data as csv.
  			 *  "tsv"  - Interpret the data exactly like csv, but are delimited with a tab character, instead of comma.
  			 *  "txt"  - Just return the data as a string.
  			 */
  var dataType: js.UndefOr[String] = js.native
  /** Whether to display the legend. Default: true */
  var displayLegend: js.UndefOr[Boolean] = js.native
  /**
  			 * Type of domain. Default: "hour"
  			 * Valid domains: {"hour", "day", "week", "month", "year"}
  			 */
  var domain: js.UndefOr[String] = js.native
  /**
  			 * Whether to enable domain dynamic width and height. Default: true
  			 * Some domain>subdomain couple, like month>days, doesn't always have the same number of
  			 * subDomain cells. Some months have 6 weeks, some only 4.
  			 * With dynamic dimension enabled, the domain width and height will be adjusted to fit the
  			 * domain content, whereas when it's disabled, all domains will have the same dimension : the biggest.
  			 */
  var domainDynamicDimension: js.UndefOr[Boolean] = js.native
  /** Space between each domain, in pixel. Default: 2 */
  var domainGutter: js.UndefOr[Double] = js.native
  /**
  			 * Format of the domain label.
  			 * Works exactly like subDomainDateFormat, and will format the domain label with any string accepted by d3.time.format(), or a function.
  			 * To not display the domain label, set domainLabelFormat to "" (empty string).
  			 */
  var domainLabelFormat: js.UndefOr[String | js.Function] = js.native
  /**
  			 * Margin around each domain, in pixel. Default: [0,0,0,0]
  			 * Ordered like in CSS (top, right, bottom, left), it also accepts CSS like values
  			 */
  var domainMargin: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  			 * Highlight selected subDomain cells. Default: false
  			 * Takes an array of Date object. Can also accepts the now string, equivalent to Date.now().
  			 */
  var highlight: js.UndefOr[String | (js.Array[_ | js.Date | String])] = js.native
  // ================================================
  // i18n
  // ================================================
  /**
  			 * Name of the entity you're representing on the calendar.
  			 * Takes an array of string, with the first index as the singular form, and the second index the plural form.
  			 * For the lazy, you can also pass a simple string, ar a single element array, and it'll automatically guess
  			 * the plural form, as long as it's the singular form plus the "s" suffix.
  			 */
  var itemName: js.UndefOr[String | js.Array[String]] = js.native
  /**
  			 * The calendar instance namespace.
  			 * If you have more than one instance of Cal-Heatmap, you should assign each instance its own namespace, in order to isolate each instance event handler.
  			 */
  var itemNamespace: js.UndefOr[String] = js.native
  // ================================================
  // Presentation
  // ================================================
  /** DOM node to insert the calendar in. Default: "#cal-heatmap" */
  var itemSelector: js.UndefOr[String | HTMLElement | Element | EventTarget] = js.native
  /** Position and alignment of the domain label. */
  var label: js.UndefOr[Label] = js.native
  // ================================================
  // Legend
  // ================================================
  /** Assign each range of values to a color. Default: [10, 20, 30, 40] */
  var legend: js.UndefOr[js.Array[Double]] = js.native
  /** Padding between each legend cell, in pixels. Default: 2 */
  var legendCellPadding: js.UndefOr[Double] = js.native
  /** Size of the legend cells, in pixels. Default: 10 */
  var legendCellSize: js.UndefOr[Double] = js.native
  /**
  			 * Set of colors to automagically compute the heatmap colors.
  			 * Instead of relying on the CSS for your heatmap's colors, you can also set the heatmap's colors directly with
  			 * cal-heatmap on initialization, or even dynamically change them after.
  			 * All legend settings can be changed dynamically after calendar initialisation, with setLegend().
  			 */
  var legendColors: js.UndefOr[LegendColor | js.Array[String]] = js.native
  /**
  			 * Horizontal position of the legend. Default: "left"
  			 * Valid values:
  			 *  "left"   - Align the legend to the left
  			 *  "center" - Center the legend
  			 *  "right"  - Align the legend to the right
  			 */
  var legendHorizontalPosition: js.UndefOr[String] = js.native
  /** Margin around the legend, in pixels. Default: [10, 0, 0, 0] */
  var legendMargin: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
  			 * Orientation of the legend. Default: "horizontal"
  			 * legendOrientation is best used together with legendHorizontalPosition when the legend is positioned on the side.
  			 * Valid values:
  			 *  "horizontal" - Legend is displayed horizontally, from left to right
  			 *  "vertical"   - Legend is displayed vertically, from top to bottom
  			 */
  var legendOrientation: js.UndefOr[String] = js.native
  /**
  			 * Formatting of the legend title, displayed when hovering a legend cell.
  			 * Some template strings are available, and enclosed in braces.
  			 *  {name}  Name of the entity represented in the calendar (see itemName)
  			 *  {min}   The first value of the legend array.
  			 *  {max}   The last value of the legend array.
  			 *  {down}  The lower bound of a color
  			 *  {up}    The upper bound of a color
  			 */
  var legendTitleFormat: js.UndefOr[LegendTitleTemplates] = js.native
  /**
  			 * Vertical position of the legend. Default: "bottom"
  			 * Valid values:
  			 *  "top"    - Place the legend above the calendar
  			 *  "center" - Place the legend on the calendar's side
  			 *             Use with legendHorizontalPosition, to position the legend on the left (default) or on the right.
  			 *  "bottom" - Place the legend on below the calendar
  			 */
  var legendVerticalPosition: js.UndefOr[String] = js.native
  /** Upper limit of the domain navigation, preventing navigating beyond a certain date. Default: null */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
  			 * Lower limit of the domain navigation, preventing navigating beyond a certain date. Default: null
  			 * When set, calling previous() will only work only until the leftmost domain containing minDate.
  			 * Like with start, minDate does not have to be precise, and just have to be a date inside the domain.
  			 * previous() will always return true, unless the domain containing minDate is reached, in which case, it'll return false.
  			 */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
  			 * Will attach the next() event to the specified element, on a mouse click, shifting the calendar one domain forward. Default value: false
  			 * If you want to shift by more than one domain, see the next() method.
  			 */
  var nextSelector: js.UndefOr[String | HTMLElement] = js.native
  // ================================================
  // Events
  // ================================================
  /** Called after a mouse click event on a subDomain cell. */
  var onClick: js.UndefOr[js.Function2[/* date */ js.Date, /* value */ Double, Unit]] = js.native
  /**
  			 * Called after drawing and filling the calendar.
  			 * Useful in case you're loading data via ajax, as it's loading data asynchronously. This event will wait for the ajax
  			 * request to complete before triggering.
  			 * This event will only trigger once, on the initial setup. See afterLoadPreviousDomain and afterLoadNextDomain for
  			 * callback events after a domain navigation.
  			 */
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  			 * Triggered after next(), when the incoming domain is containing maxDate.
  			 * See onMinDomainReached().
  			 */
  var onMaxDomainReached: js.UndefOr[js.Function1[/* reached */ Boolean, Unit]] = js.native
  /**
  			 * Triggered after previous(), when the incoming domain is containing minDate.
  			 * When the leftmost domain set by minDate is loaded into the calendar, onMinDomainReached() will be triggered with true as argument.
  			 * This event is useful if you want to disable your previous button, since there is no more previous domains to load.
  			 * In order to reverse the action, onMinDomainReached() will be called with false as argument afer next(), only once, and only if the
  			 * leftmost domain is not the lower limit domain anymore.
  			 */
  var onMinDomainReached: js.UndefOr[js.Function1[/* reached */ Boolean, Unit]] = js.native
  /**
  			 * Will attach the previous() event to the specified element, on a mouse click, shifting the calendar one domain back. Default value: false
  			 * If you want to shift by more than one domain, see the previous() method.
  			 */
  var previousSelector: js.UndefOr[String | HTMLElement] = js.native
  /** Number of domain to display. Default: 12 */
  var range: js.UndefOr[Double] = js.native
  /** Control the number of rows to split the domain dates into. Default: null
  			 * If rowLimit and colLimit are both used, rowLimit will be ignored. */
  var rowLimit: js.UndefOr[Double] = js.native
  // ================================================
  // Data
  // ================================================
  /**
  			 * Starting date of the calendar. Default: new Date()
  			 * It doesn't have to be precise, the calendar will not start at that date, but at the first domain containing that date.
  			 */
  var start: js.UndefOr[js.Date] = js.native
  /**
  			 * Type of subDomain. Default: "min"
  			 * Valid subDomains: {"min", "x_min", "hour", "x_hour", "day", "x_day", "week", "x_week", "month", "x_month"}
  			 */
  var subDomain: js.UndefOr[String] = js.native
  /**
  			 * Format of the {date} template string inside subDomainTitleFormat.
  			 * {date} is by default formatted according to the subDomain type.
  			 * subDomainFormat can accept any string with directive accepted by d3.time.format(), like "%Y-%m-%d".
  			 * As d3.time.format() will only output English dates, subDomainDateFormat can also accept a function,
  			 * with the subDomain date as the argument.
  			 */
  var subDomainDateFormat: js.UndefOr[String | js.Function] = js.native
  /**
  			 * Format of the text inside a subDomain cell.
  			 * Disabled by default, you can display a text inside each subDomain cell.
  			 * Works exactly like subDomainDateFormat, except that the function takes the cell value as second argument.
  			 */
  var subDomainTextFormat: js.UndefOr[String | js.Function] = js.native
  /**
  			 * Format of the title displayed when hovering a subDomain.
  			 * Some template strings are available, and enclosed in braces.
  			 *  {name}       Name of the entity represented in the calendar (see itemName)
  			 *  {count}      The value associated to the date.
  			 *  {date}       The date of the cell. It's automatically formatted according to the type of subDomain.
  			 *               See subDomainDateFormat to further customize that date formatting.
  			 *  {connector}  An English preposition placed before a datetime (on Monday, at 15:00, etc.). Each subDomain
  			 *               have their own default connector, corresponding to the default date format.
  			 */
  var subDomainTitleFormat: js.UndefOr[SubDomainFormatTemplates] = js.native
  /** Whether to display a tooltip when hovering over a date. Default: false */
  var tooltip: js.UndefOr[Boolean] = js.native
  /** To display the calendar vertically, with each domain one under the other. Default: false */
  var verticalOrientation: js.UndefOr[Boolean] = js.native
  /** Whether to start the week on Monday, instead of Sunday. Default: true */
  var weekStartOnMonday: js.UndefOr[Boolean] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoadData(value: /* data */ js.Any => DataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoadNextDomain(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadNextDomain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLoadNextDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadNextDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoadPreviousDomain(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadPreviousDomain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLoadPreviousDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadPreviousDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCellPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withColLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withConsiderMissingDataAsZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerMissingDataAsZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsiderMissingDataAsZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerMissingDataAsZero")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainDynamicDimension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDynamicDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainDynamicDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDynamicDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainLabelFormat(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainMargin(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: String | (js.Array[_ | js.Date | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemName(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(js.undefined)
        ret
    }
    @scala.inline
    def withItemNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelectorElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSelectorEventTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSelectorHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSelector(value: String | HTMLElement | Element | EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self = {
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
    def withLegend(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendCellPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCellPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendCellPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCellPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendColors(value: LegendColor | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendColors")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendHorizontalPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendHorizontalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendHorizontalPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendHorizontalPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendMargin(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendTitleFormat(value: LegendTitleTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendTitleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendTitleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendTitleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendVerticalPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendVerticalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendVerticalPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendVerticalPosition")(js.undefined)
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
    def withNextSelectorHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSelector(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* date */ js.Date, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMaxDomainReached(value: /* reached */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMaxDomainReached")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMaxDomainReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMaxDomainReached")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMinDomainReached(value: /* reached */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMinDomainReached")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMinDomainReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMinDomainReached")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSelectorHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSelector(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRowLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Date): Self = {
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
    @scala.inline
    def withSubDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withSubDomainDateFormat(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDomainDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSubDomainTextFormat(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainTextFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDomainTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainTextFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSubDomainTitleFormat(value: SubDomainFormatTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainTitleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDomainTitleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainTitleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStartOnMonday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartOnMonday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStartOnMonday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartOnMonday")(js.undefined)
        ret
    }
  }
  
}

