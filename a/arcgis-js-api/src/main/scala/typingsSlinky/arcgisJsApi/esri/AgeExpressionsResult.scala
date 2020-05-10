package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgeExpressionsResult extends Object {
  /**
    * A SQL expression and where clause that matches the generated `valueExpression` used to query for a histogram from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#AgeExpressionsResult)
    */
  var histogramQuery: js.Any = js.native
  /**
    * A SQL expression and where clause that matches the generated `valueExpression` used to query statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#AgeExpressionsResult)
    */
  var statisticsQuery: js.Any = js.native
  /**
    * The [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression used to calculate the age of a feature based on the difference between the end time and the start time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#AgeExpressionsResult)
    */
  var valueExpression: String = js.native
}

object AgeExpressionsResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    histogramQuery: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    statisticsQuery: js.Any,
    valueExpression: String
  ): AgeExpressionsResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), histogramQuery = histogramQuery.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statisticsQuery = statisticsQuery.asInstanceOf[js.Any], valueExpression = valueExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgeExpressionsResult]
  }
  @scala.inline
  implicit class AgeExpressionsResultOps[Self <: AgeExpressionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistogramQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogramQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatisticsQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticsQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

