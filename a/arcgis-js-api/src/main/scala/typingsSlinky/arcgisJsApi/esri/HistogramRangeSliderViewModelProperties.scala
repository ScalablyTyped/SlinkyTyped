package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.between
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramRangeSliderViewModelProperties extends SliderViewModelProperties {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#average)
    */
  var average: js.UndefOr[Double] = js.native
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#bins)
    */
  var bins: js.UndefOr[js.Array[Bin]] = js.native
  
  /**
    * Determines the SQL where clause generated in [generateWhereClause()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#generateWhereClause) for filtering purposes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider-HistogramRangeSliderViewModel.html#rangeType)
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
  implicit class HistogramRangeSliderViewModelPropertiesMutableBuilder[Self <: HistogramRangeSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setBins(value: js.Array[Bin]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    @scala.inline
    def setBinsVarargs(value: Bin*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setRangeType(
      value: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between`
    ): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeTypeUndefined: Self = StObject.set(x, "rangeType", js.undefined)
    
    @scala.inline
    def setStandardDeviation(value: Double): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
  }
}
