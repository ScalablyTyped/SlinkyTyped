package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bottom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.origin
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The positioning of the symbol relative to the geometry. The default behavior (`origin`) depends on the resource:
    *   * For `sphere`, `cube` and `diamond` primitives, the origin is at the center.
    *   * For `cylinder`, `cone`, `inverted-cone` and `tetrahedron` primitives, the origin is at the bottom.
    *   * For `href` resources, the origin coincides with the origin of the 3D model.
    *
    *
    * If `anchor` is set to `relative`, the anchor is defined by [`anchorPosition`](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition) as a fraction of the symbol's bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
    *
    * @default origin
    */
  var anchor: js.UndefOr[center | top | bottom | origin | relative] = js.native
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource). It is specified as a ratio of the resource's bounding box dimensions. For example, a value of `{ x: 0, y: 0, z: 0 }` designates the center, while a value of `{ x: -0.5, y: -0.5, z: -0.5 }` places the symbol at the lower south-west corner of the symbol's bounding box.  This property only applies when [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) is set to `relative`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[ObjectSymbol3DLayerAnchorPosition] = js.native
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[Boolean] = js.native
  /**
    * The depth, or diameter from north to south, of the object in meters. If `undefined`, the depth will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
    *
    * @default 10
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis). The rotation is specified in degrees and is relative to the y-axis.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the heading of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * The height of the object in meters. If `undefined`, the height will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
    *
    * @default 10
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The material used to shade the object. This property defines the object's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ObjectSymbol3DLayerMaterialProperties] = js.native
  /**
    * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points. If both properties are present, `primitive` takes precedence and `href` is ignored. When using the `href` property, external 3D models must be present in [glTF format](https://www.khronos.org/gltf/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    *
    * @default { primitive: "sphere" }
    */
  var resource: js.UndefOr[ObjectSymbol3DLayerResource] = js.native
  /**
    * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis). The rotation is specified in degrees and is relative to the x-axis. At 0 degrees, the model is level. A positive value lifts the left part and lowers the right part of the model.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the roll of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
    */
  var roll: js.UndefOr[Double] = js.native
  /**
    * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis). The rotation is specified in degrees and is relative to the y-axis. At 0 degrees, the model is level. A positive value points lifts the front and lowers the back of the model.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the tilt of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.native
  /**
    * The width, or diameter from east to west, of the object in meters. If `undefined`, the width will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
    *
    * @default 10
    */
  var width: js.UndefOr[Double] = js.native
}

object ObjectSymbol3DLayerProperties {
  @scala.inline
  def apply(): ObjectSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class ObjectSymbol3DLayerPropertiesOps[Self <: ObjectSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: center | top | bottom | origin | relative): Self = {
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
    def withAnchorPosition(value: ObjectSymbol3DLayerAnchorPosition): Self = {
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
    def withCastShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCastShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castShadows")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: ObjectSymbol3DLayerMaterialProperties): Self = {
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
    def withResource(value: ObjectSymbol3DLayerResource): Self = {
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
    def withRoll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(js.undefined)
        ret
    }
    @scala.inline
    def withTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

