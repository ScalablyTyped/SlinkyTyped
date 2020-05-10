package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchExpression extends js.Object {
  /**
    * A list of filter objects.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * A list of nested filter objects.
    */
  var NestedFilters: js.UndefOr[NestedFiltersList] = js.native
  /**
    * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists to be satisfied for the entire search expression to be true, specify And. If only a single conditional statement needs to be true for the entire search expression to be true, specify Or. The default value is And.
    */
  var Operator: js.UndefOr[BooleanOperator] = js.native
  /**
    * A list of search expression objects.
    */
  var SubExpressions: js.UndefOr[SearchExpressionList] = js.native
}

object SearchExpression {
  @scala.inline
  def apply(): SearchExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchExpression]
  }
  @scala.inline
  implicit class SearchExpressionOps[Self <: SearchExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedFilters(value: NestedFiltersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NestedFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NestedFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: BooleanOperator): Self = {
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
    def withSubExpressions(value: SearchExpressionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubExpressions")(js.undefined)
        ret
    }
  }
  
}

