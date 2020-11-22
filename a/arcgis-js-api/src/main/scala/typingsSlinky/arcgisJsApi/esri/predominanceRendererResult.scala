package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait predominanceRendererResult extends Object {
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var basemapId: String = js.native
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var basemapTheme: String = js.native
  
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var excludedCategoryInfos: js.Array[_] = js.native
  
  /**
    * An opacity visual variable representing the percentage of the total count comprised by the predominant value of all fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var opacity: js.UndefOr[opacityVisualVariableResult] = js.native
  
  /**
    * The predominance scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var predominanceScheme: PredominanceScheme = js.native
  
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var predominantCategoryInfos: js.Array[typeUniqueValueInfo] = js.native
  
  /**
    * The unique value renderer object representing the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var renderer: UniqueValueRenderer = js.native
  
  /**
    * A size visual variable representing the total count of all fields included in the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var size: js.UndefOr[sizeVisualVariableResult] = js.native
}
object predominanceRendererResult {
  
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    excludedCategoryInfos: js.Array[_],
    hasOwnProperty: PropertyKey => Boolean,
    predominanceScheme: PredominanceScheme,
    predominantCategoryInfos: js.Array[typeUniqueValueInfo],
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: UniqueValueRenderer
  ): predominanceRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], excludedCategoryInfos = excludedCategoryInfos.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), predominanceScheme = predominanceScheme.asInstanceOf[js.Any], predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominanceRendererResult]
  }
  
  @scala.inline
  implicit class predominanceRendererResultOps[Self <: predominanceRendererResult] (val x: Self) extends AnyVal {
    
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
    def setBasemapId(value: String): Self = this.set("basemapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: String): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedCategoryInfosVarargs(value: js.Any*): Self = this.set("excludedCategoryInfos", js.Array(value :_*))
    
    @scala.inline
    def setExcludedCategoryInfos(value: js.Array[_]): Self = this.set("excludedCategoryInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredominanceScheme(value: PredominanceScheme): Self = this.set("predominanceScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredominantCategoryInfosVarargs(value: typeUniqueValueInfo*): Self = this.set("predominantCategoryInfos", js.Array(value :_*))
    
    @scala.inline
    def setPredominantCategoryInfos(value: js.Array[typeUniqueValueInfo]): Self = this.set("predominantCategoryInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: UniqueValueRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: opacityVisualVariableResult): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSize(value: sizeVisualVariableResult): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
