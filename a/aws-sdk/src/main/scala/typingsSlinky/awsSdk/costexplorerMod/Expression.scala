package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  /**
    * Return results that match both Dimension objects.
    */
  var And: js.UndefOr[Expressions] = js.native
  /**
    *   Cost Category is in public beta for AWS Billing and Cost Management and is subject to change. Your use of Cost Categories is subject to the Beta Service Participation terms of the AWS Service Terms (Section 1.10).   The specific CostCategory used for Expression.
    */
  var CostCategories: js.UndefOr[CostCategoryValues] = js.native
  /**
    * The specific Dimension to use for Expression.
    */
  var Dimensions: js.UndefOr[DimensionValues] = js.native
  /**
    * Return results that don't match a Dimension object.
    */
  var Not: js.UndefOr[Expression] = js.native
  /**
    * Return results that match either Dimension object.
    */
  var Or: js.UndefOr[Expressions] = js.native
  /**
    * The specific Tag to use for Expression.
    */
  var Tags: js.UndefOr[TagValues] = js.native
}

object Expression {
  @scala.inline
  def apply(): Expression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: Expressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("And")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("And")(js.undefined)
        ret
    }
    @scala.inline
    def withCostCategories(value: CostCategoryValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: DimensionValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withNot(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Not")(js.undefined)
        ret
    }
    @scala.inline
    def withOr(value: Expressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Or")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

