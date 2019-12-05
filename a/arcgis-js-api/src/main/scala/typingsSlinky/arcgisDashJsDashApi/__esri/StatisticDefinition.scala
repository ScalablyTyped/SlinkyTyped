package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`var`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.avg
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.count
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.stddev
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticDefinition
  extends Accessor
     with JSONSupport {
  /**
    * Defines the field for which statistics will be calculated. This can be service field names or SQL expressions. See the snippets below for examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: String = js.native
  /**
    * Specifies the output field name for the requested statistic. Output field names can only contain alpha-numeric characters and an underscore. If no output field name is specified, the server assigns a field name to the returned statistic field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: String = js.native
  /**
    * Defines the type of statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: count | sum | min | max | avg | stddev | `var` = js.native
}

@JSGlobal("__esri.StatisticDefinition")
@js.native
object StatisticDefinition extends TopLevel[StatisticDefinitionConstructor]

