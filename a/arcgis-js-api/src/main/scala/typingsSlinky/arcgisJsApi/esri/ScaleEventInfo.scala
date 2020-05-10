package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.scale
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the scale operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * scale-start | The type changes to `scale-start` at the start of scale or resize operation.
    * scale | The type changes to `scale` while graphics are being scaled or resized.
    * scale-stop | The type changes to `scale-stop` once graphics are scaled or resized.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var `type`: `scale-start` | scale | `scale-stop` = js.native
  /**
    * The x scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var xScale: Double = js.native
  /**
    * The y scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var yScale: Double = js.native
}

object ScaleEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `scale-start` | scale | `scale-stop`,
    xScale: Double,
    yScale: Double
  ): ScaleEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEventInfo]
  }
  @scala.inline
  implicit class ScaleEventInfoOps[Self <: ScaleEventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `scale-start` | scale | `scale-stop`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

