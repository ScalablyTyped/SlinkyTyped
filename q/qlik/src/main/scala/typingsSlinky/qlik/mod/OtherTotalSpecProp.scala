package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.OTHER_ABS_ACC_TARGET
import typingsSlinky.qlik.qlikStrings.OTHER_ABS_LIMITED
import typingsSlinky.qlik.qlikStrings.OTHER_COUNTED
import typingsSlinky.qlik.qlikStrings.OTHER_GE_LIMIT
import typingsSlinky.qlik.qlikStrings.OTHER_GT_LIMIT
import typingsSlinky.qlik.qlikStrings.OTHER_LE_LIMIT
import typingsSlinky.qlik.qlikStrings.OTHER_LT_LIMIT
import typingsSlinky.qlik.qlikStrings.OTHER_OFF
import typingsSlinky.qlik.qlikStrings.OTHER_REL_ACC_TARGET
import typingsSlinky.qlik.qlikStrings.OTHER_REL_LIMITED
import typingsSlinky.qlik.qlikStrings.OTHER_SORT_ASCENDING
import typingsSlinky.qlik.qlikStrings.OTHER_SORT_DEFAULT
import typingsSlinky.qlik.qlikStrings.OTHER_SORT_DESCENDING
import typingsSlinky.qlik.qlikStrings.TOTAL_EXPR
import typingsSlinky.qlik.qlikStrings.TOTAL_OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherTotalSpecProp extends js.Object {
  var qApplyEvenWhenPossiblyWrongResult: Boolean = js.native
  var qForceBadValueKeeping: Boolean = js.native
  var qGlobalOtherGrouping: Boolean = js.native
  var qOtherCollapseInnerDimensions: Boolean = js.native
  var qOtherCounted: ValueExpr = js.native
  var qOtherLimit: ValueExpr = js.native
  var qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT = js.native
  var qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET = js.native
  var qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING = js.native
  var qReferencedExpression: String = js.native
  var qSupressOther: Boolean = js.native
  var qTotalMode: TOTAL_OFF | TOTAL_EXPR = js.native
}

object OtherTotalSpecProp {
  @scala.inline
  def apply(
    qApplyEvenWhenPossiblyWrongResult: Boolean,
    qForceBadValueKeeping: Boolean,
    qGlobalOtherGrouping: Boolean,
    qOtherCollapseInnerDimensions: Boolean,
    qOtherCounted: ValueExpr,
    qOtherLimit: ValueExpr,
    qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT,
    qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET,
    qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING,
    qReferencedExpression: String,
    qSupressOther: Boolean,
    qTotalMode: TOTAL_OFF | TOTAL_EXPR
  ): OtherTotalSpecProp = {
    val __obj = js.Dynamic.literal(qApplyEvenWhenPossiblyWrongResult = qApplyEvenWhenPossiblyWrongResult.asInstanceOf[js.Any], qForceBadValueKeeping = qForceBadValueKeeping.asInstanceOf[js.Any], qGlobalOtherGrouping = qGlobalOtherGrouping.asInstanceOf[js.Any], qOtherCollapseInnerDimensions = qOtherCollapseInnerDimensions.asInstanceOf[js.Any], qOtherCounted = qOtherCounted.asInstanceOf[js.Any], qOtherLimit = qOtherLimit.asInstanceOf[js.Any], qOtherLimitMode = qOtherLimitMode.asInstanceOf[js.Any], qOtherMode = qOtherMode.asInstanceOf[js.Any], qOtherSortMode = qOtherSortMode.asInstanceOf[js.Any], qReferencedExpression = qReferencedExpression.asInstanceOf[js.Any], qSupressOther = qSupressOther.asInstanceOf[js.Any], qTotalMode = qTotalMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherTotalSpecProp]
  }
  @scala.inline
  implicit class OtherTotalSpecPropOps[Self <: OtherTotalSpecProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQApplyEvenWhenPossiblyWrongResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qApplyEvenWhenPossiblyWrongResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQForceBadValueKeeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qForceBadValueKeeping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGlobalOtherGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGlobalOtherGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherCollapseInnerDimensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherCollapseInnerDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherCounted(value: ValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherCounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherLimit(value: ValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherLimitMode(value: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherLimitMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherMode(
      value: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOtherSortMode(value: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOtherSortMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReferencedExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReferencedExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSupressOther(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSupressOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotalMode(value: TOTAL_OFF | TOTAL_EXPR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

