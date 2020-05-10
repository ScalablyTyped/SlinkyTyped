package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.between
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.equal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramRangeSliderProperties extends WidgetProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.  When set, this value will render on the histogram with a line and an average symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to color bins with the same color of features in the view that fall into bins representing the same range of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#barCreatedFunction)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLineCreatedFunction)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines)
    */
  var dataLines: js.UndefOr[js.Array[HistogramRangeSliderDataLines]] = js.native
  /**
    * Sets the color of the histogram bars that are excluded based on the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType). For example, when a rangeType of `between` is used, all bars **not** between the slider thumbs will be rendered with the color set here.  To change the style of histogram bars representing included data based on the [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType), use the [includedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor)
    *
    * @default #d7e5f0
    */
  var excludedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * Sets the color of the histogram bars that are included in the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType). For example, when a rangeType of `between` is used, all bars between the slider thumbs will be rendered with the color set here.  To change the style of histogram bars representing excluded data based on the [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType), use the [excludedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor)
    *
    * @default #599dd4
    */
  var includedBarColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * A function used to format labels. Overrides the default label formatter.  By default labels are formatted in the following way:
    *   * When the data range is less than `10` (`(max - min) < 10`), labels are rounded based on the value set in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision) property.
    *   * When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision).
    *
    *
    * Use this property to override the behavior defined above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * The maximum value or upper bound of the slider. If the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) _in the constructor_ is greater than the `maxValue` set in this property, then the `maxValue` will update to match the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value or lower bound of the slider. If the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) _in the constructor_ is greater than the `minValue` set in this property, then the `minValue` will update to match the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Defines how slider thumb values should be rounded. This number indicates the number of decimal places slider thumb values should round to when they have been moved.  This value also indicates the precision of thumb [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labels) when the data range ([max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max) - [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)) is less than `10`.  When the data range is larger than `10`, [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labels) display with a precision of no more than two decimal places, though actual slider thumb values will maintain the precision specified in this property.  For example, given the default precision of `4`, and the following slider configuration, The label of the thumb will display two decimal places, but the precision of the actual thumb value will not be lost even when the user slides or moves the thumb.
    * ```js
    * const slider = new HistogramRangeSliderViewModel({
    *   min: 20,
    *   max: 100,  // data range of 80
    *   values: [50.4331],
    *   // thumb label will display 50.43
    *   // thumb value will maintain precision, so
    *   // value will remain at 50.4331
    * });
    * ```
    *
    * If the user manually enters a value that has a higher precision than what's indicated by
    * this property, the precision of that thumb value will be maintained until the thumb
    * is moved by the user. At that point, the value will be rounded according to the indicated precision.
    *
    * Keep in mind this property rounds thumb [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) and shouldn't be used exclusively
    * for formatting purposes. To format thumb `labels`, use the [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    * property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision)
    *
    * @default 4
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Indicates how the histogram bins should be rendered as the user slides the thumbs. By default, blue bars indicate data bins included in the range. Gray bars indicate data bins excluded from the range. These colors can be customized with the [includedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor) and [excludedBarColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor) properties.  This property also determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#generateWhereClause) for filtering purposes. The value set here determines the number of [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) allowed on the slider.  See the table below for a description and requirements of all possible values. `value1` refers to the value of the first thumb position. `value2` refers to the value of the final thumb position, if applicable.
    *
    * Possible Value | Number of [Values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values) | [Where clause](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#generateWhereClause)
    * ---------------|----------------------------|----------------------
    * equal | 1 | `${field} = ${value1}`
    * not-equal | 1 | `${field} <> ${value1}`
    * less-than | 1 | `${field} < ${value1}`
    * greater-than | 1 | `${field} > ${value1}`
    * at-most | 1 | `${field} <= ${value1}`
    * at-least | 1 | `${field} >= ${value1}`
    * between | 2 | `${field} BETWEEN ${value1} AND ${value2}`
    * not-between | 2 | `${field} NOT BETWEEN ${value1} AND ${value2}`
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType)
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
  ] = js.native
  /**
    * Indicates the standard deviation of the dataset. When set, computed [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines) will render on the histogram at the location of the given standard deviation above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
  /**
    * Indicates the number of standard deviation lines to render on the histogram from the [average].
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviationCount)
    *
    * @default 1
    */
  var standardDeviationCount: js.UndefOr[Double] = js.native
  /**
    * An array of either one or two numbers representing thumb positions on the slider. The number of values that should be indicated here depends on the associated [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The view model for the widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the esri/widgets/HistogramRangeSlider/HistogramRangeSliderViewModel class to access all properties and methods on the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HistogramRangeSliderViewModelProperties] = js.native
}

object HistogramRangeSliderProperties {
  @scala.inline
  def apply(): HistogramRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRangeSliderProperties]
  }
  @scala.inline
  implicit class HistogramRangeSliderPropertiesOps[Self <: HistogramRangeSliderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.undefined)
        ret
    }
    @scala.inline
    def withBarCreatedFunction(value: (/* index */ Double, /* element */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCreatedFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBarCreatedFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCreatedFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withBins(value: js.Array[Bin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLineCreatedFunction(
      value: (/* lineElement */ js.Any, /* labelElement */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLineCreatedFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDataLineCreatedFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLineCreatedFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLines(value: js.Array[HistogramRangeSliderDataLines]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLines")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedBarColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedBarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedBarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedBarColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedBarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedBarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLabelFormatFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeType(
      value: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardDeviation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardDeviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviation")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardDeviationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardDeviationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: HistogramRangeSliderViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

