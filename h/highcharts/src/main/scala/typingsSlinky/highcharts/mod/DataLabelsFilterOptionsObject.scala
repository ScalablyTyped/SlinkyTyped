package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelsFilterOptionsObject extends js.Object {
  /**
    * The operator to compare by. Can be one of `>`, `<`, `>=`, `<=`, `==`, and
    * `===`.
    */
  var operator: DataLabelsFilterOperatorValue
  /**
    * The point property to filter by. Point options are passed directly to
    * properties, additionally there are `y` value, `percentage` and others
    * listed under Highcharts.Point members.
    */
  var property: String
  /**
    * The value to compare against.
    */
  var value: Double | Null
}

object DataLabelsFilterOptionsObject {
  @scala.inline
  def apply(
    operator: DataLabelsFilterOperatorValue,
    property: String,
    value: Double = null.asInstanceOf[Double]
  ): DataLabelsFilterOptionsObject = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelsFilterOptionsObject]
  }
}

