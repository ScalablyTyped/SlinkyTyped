package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetProtection extends js.Object {
  var autoFilter: Boolean = js.native
  var deleteColumns: Boolean = js.native
  var deleteRows: Boolean = js.native
  var formatCells: Boolean = js.native
  var formatColumns: Boolean = js.native
  var formatRows: Boolean = js.native
  var insertColumns: Boolean = js.native
  var insertHyperlinks: Boolean = js.native
  var insertRows: Boolean = js.native
  var objects: Boolean = js.native
  var pivotTables: Boolean = js.native
  var scenarios: Boolean = js.native
  var selectLockedCells: Boolean = js.native
  var selectUnlockedCells: Boolean = js.native
  var sort: Boolean = js.native
}

object WorksheetProtection {
  @scala.inline
  def apply(
    autoFilter: Boolean,
    deleteColumns: Boolean,
    deleteRows: Boolean,
    formatCells: Boolean,
    formatColumns: Boolean,
    formatRows: Boolean,
    insertColumns: Boolean,
    insertHyperlinks: Boolean,
    insertRows: Boolean,
    objects: Boolean,
    pivotTables: Boolean,
    scenarios: Boolean,
    selectLockedCells: Boolean,
    selectUnlockedCells: Boolean,
    sort: Boolean
  ): WorksheetProtection = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], deleteColumns = deleteColumns.asInstanceOf[js.Any], deleteRows = deleteRows.asInstanceOf[js.Any], formatCells = formatCells.asInstanceOf[js.Any], formatColumns = formatColumns.asInstanceOf[js.Any], formatRows = formatRows.asInstanceOf[js.Any], insertColumns = insertColumns.asInstanceOf[js.Any], insertHyperlinks = insertHyperlinks.asInstanceOf[js.Any], insertRows = insertRows.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], pivotTables = pivotTables.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], selectLockedCells = selectLockedCells.asInstanceOf[js.Any], selectUnlockedCells = selectUnlockedCells.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProtection]
  }
  @scala.inline
  implicit class WorksheetProtectionOps[Self <: WorksheetProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenarios(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectLockedCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectLockedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectUnlockedCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectUnlockedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

