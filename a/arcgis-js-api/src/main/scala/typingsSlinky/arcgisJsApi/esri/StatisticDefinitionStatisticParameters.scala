package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ASC
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.DESC
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticDefinitionStatisticParameters extends Object {
  /**
    * Specify `ASC` (ascending) or `DESC` (descending) to control the order of the data. For example, in a data set of 10 values from 1 to 10, the percentile value for 0.9 with `orderBy` set to ascending (`ASC`) is 9, but when `ordenBy` is set to descending (`DESC`) the result is 2. The default is `ASC`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var orderBy: js.UndefOr[ASC | DESC] = js.native
  /**
    * Percentile value. This should be a decimal value between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var value: Double = js.native
}

object StatisticDefinitionStatisticParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double
  ): StatisticDefinitionStatisticParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticDefinitionStatisticParameters]
  }
  @scala.inline
  implicit class StatisticDefinitionStatisticParametersOps[Self <: StatisticDefinitionStatisticParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderBy(value: ASC | DESC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
  }
  
}

