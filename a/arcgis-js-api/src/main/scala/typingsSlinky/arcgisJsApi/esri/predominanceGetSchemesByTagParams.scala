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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait predominanceGetSchemesByTagParams extends Object {
  
  /**
    * The basemap to pair with the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  
  /**
    * If you have a non-Esri basemap (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.native
  
  /**
    * When provided, only schemes missing all the provided tags will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The geometry type of the features to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch = js.native
  
  /**
    * When provided, only schemes containing all the matching tags will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The number of unique values to include in the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var numColors: Double = js.native
  
  /**
    * Determines which set of primary and secondary color schemes to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var theme: js.UndefOr[default] = js.native
  
  /**
    * The SceneView instance in which the scheme will be used.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.native
  
  /**
    * Indicates if the size units of the scheme will be in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#getSchemesByTag)
    */
  var worldScale: js.UndefOr[Boolean] = js.native
}
object predominanceGetSchemesByTagParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | mesh | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): predominanceGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[predominanceGetSchemesByTagParams]
  }
  
  @scala.inline
  implicit class predominanceGetSchemesByTagParamsMutableBuilder[Self <: predominanceGetSchemesByTagParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setExcludedTags(value: js.Array[String]): Self = StObject.set(x, "excludedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedTagsUndefined: Self = StObject.set(x, "excludedTags", js.undefined)
    
    @scala.inline
    def setExcludedTagsVarargs(value: String*): Self = StObject.set(x, "excludedTags", js.Array(value :_*))
    
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedTags(value: js.Array[String]): Self = StObject.set(x, "includedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedTagsUndefined: Self = StObject.set(x, "includedTags", js.undefined)
    
    @scala.inline
    def setIncludedTagsVarargs(value: String*): Self = StObject.set(x, "includedTags", js.Array(value :_*))
    
    @scala.inline
    def setNumColors(value: Double): Self = StObject.set(x, "numColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: default): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
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
