package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Between
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BottomN
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Equals
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Items
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LessThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Percent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Sum
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TopN
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Configurable template for a value filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait PivotValueFilter extends js.Object {
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    For example, if comparator is "50" and condition is "GreaterThan", all item values that are not greater than 50 will be removed by the filter.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var comparator: js.UndefOr[Double] = js.native
  /**
    *
    * Indicates the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN = js.native
  /**
    *
    * If true, filter *excludes* items that meet criteria. The default is false (filter to include items that meet criteria).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    *
    * The lower-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lowerBound: js.UndefOr[Double] = js.native
  /**
    *
    * Indicates whether the filter is for the top/bottom N items, top/bottom N percent, or top/bottom N sum.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var selectionType: js.UndefOr[TopBottomSelectionType | Items | Percent | Sum] = js.native
  /**
    *
    * The "N" threshold number of items, percent, or sum to be filtered for a Top/Bottom filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var threshold: js.UndefOr[Double] = js.native
  /**
    *
    * The upper-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var upperBound: js.UndefOr[Double] = js.native
  /**
    *
    * Name of the chosen "value" in the field by which to filter.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: String = js.native
}

object PivotValueFilter {
  @scala.inline
  def apply(
    condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN,
    value: String
  ): PivotValueFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotValueFilter]
  }
  @scala.inline
  implicit class PivotValueFilterOps[Self <: PivotValueFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(
      value: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: TopBottomSelectionType | Items | Percent | Sum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(js.undefined)
        ret
    }
  }
  
}

