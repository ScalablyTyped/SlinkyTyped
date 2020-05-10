package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabelsFilterOptionsObject extends js.Object {
  /**
    * The operator to compare by. Can be one of `>`, `<`, `>=`, `<=`, `==`, and
    * `===`.
    */
  var operator: DataLabelsFilterOperatorValue = js.native
  /**
    * The point property to filter by. Point options are passed directly to
    * properties, additionally there are `y` value, `percentage` and others
    * listed under Highcharts.Point members.
    */
  var property: String = js.native
  /**
    * The value to compare against.
    */
  var value: Double | Null = js.native
}

object DataLabelsFilterOptionsObject {
  @scala.inline
  def apply(operator: DataLabelsFilterOperatorValue, property: String): DataLabelsFilterOptionsObject = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelsFilterOptionsObject]
  }
  @scala.inline
  implicit class DataLabelsFilterOptionsObjectOps[Self <: DataLabelsFilterOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperator(value: DataLabelsFilterOperatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

