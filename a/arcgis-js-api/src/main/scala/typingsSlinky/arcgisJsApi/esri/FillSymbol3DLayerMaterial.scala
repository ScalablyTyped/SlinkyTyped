package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.replace
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tint
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillSymbol3DLayerMaterial extends AnonymousAccessor {
  /**
    * The color of the fill. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color_] = js.native
  /**
    * Specifies how the material `color` is applied to the geometry color/texture information. This property applies only to [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbols.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the material `color` to the desaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the material `color`.
    * multiply | Multiplies geometry/texture color value with the material `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default multiply
    */
  var colorMixMode: js.UndefOr[tint | replace | multiply] = js.native
}

object FillSymbol3DLayerMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FillSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FillSymbol3DLayerMaterial]
  }
  @scala.inline
  implicit class FillSymbol3DLayerMaterialOps[Self <: FillSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMixMode(value: tint | replace | multiply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMixMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMixMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMixMode")(js.undefined)
        ret
    }
  }
  
}

