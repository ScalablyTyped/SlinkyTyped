package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dark
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.default
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.light
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipatch
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait predominanceGetSchemeByNameParams extends Object {
  
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.native
  
  /**
    * The geometry type of the features to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch = js.native
  
  /**
    * The name of the scheme to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var name: String = js.native
  
  /**
    * The number of unique values to include in the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var numColors: Double = js.native
  
  /**
    * Determines which set of primary and secondary color schemes to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    *
    * @default default
    */
  var theme: js.UndefOr[default] = js.native
  
  /**
    * The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.native
  
  /**
    * Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var worldScale: js.UndefOr[Boolean] = js.native
}
object predominanceGetSchemeByNameParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | mesh | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): predominanceGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], numColors = numColors.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[predominanceGetSchemeByNameParams]
  }
  
  @scala.inline
  implicit class predominanceGetSchemeByNameParamsOps[Self <: predominanceGetSchemeByNameParams] (val x: Self) extends AnyVal {
    
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
    def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumColors(value: Double): Self = this.set("numColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    
    @scala.inline
    def setBasemapTheme(value: light | dark): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasemapTheme: Self = this.set("basemapTheme", js.undefined)
    
    @scala.inline
    def setTheme(value: default): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setView(value: SceneView): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWorldScale(value: Boolean): Self = this.set("worldScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldScale: Self = this.set("worldScale", js.undefined)
  }
}
