package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshapeEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the reshape operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * reshape-start | The type changes to `reshape-start` at the start of `reshape` operation.
    * reshape | The type changes to `reshape` while graphics are being reshaped.
    * reshape-stop | The type changes to `reshape-stop` once graphics are reshaped.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ReshapeEventInfo)
    */
  var `type`: `reshape-start` | reshape | `reshape-stop` = js.native
}

object ReshapeEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeEventInfo]
  }
  @scala.inline
  implicit class ReshapeEventInfoOps[Self <: ReshapeEventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `reshape-start` | reshape | `reshape-stop`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

