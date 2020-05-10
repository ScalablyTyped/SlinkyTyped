package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.clamp
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mirror
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.repeat
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparableWrapModes extends Object {
  /**
    * Horizontal wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var horizontal: clamp | repeat | mirror = js.native
  /**
    * Vertical wrapping mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#SeparableWrapModes)
    */
  var vertical: clamp | repeat | mirror = js.native
}

object SeparableWrapModes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    horizontal: clamp | repeat | mirror,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertical: clamp | repeat | mirror
  ): SeparableWrapModes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontal = horizontal.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableWrapModes]
  }
  @scala.inline
  implicit class SeparableWrapModesOps[Self <: SeparableWrapModes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: clamp | repeat | mirror): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: clamp | repeat | mirror): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

