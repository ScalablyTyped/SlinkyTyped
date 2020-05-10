package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.count
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.percent
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.position
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickConfig extends Object {
  /**
    * Callback for formatting tick labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  /**
    * Indicates whether to render labels for the ticks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * The mode or method of positioning ticks along the slider track. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * count | Places a fixed number of ticks (provided in the `values` property) at equal distances from each other below the slider track.
    * percent | When set, and a single number is set on the `values` property, ticks will be placed at the specified percentage interval along the length of the slider. For example, when `mode` is percent and `values` is `5`, then 20 ticks will be placed below the slider track (at 5-percent intervals from each other). If an array of `values` is provided, the values are interpreted as percentages along the slider. So if `values` is `[10, 50, 90]`, then three ticks will be placed below the track; one at the midway point, and two 10 percent of the length from either end of the slider.
    * position | Indicates that ticks will only be placed at the values specified in the `values` property.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var mode: count | percent | position = js.native
  /**
    * Callback that fires for each tick. You can override default behaviors and styles with this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var tickCreatedFunction: js.UndefOr[TickCreatedFunction] = js.native
  /**
    * Indicates where ticks will be rendered below the track. See the description for `mode` for more information about how this property is interpreted by each mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var values: Double | js.Array[Double] = js.native
}

object TickConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: count | percent | position,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: Double | js.Array[Double]
  ): TickConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickConfig]
  }
  @scala.inline
  implicit class TickConfigOps[Self <: TickConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: count | percent | position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
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
    def withLabelsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withTickCreatedFunction(
      value: (/* value */ Double, /* tickElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickCreatedFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTickCreatedFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickCreatedFunction")(js.undefined)
        ret
    }
  }
  
}

