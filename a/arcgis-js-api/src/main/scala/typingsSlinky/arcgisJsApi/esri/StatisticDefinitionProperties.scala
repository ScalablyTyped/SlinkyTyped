package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percentile-continuous`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percentile-discrete`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`var`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.avg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.count
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.stddev
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatisticDefinitionProperties extends StObject {
  
  /**
    * Defines the field for which statistics will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: js.UndefOr[String] = js.native
  
  /**
    * Specifies the output field name for the requested statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: js.UndefOr[String] = js.native
  
  /**
    * The parameters for [percentile statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var statisticParameters: js.UndefOr[StatisticDefinitionStatisticParameters] = js.native
  
  /**
    * Defines the type of statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: js.UndefOr[
    count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete`
  ] = js.native
}
object StatisticDefinitionProperties {
  
  @scala.inline
  def apply(): StatisticDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticDefinitionProperties]
  }
  
  @scala.inline
  implicit class StatisticDefinitionPropertiesMutableBuilder[Self <: StatisticDefinitionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnStatisticField(value: String): Self = StObject.set(x, "onStatisticField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStatisticFieldUndefined: Self = StObject.set(x, "onStatisticField", js.undefined)
    
    @scala.inline
    def setOutStatisticFieldName(value: String): Self = StObject.set(x, "outStatisticFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutStatisticFieldNameUndefined: Self = StObject.set(x, "outStatisticFieldName", js.undefined)
    
    @scala.inline
    def setStatisticParameters(value: StatisticDefinitionStatisticParameters): Self = StObject.set(x, "statisticParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticParametersUndefined: Self = StObject.set(x, "statisticParameters", js.undefined)
    
    @scala.inline
    def setStatisticType(
      value: count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete`
    ): Self = StObject.set(x, "statisticType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticTypeUndefined: Self = StObject.set(x, "statisticType", js.undefined)
  }
}
