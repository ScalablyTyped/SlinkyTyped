package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualVariablesResult extends Object {
  
  /**
    * Authoring information related to the creation of the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var authoringInfo: AuthoringInfo = js.native
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapId: String = js.native
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var basemapTheme: String = js.native
  
  /**
    * Object containing visual variable and scheme information for the color portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var color: VisualVariablesResultColor = js.native
  
  /**
    * Indicates whether default values were used in the absence of sufficient data and/or statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var defaultValuesUsed: Boolean = js.native
  
  /**
    * Object containing visual variable and scheme information for the size portion of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var size: VisualVariablesResultSize = js.native
  
  /**
    * Basic statistics returned from a query to the service for the given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var statistics: SummaryStatisticsResult = js.native
}
object VisualVariablesResult {
  
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfo,
    basemapId: String,
    basemapTheme: String,
    color: VisualVariablesResultColor,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: VisualVariablesResultSize,
    statistics: SummaryStatisticsResult
  ): VisualVariablesResult = {
    val __obj = js.Dynamic.literal(authoringInfo = authoringInfo.asInstanceOf[js.Any], basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualVariablesResult]
  }
  
  @scala.inline
  implicit class VisualVariablesResultMutableBuilder[Self <: VisualVariablesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthoringInfo(value: AuthoringInfo): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: VisualVariablesResultColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: VisualVariablesResultSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistics(value: SummaryStatisticsResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
