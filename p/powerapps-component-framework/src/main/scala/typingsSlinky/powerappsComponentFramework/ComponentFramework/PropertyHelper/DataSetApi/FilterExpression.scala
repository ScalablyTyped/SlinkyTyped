package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.FilterOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An expression used to represent a filter.
			 */
@js.native
trait FilterExpression extends js.Object {
  /**
  				 * The set of conditions associated with this filter.
  				 */
  var conditions: js.Array[ConditionExpression] = js.native
  /**
  				 * The operator used to combine conditions in this filter.
  				 */
  var filterOperator: FilterOperator = js.native
  /**
  				 * Any child filters that should be evaluated after evaluating this filter.
  				 */
  var filters: js.UndefOr[js.Array[FilterExpression]] = js.native
}

object FilterExpression {
  @scala.inline
  def apply(conditions: js.Array[ConditionExpression], filterOperator: FilterOperator): FilterExpression = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], filterOperator = filterOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExpression]
  }
  @scala.inline
  implicit class FilterExpressionOps[Self <: FilterExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[ConditionExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterOperator(value: FilterOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[FilterExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

