package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Number of pixels moved on the x-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dx: Double = js.native
  /**
    * Number of pixels moved on the y-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dy: Double = js.native
  /**
    * The instance of the graphic that is being moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var mover: Graphic = js.native
  /**
    * Returns information indicating the stage of the move operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * move-start | The type changes to `move-start` at the start of `move` operation.
    * move | The type changes to `move` while graphics are being moved.
    * move-stop | The type changes to `move-stop` once graphics are moved.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var `type`: `move-start` | move | `move-stop` = js.native
}

object MoveEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    dx: Double,
    dy: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mover: Graphic,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `move-start` | move | `move-stop`
  ): MoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mover = mover.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveEventInfo]
  }
  @scala.inline
  implicit class MoveEventInfoOps[Self <: MoveEventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMover(value: Graphic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `move-start` | move | `move-stop`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

