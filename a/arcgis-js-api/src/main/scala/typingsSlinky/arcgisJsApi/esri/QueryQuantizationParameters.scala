package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`lower-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`upper-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.edit
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.view
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryQuantizationParameters extends Object {
  
  /**
    * An extent defining the quantization grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var extent: js.UndefOr[Extent] = js.native
  
  /**
    * Geometry coordinates are optimized for viewing and displaying of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var mode: js.UndefOr[view | edit] = js.native
  
  /**
    * The integer's coordinates will be returned relative to the origin position defined by this property value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var originPosition: js.UndefOr[`upper-left` | `lower-left`] = js.native
  
  /**
    * The size of one pixel in the units of the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var tolerance: js.UndefOr[Double] = js.native
}
object QueryQuantizationParameters {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): QueryQuantizationParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[QueryQuantizationParameters]
  }
  
  @scala.inline
  implicit class QueryQuantizationParametersMutableBuilder[Self <: QueryQuantizationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setMode(value: view | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOriginPosition(value: `upper-left` | `lower-left`): Self = StObject.set(x, "originPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPositionUndefined: Self = StObject.set(x, "originPosition", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
