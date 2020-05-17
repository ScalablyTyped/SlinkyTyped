package typingsSlinky.c3.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.c3.anon.Draggable
import typingsSlinky.c3.anon.Format
import typingsSlinky.c3.anon.LabelText
import typingsSlinky.c3.anon.Value
import typingsSlinky.c3.anon.`0`
import typingsSlinky.c3.c3Strings.asc
import typingsSlinky.c3.c3Strings.desc
import typingsSlinky.d3Color.mod.HSLColor
import typingsSlinky.d3Color.mod.RGBColor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /**
    * Set y axis the data related to.
    */
  var axes: js.UndefOr[StringDictionary[AxisName]] = js.native
  /**
    * Set custom data classes for styling.
    * If this option is specified, the element g for the data has an additional class that has the prefix `c3-target-` (e.g. `c3-target-additional-data1-class`).
    */
  var classes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Set color converter function.
    * The function is called for each data ID, for each data series, and for each individual point.
    */
  var color: js.UndefOr[
    js.Function2[
      /* color */ String, 
      /* d */ String | DataSeries | DataPoint, 
      String | RGBColor | HSLColor
    ]
  ] = js.native
  /**
    * Set color for each data.
    * If a function is specified, it is called once each with the data ID, the data series, and each point.
    */
  var colors: js.UndefOr[
    StringDictionary[
      String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
    ]
  ] = js.native
  /**
    * A list of columns, where the first element in each column is the ID and the remaining elements are data. If `url`, `json`, or `rows` are provided, this will be ignored.
    */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.native
  /**
    * Set text displayed when empty data.
    * Defaults to `""`.
    */
  var empty: js.UndefOr[LabelText] = js.native
  /**
    * For Stanford charts, specify the key of the epochs data, which maps values to their color.
    * Defaults to `"epochs"`.
    */
  var epochs: js.UndefOr[String] = js.native
  /**
    * Specify a filter function to selectively load data.
    * @param series The data series for which to decide whether to show or not.
    * @param index The index of the data series in the data.
    * @param allSeries Array of all data series, whether filtered or not.
    * @returns `true` if the series should be shown, `false` if it should be hidden.
    */
  var filter: js.UndefOr[
    js.Function3[
      /* series */ DataSeries, 
      /* index */ Double, 
      /* allSeries */ js.Array[DataSeries], 
      Boolean
    ]
  ] = js.native
  /**
    * Set groups for the data for stacking.
    */
  var groups: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * Specify headers for the data request if `data.url` is provided.
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * Hide each data when the chart appears.
    * If true specified, all of data will be hidden. If multiple ids specified as an array, those will be hidden.
    */
  var hide: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Convert data IDs with this function before creating chart.
    * @param id The original ID string.
    * @returns The converted ID string.
    */
  var idConverter: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  /**
    * Parse a JSON object for data. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. If `url` is provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.native
  /**
    * If `data.json` is provided and is in row form, these keys are used to pull the data from each row.
    */
  var keys: js.UndefOr[Value] = js.native
  /**
    * Show labels on each data points or set formatter function for data labels.
    * Control all labels with a boolean value or `format` function, or control behavior for individual data with a `format` object.
    */
  var labels: js.UndefOr[Boolean | Format | `0`] = js.native
  /**
    * Used if loading JSON via `data.url`.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Set custom data display names.
    */
  var names: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Set a callback for click event on each data point.
    * @param d The data point that was clicked.
    * @param element The element for the data point that was clicked.
    */
  var onclick: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.native
  /**
    * Set a callback for mouseout event on each data point.
    * @param d The data point that the mouse left.
    * @param element The element for that point. Not passed for some chart types, line 'line'.
    */
  var onmouseout: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
  ] = js.native
  /**
    * Set a callback for mouseover event on each data point.
    * @param d The data point that was moused over.
    * @param element The element for that point. Not passed for some chart types, line 'line'.
    */
  var onmouseover: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
  ] = js.native
  /**
    * Set a callback for data selection.
    * @param d The data point that was selected.
    * @param element The element for the data point that was selected.
    */
  var onselected: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.native
  /**
    * Set a callback for data deselection.
    * @param d The data point that was unselected.
    * @param element The element for the data point that was unselected.
    */
  var onunselected: js.UndefOr[
    js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]
  ] = js.native
  /**
    * Define the order of the data.
    * This option changes the order of stacking the data and pieces of pie/donut. If null specified, it will be the order the data loaded. If function specified, it will be used to sort the data
    * and it will recieve the data as argument.
    */
  var order: js.UndefOr[asc | desc | (js.Function1[/* repeated */ DataSeries, Double]) | Null] = js.native
  /**
    * Define regions for each data.
    * The values must be an array for each data and it should include an object that has start, end, style. If start is not set, the start will be the first data point. If end is not set, the
    * end will be the last data point.
    * Currently this option supports only line chart and dashed style. If this option specified, the line will be dashed only in the regions.
    */
  var regions: js.UndefOr[StringDictionary[js.Array[RegionOptions]]] = js.native
  /**
    * A list of rows, where the first row is the column names and the remaining rows are data.  If `url` or `json` are provided this will be ignored.
    */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.native
  var selection: js.UndefOr[Draggable] = js.native
  /**
    * Set chart type at once.
    * If this option is specified, the type will be applied to every data. This setting can be overwritten for individual data by `data.types`.
    */
  var `type`: js.UndefOr[ChartType] = js.native
  /**
    * Set chart type for each data.
    * This setting overwrites the chart-wide `data.type` setting.
    */
  var types: js.UndefOr[StringDictionary[ChartType]] = js.native
  /**
    * Load a CSV or JSON file from a URL. Note that this will not work if loading via the `"file://"` protocol as most browsers with block `XMLHTTPRequests`.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Specify the key of x values in the data.
    * We can show the data with non-index x values by this option. This option is required when the type of x axis is timeseries. If this option is set on category axis, the values of the data
    * on the key will be used for category names.
    */
  var x: js.UndefOr[String] = js.native
  /**
    * Set a format to parse string specifed as x.
    * Default is `"%Y-%m-%d"`.
    * @see https://github.com/d3/d3-time-format#locale_format For a list of valid format specifiers.
    */
  var xFormat: js.UndefOr[String] = js.native
  /**
    * Set to `true` to parse dates and times as local time.
    * **Experimental.**
    */
  var xLocaltime: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to sort x values.
    * **Experimental.**
    */
  var xSort: js.UndefOr[Boolean] = js.native
  /**
    * Specify the keys of the x values for each data.
    * This option can be used if we want to show the data that has different x values.
    */
  var xs: js.UndefOr[StringDictionary[String]] = js.native
}

object Data {
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: StringDictionary[AxisName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(
      value: (/* color */ String, /* d */ String | DataSeries | DataPoint) => String | RGBColor | HSLColor
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(
      value: StringDictionary[
          String | RGBColor | HSLColor | (js.Function1[/* d */ String | DataSeries | DataPoint, String | RGBColor | HSLColor])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Array[String | Primitive]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: LabelText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withEpochs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epochs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpochs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epochs")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* series */ DataSeries, /* index */ Double, /* allSeries */ js.Array[DataSeries]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withIdConverter(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idConverter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIdConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idConverter")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Boolean | Format | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(
      value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(
      value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ js.UndefOr[SVGElement], Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselected(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnunselected(value: js.ThisFunction2[/* this */ ChartAPI, /* d */ DataPoint, /* element */ SVGElement, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnunselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunselected")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderFunction1(value: /* repeated */ DataSeries => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrder(value: asc | desc | (js.Function1[/* repeated */ DataSeries, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(null)
        ret
    }
    @scala.inline
    def withRegions(value: StringDictionary[js.Array[RegionOptions]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[PrimitiveArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Draggable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChartType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: StringDictionary[ChartType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withXLocaltime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLocaltime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLocaltime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLocaltime")(js.undefined)
        ret
    }
    @scala.inline
    def withXSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSort")(js.undefined)
        ret
    }
    @scala.inline
    def withXs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(js.undefined)
        ret
    }
  }
  
}

