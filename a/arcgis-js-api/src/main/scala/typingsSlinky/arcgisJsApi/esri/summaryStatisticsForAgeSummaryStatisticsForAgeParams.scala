package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.days
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hours
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.months
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.years
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait summaryStatisticsForAgeSummaryStatisticsForAgeParams extends Object {
  
  /**
    * The end time for the age calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var endTime: js.Date | String | Double = js.native
  
  /**
    * The layer from which to generate age statistics for the given `startTime` and `endTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * The start time for the age calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var startTime: js.Date | String | Double = js.native
  
  /**
    * The desired units of the age result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  var unit: years | months | days | hours | minutes | seconds = js.native
  
  /**
    * The view in which features will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.native
}
object summaryStatisticsForAgeSummaryStatisticsForAgeParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    endTime: js.Date | String | Double,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    startTime: js.Date | String | Double,
    unit: years | months | days | hours | minutes | seconds
  ): summaryStatisticsForAgeSummaryStatisticsForAgeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), startTime = startTime.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[summaryStatisticsForAgeSummaryStatisticsForAgeParams]
  }
  
  @scala.inline
  implicit class summaryStatisticsForAgeSummaryStatisticsForAgeParamsMutableBuilder[Self <: summaryStatisticsForAgeSummaryStatisticsForAgeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date | String | Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeDate(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date | String | Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeDate(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: years | months | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: MapView | SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
