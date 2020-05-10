package typingsSlinky.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends js.Object {
  /** An object for storing additional settings that should be sent to the server. Relevant to the ODataStore only. */
  var customQueryParams: js.UndefOr[js.Any] = js.native
  /** An array of strings that represent the names of navigation properties to be loaded simultaneously with the ODataStore. */
  var expand: js.UndefOr[js.Any] = js.native
  /** A filter expression. */
  var filter: js.UndefOr[js.Any] = js.native
  /** A group expression. */
  var group: js.UndefOr[js.Any] = js.native
  /** A group summary expression. Used with the group setting. */
  var groupSummary: js.UndefOr[js.Any] = js.native
  /** The IDs of the rows being expanded. Relevant only when the CustomStore is used in the TreeList widget. */
  var parentIds: js.UndefOr[js.Array[_]] = js.native
  /** Indicates whether a top-level group count is required. Used in conjunction with the filter, take, skip, requireTotalCount, and group settings. */
  var requireGroupCount: js.UndefOr[Boolean] = js.native
  /** Indicates whether the total count of data objects is needed. */
  var requireTotalCount: js.UndefOr[Boolean] = js.native
  /** A data field or expression whose value is compared to the search value. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** A comparison operation. Can have one of the following values: "=", "<>", ">", ">=", "<", "<=", "startswith", "endswith", "contains", "notcontains", "isblank" and "isnotblank". */
  var searchOperation: js.UndefOr[String] = js.native
  /** The current search value. */
  var searchValue: js.UndefOr[js.Any] = js.native
  /** A select expression. */
  var select: js.UndefOr[js.Any] = js.native
  /** The number of data objects to be skipped from the result set's start. In conjunction with take, used to implement paging. */
  var skip: js.UndefOr[Double] = js.native
  /** A sort expression. */
  var sort: js.UndefOr[js.Any] = js.native
  /** The number of data objects to be loaded. In conjunction with skip, used to implement paging. */
  var take: js.UndefOr[Double] = js.native
  /** A total summary expression. */
  var totalSummary: js.UndefOr[js.Any] = js.native
  /** An object for storing additional settings that should be sent to the server. */
  var userData: js.UndefOr[js.Any] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomQueryParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSummary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIds(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireGroupCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireGroupCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireGroupCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireGroupCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireTotalCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTake(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSummary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

