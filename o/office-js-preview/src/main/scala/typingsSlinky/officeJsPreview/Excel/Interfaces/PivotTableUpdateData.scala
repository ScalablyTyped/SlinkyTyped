package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTable object, for use in `pivotTable.set({ ... })`. */
@js.native
trait PivotTableUpdateData extends js.Object {
  /**
    *
    * Specifies whether the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.native
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Specifies whether the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.native
}

object PivotTableUpdateData {
  @scala.inline
  def apply(): PivotTableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableUpdateData]
  }
  @scala.inline
  implicit class PivotTableUpdateDataOps[Self <: PivotTableUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleFiltersPerField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleFiltersPerField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleFiltersPerField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleFiltersPerField")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDataValueEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDataValueEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDataValueEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDataValueEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomSortLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomSortLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomSortLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomSortLists")(js.undefined)
        ret
    }
  }
  
}

