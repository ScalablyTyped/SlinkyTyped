package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.days
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hours
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.months
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.years
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ageUtilsGetAgeExpressionsParams extends Object {
  
  /**
    * The end time for the age calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var endTime: js.Date | String | Double = js.native
  
  /**
    * The layer from which to generate age statistics for the given `startTime` and `endTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  
  /**
    * The start time for the age calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var startTime: js.Date | String | Double = js.native
  
  /**
    * The desired units of the age result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var unit: js.UndefOr[years | months | days | hours | minutes | seconds] = js.native
}
object ageUtilsGetAgeExpressionsParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    endTime: js.Date | String | Double,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    startTime: js.Date | String | Double
  ): ageUtilsGetAgeExpressionsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ageUtilsGetAgeExpressionsParams]
  }
  
  @scala.inline
  implicit class ageUtilsGetAgeExpressionsParamsOps[Self <: ageUtilsGetAgeExpressionsParams] (val x: Self) extends AnyVal {
    
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
    def setEndTimeDate(value: js.Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date | String | Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeDate(value: js.Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date | String | Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: years | months | days | hours | minutes | seconds): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
