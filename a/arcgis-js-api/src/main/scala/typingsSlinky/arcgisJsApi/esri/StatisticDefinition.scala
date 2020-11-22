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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatisticDefinition
  extends Accessor
     with JSONSupport {
  
  /**
    * Defines the field for which statistics will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: String = js.native
  
  /**
    * Specifies the output field name for the requested statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: String = js.native
  
  /**
    * The parameters for [percentile statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var statisticParameters: StatisticDefinitionStatisticParameters = js.native
  
  /**
    * Defines the type of statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete` = js.native
}
