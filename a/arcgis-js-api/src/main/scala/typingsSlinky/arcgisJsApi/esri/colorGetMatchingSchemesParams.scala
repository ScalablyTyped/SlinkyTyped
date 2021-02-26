package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.extremes
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorGetMatchingSchemesParams extends Object {
  
  /**
    * An array of colors used to match with schemes for the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var colors: js.Array[Color_] = js.native
  
  /**
    * The geometry type of the layer for which the color scheme will be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var geometryType: String = js.native
  
  /**
    * The name of the theme from which to get color schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var theme: `high-to-low` | `above-and-below` | `centered-on` | extremes = js.native
  
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance used to calculate the suggested sizes of the symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.native
  
  /**
    * Indicates whether 3D volumetric symbols will be used in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.native
}
object colorGetMatchingSchemesParams {
  
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    theme: `high-to-low` | `above-and-below` | `centered-on` | extremes
  ): colorGetMatchingSchemesParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorGetMatchingSchemesParams]
  }
  
  @scala.inline
  implicit class colorGetMatchingSchemesParamsMutableBuilder[Self <: colorGetMatchingSchemesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setGeometryType(value: String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
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
