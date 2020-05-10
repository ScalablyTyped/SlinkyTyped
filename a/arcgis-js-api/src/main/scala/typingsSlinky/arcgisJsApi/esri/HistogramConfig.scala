package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramConfig extends Object {
  /**
    * Indicates the average value of the dataset. When set, a solid line on the histogram will render at the location of the average value along with a label defaulting to the value set here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var average: js.UndefOr[Double] = js.native
  /**
    * Function for styling bars representing histogram bins. This can be used to style bins or add custom interaction to them. For example, you can use this function to color bins that match the colors on the slider's track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var barCreatedFunction: js.UndefOr[BarCreatedFunction] = js.native
  /**
    * The bins of the histogram. This is an array of objects indicating the range and count of data in each bin. This value is typically retrieved from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  /**
    * Function that fires each time a data line is created. You can use this to style individual [dataLines](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#dataLines) on the data axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLineCreatedFunction: js.UndefOr[DataLineCreatedFunction] = js.native
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var dataLines: js.UndefOr[js.Array[HistogramConfigDataLines]] = js.native
  /**
    * Indicates the standard deviation of the dataset. When set, data lines are on the histogram at the locations of the standard deviations above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviation: js.UndefOr[Double] = js.native
  /**
    * Indicates the standard deviation of the dataset. When set, data lines are on the histogram at the locations of the standard deviations above and below the `average`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#HistogramConfig)
    */
  var standardDeviationCount: js.UndefOr[Double] = js.native
}

object HistogramConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HistogramConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HistogramConfig]
  }
  @scala.inline
  implicit class HistogramConfigOps[Self <: HistogramConfig] (val x: Self) extends AnyVal {
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
    def withDataLines(value: js.Array[HistogramConfigDataLines]): Self = {
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
  }
  
}

