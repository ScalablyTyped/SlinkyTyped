package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bottom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.left
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.right
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The positioning of the icon relative to the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    *
    * @default center
    */
  var anchor: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative
  ] = js.native
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon. It is specified as a ratio of the icon's dimensions. For example, a value of `{ x: 0, y: 0 }` designates the center of the icon, while a value of `{ x: -0.5, y: -0.5 }` causes the top-left corner of the icon to coincide with the feature geometry.  This property only applies when [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) is set to `relative`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[IconSymbol3DLayerAnchorPosition] = js.native
  /**
    * The material used to shade the icon. This property defines the icon's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[IconSymbol3DLayerMaterialProperties] = js.native
  /**
    * The outline of the icon. The color property of this object directly modifies the overall color of IconSymbol3DLayer defined with the `cross` or `x` primitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[IconSymbol3DLayerOutlineProperties] = js.native
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features. If both properties are present, `href` takes precedence and `primitive` is ignored.
    * > **Known Limitations**  Using this property to render an SVG path is not supported in IE11.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    *
    * @default { primitive: "circle" }
    */
  var resource: js.UndefOr[IconSymbol3DLayerResource] = js.native
  /**
    * The size of the icon in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    *
    * @default 12
    */
  var size: js.UndefOr[Double | String] = js.native
}

object IconSymbol3DLayerProperties {
  @scala.inline
  def apply(): IconSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class IconSymbol3DLayerPropertiesOps[Self <: IconSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(
      value: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorPosition(value: IconSymbol3DLayerAnchorPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: IconSymbol3DLayerMaterialProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: IconSymbol3DLayerOutlineProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: IconSymbol3DLayerResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

