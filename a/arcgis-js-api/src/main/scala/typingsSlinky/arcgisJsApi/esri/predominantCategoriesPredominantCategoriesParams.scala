package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait predominantCategoriesPredominantCategoriesParams extends Object {
  
  /**
    * An array of numeric fields from which to determine predominant categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var fields: js.Array[String] = js.native
  
  /**
    * The layer from which to generate predominant categories for the given set of `fields`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-predominantCategories.html#predominantCategories)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * The view in which features will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.native
}
object predominantCategoriesPredominantCategoriesParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[String],
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): predominantCategoriesPredominantCategoriesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[predominantCategoriesPredominantCategoriesParams]
  }
  
  @scala.inline
  implicit class predominantCategoriesPredominantCategoriesParamsMutableBuilder[Self <: predominantCategoriesPredominantCategoriesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setView(value: MapView | SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
