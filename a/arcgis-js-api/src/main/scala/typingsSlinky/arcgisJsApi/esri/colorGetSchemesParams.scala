package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dark
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.extremes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.light
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipatch
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorGetSchemesParams extends Object {
  
  /**
    * The Esri basemap to pair with the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemes)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  
  /**
    * If you have a non-Esri basemap (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemes)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.native
  
  /**
    * The geometry type of the features to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemes)
    */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch = js.native
  
  /**
    * The theme determines which values will be emphasized in the continuous ramp and the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemes)
    */
  var theme: `high-to-low` | `above-and-below` | `centered-on` | extremes = js.native
  
  /**
    * The SceneView instance in which the scheme will be used.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.native
  
  /**
    * Indicates if the size units of the scheme will be in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.native
}
object colorGetSchemesParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | mesh | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    theme: `high-to-low` | `above-and-below` | `centered-on` | extremes
  ): colorGetSchemesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorGetSchemesParams]
  }
  
  @scala.inline
  implicit class colorGetSchemesParamsMutableBuilder[Self <: colorGetSchemesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: `high-to-low` | `above-and-below` | `centered-on` | extremes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWorldScale(value: Boolean): Self = StObject.set(x, "worldScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldScaleUndefined: Self = StObject.set(x, "worldScale", js.undefined)
  }
}
