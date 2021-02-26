package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sizeClassBreaksRendererResult extends Object {
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
    */
  var basemapId: String = js.native
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
    */
  var basemapTheme: String = js.native
  
  /**
    * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
    */
  var classBreaksResult: ClassBreaksResult = js.native
  
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
    */
  var defaultValuesUsed: Boolean = js.native
  
  /**
    * The renderer object configured to best match the given basemap and the spread of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
    */
  var renderer: ClassBreaksRenderer = js.native
  
  /**
    * The size scheme used by the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ClassBreaksRendererResult)
    */
  var sizeScheme: SizeScheme = js.native
}
object sizeClassBreaksRendererResult {
  
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    classBreaksResult: ClassBreaksResult,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme
  ): sizeClassBreaksRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], classBreaksResult = classBreaksResult.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any], sizeScheme = sizeScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeClassBreaksRendererResult]
  }
  
  @scala.inline
  implicit class sizeClassBreaksRendererResultMutableBuilder[Self <: sizeClassBreaksRendererResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBreaksResult(value: ClassBreaksResult): Self = StObject.set(x, "classBreaksResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: ClassBreaksRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
  }
}
