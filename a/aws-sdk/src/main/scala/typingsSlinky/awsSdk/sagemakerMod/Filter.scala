package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * A property name. For example, TrainingJobName. For the list of valid property names returned in a search result for each supported resource, see TrainingJob properties. You must specify a valid property name for the resource.
    */
  var Name: ResourcePropertyName = js.native
  /**
    * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following values:  Equals  The specified resource in Name equals the specified Value.  NotEquals  The specified resource in Name does not equal the specified Value.  GreaterThan  The specified resource in Name is greater than the specified Value. Not supported for text-based properties.  GreaterThanOrEqualTo  The specified resource in Name is greater than or equal to the specified Value. Not supported for text-based properties.  LessThan  The specified resource in Name is less than the specified Value. Not supported for text-based properties.  LessThanOrEqualTo  The specified resource in Name is less than or equal to the specified Value. Not supported for text-based properties.  Contains  Only supported for text-based properties. The word-list of the property contains the specified Value. A SearchExpression can include only one Contains operator.   If you have specified a filter Value, the default is Equals.
    */
  var Operator: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Operator] = js.native
  /**
    * A value used with Resource and Operator to determine if objects satisfy the filter's condition. For numerical properties, Value must be an integer or floating-point decimal. For timestamp properties, Value must be an ISO 8601 date-time string of the following format: YYYY-mm-dd'T'HH:MM:SS.
    */
  var Value: js.UndefOr[FilterValue] = js.native
}

object Filter {
  @scala.inline
  def apply(Name: ResourcePropertyName): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ResourcePropertyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: Operator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: FilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

