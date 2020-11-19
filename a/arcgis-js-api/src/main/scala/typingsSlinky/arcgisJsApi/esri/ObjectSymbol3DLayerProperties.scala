package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bottom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.center
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.origin
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: center | top | bottom | origin | relative): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorPosition(value: ObjectSymbol3DLayerAnchorPosition): Self = this.set("anchorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPosition: Self = this.set("anchorPosition", js.undefined)
    
    @scala.inline
    def setCastShadows(value: Boolean): Self = this.set("castShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCastShadows: Self = this.set("castShadows", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaterial(value: ObjectSymbol3DLayerMaterialProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setResource(value: ObjectSymbol3DLayerResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setRoll(value: Double): Self = this.set("roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoll: Self = this.set("roll", js.undefined)
    
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
