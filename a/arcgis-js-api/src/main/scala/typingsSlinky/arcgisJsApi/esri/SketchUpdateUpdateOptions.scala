package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.move
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.reshape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.transform
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchUpdateUpdateOptions extends Object {
  
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var enableRotation: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var enableScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if z-values can be modified when updating the graphic. When enabled, the height handle manipulator is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var enableZ: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether more than one selection can be made at once.  This applies to the shift+click interaction with the `transform` tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform` and is always `true` when transforming points that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default false
    */
  var preserveAspectRatio: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var toggleToolOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the update tool. Specifies the update operation for the selected graphics. The provided tool will become the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool).  **Possible Values**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | This is the *default* tool for graphics with a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry, [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry or graphics that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html) with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting the `enableRotation`, `enableScaling` or `preserveAspectRatio` arguments when calling the `update` method or setting them on the [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions) property when the Sketch widget initializes.
    * reshape | This tool allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with a single graphic that has a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    * move | This is the *default* tool for graphics with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry that do not use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html). It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since the `move` operation is built into both the `transform` and `reshape` tools by default.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var tool: js.UndefOr[transform | reshape | move] = js.native
}
object SketchUpdateUpdateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchUpdateUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchUpdateUpdateOptions]
  }
  
  @scala.inline
  implicit class SketchUpdateUpdateOptionsOps[Self <: SketchUpdateUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableRotation(value: Boolean): Self = this.set("enableRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRotation: Self = this.set("enableRotation", js.undefined)
    
    @scala.inline
    def setEnableScaling(value: Boolean): Self = this.set("enableScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScaling: Self = this.set("enableScaling", js.undefined)
    
    @scala.inline
    def setEnableZ(value: Boolean): Self = this.set("enableZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableZ: Self = this.set("enableZ", js.undefined)
    
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = this.set("multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleSelectionEnabled: Self = this.set("multipleSelectionEnabled", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: Boolean): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setToggleToolOnClick(value: Boolean): Self = this.set("toggleToolOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleToolOnClick: Self = this.set("toggleToolOnClick", js.undefined)
    
    @scala.inline
    def setTool(value: transform | reshape | move): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
  }
}
