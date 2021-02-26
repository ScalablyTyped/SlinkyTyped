package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.IHandle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-least`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`at-most`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`greater-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`less-than`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`max-change`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`min-change`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-between`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`not-equal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`segment-drag`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`thumb-drag`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.between
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.equal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramRangeSlider extends Widget_ {
  
  /**
    * The statistical average of the data in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#average)
    */
  var average: Double = js.native
  
  /**
    * Function for styling bars representing histogram bins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#barCreatedFunction)
    */
  def barCreatedFunction(index: Double, element: js.Any): Unit = js.native
  /**
    * Function for styling bars representing histogram bins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#barCreatedFunction)
    */
  @JSName("barCreatedFunction")
  var barCreatedFunction_Original: BarCreatedFunction = js.native
  
  /**
    * An array of objects representing each bin in the histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#bins)
    */
  var bins: js.Array[Bin] = js.native
  
  /**
    * Function that fires each time a data line is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLineCreatedFunction)
    */
  def dataLineCreatedFunction(lineElement: js.Any): Unit = js.native
  def dataLineCreatedFunction(lineElement: js.Any, labelElement: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def dataLineCreatedFunction(lineElement: js.Any, labelElement: js.Any): Unit = js.native
  def dataLineCreatedFunction(lineElement: js.Any, labelElement: js.Any, index: Double): Unit = js.native
  /**
    * Function that fires each time a data line is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLineCreatedFunction)
    */
  @JSName("dataLineCreatedFunction")
  var dataLineCreatedFunction_Original: DataLineCreatedFunction = js.native
  
  /**
    * When set, renders lines on the histogram that indicate important or meaningful values to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines)
    */
  var dataLines: js.Array[HistogramRangeSliderDataLines] = js.native
  
  /**
    * Sets the color of the histogram bars that are excluded based on the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#excludedBarColor)
    */
  var excludedBarColor: Color_ = js.native
  
  /**
    * Generates a SQL where clause based on a given field and the slider's [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#generateWhereClause)
    */
  def generateWhereClause(field: String): String = js.native
  
  /**
    * Sets the color of the histogram bars that are included in the specified [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#includedBarColor)
    */
  var includedBarColor: Color_ = js.native
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: js.UndefOr[scala.Nothing], index: Double): String = js.native
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_average(value: Double, `type`: average): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_average(value: Double, `type`: average, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Double, `type`: max): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Double, `type`: max, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Double, `type`: min): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Double, `type`: min, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_tick(value: Double, `type`: tick): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_tick(value: Double, `type`: tick, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_value(value: Double, `type`: value): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_value(value: Double, `type`: value, index: Double): String = js.native
  
  /**
    * The maximum value or upper bound of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#max)
    */
  var max: Double = js.native
  
  /**
    * The minimum value or lower bound of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#min)
    */
  var min: Double = js.native
  
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: HistogramRangeSliderMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: HistogramRangeSliderMinChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_segmentdrag(name: `segment-drag`, eventHandler: HistogramRangeSliderSegmentDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbchange(name: `thumb-change`, eventHandler: HistogramRangeSliderThumbChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_thumbdrag(name: `thumb-drag`, eventHandler: HistogramRangeSliderThumbDragEventHandler): IHandle = js.native
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#precision)
    */
  var precision: Double = js.native
  
  /**
    * Indicates how the histogram bins should be rendered as the user slides the thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType)
    */
  var rangeType: equal | `not-equal` | `less-than` | `greater-than` | `at-most` | `at-least` | between | `not-between` = js.native
  
  /**
    * Indicates the standard deviation of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviation)
    */
  var standardDeviation: Double = js.native
  
  /**
    * Indicates the number of standard deviation lines to render on the histogram from the [average].
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#standardDeviationCount)
    */
  var standardDeviationCount: Double = js.native
  
  /**
    * An array of either one or two numbers representing thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#values)
    */
  var values: js.Array[Double] = js.native
  
  /**
    * The view model for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#viewModel)
    */
  var viewModel: HistogramRangeSliderViewModel = js.native
}
