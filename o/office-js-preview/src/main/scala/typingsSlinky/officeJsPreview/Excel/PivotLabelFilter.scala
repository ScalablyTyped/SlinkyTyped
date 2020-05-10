package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BeginsWith
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Between
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Contains
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EndsWith
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Equals
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LessThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Configurable template for a label filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait PivotLabelFilter extends js.Object {
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var comparator: js.UndefOr[String] = js.native
  /**
    *
    * Indicates the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between = js.native
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
    * The lower-bound of the range for the Between filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lowerBound: js.UndefOr[String] = js.native
  /**
    *
    * The substring used for `BeginsWith`, `EndsWith`, and `Contains` filter conditions.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var substring: js.UndefOr[String] = js.native
  /**
    *
    * The upper-bound of the range for the Between filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var upperBound: js.UndefOr[String] = js.native
}

object PivotLabelFilter {
  @scala.inline
  def apply(
    condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
  ): PivotLabelFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLabelFilter]
  }
  @scala.inline
  implicit class PivotLabelFilterOps[Self <: PivotLabelFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(
      value: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparator(value: String): Self = {
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
    def withLowerBound(value: String): Self = {
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
    def withSubstring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substring")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperBound(value: String): Self = {
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

