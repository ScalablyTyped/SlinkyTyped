package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.between
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramRangeSliderViewModelProperties extends SliderViewModelProperties {
  /**
    * The statistical average of the data in the histogram. You would typically get this value from the `avg` property of SummaryStatisticsResult, which is the result of the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * An array of objects representing each bin in the histogram. This information is typically returned from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * Determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause) for filtering purposes. The value set here determines the number of [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#values) allowed on the slider.  See the table below for a description and requirements of all possible values. `value1` refers to the value of the first thumb position. `value2` refers to the value of the final thumb position, if applicable.
    *
    * Possible Value | Number of [Values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#values) | [Where clause](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType)
    *
    * @default equal
    */
  var rangeType: js.UndefOr[
    equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
  ] = js.native
  /**
    * Indicates the standard deviation of the dataset above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#standardDeviation)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
}

object HistogramRangeSliderViewModelProperties {
  @scala.inline
  def apply(): HistogramRangeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramRangeSliderViewModelProperties]
  }
  @scala.inline
  implicit class HistogramRangeSliderViewModelPropertiesOps[Self <: HistogramRangeSliderViewModelProperties] (val x: Self) extends AnyVal {
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
  }
  
}

