package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotTable.toJSON()`. */
@js.native
trait PivotTableData extends js.Object {
  /**
    *
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var columnHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
  /**
    *
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataHierarchies: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.native
  /**
    *
    * Specifies whether the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.native
  /**
    *
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var filterHierarchies: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.native
  /**
    *
    * The Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var hierarchies: js.UndefOr[js.Array[PivotHierarchyData]] = js.native
  /**
    *
    * Id of the PivotTable. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rowHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
  /**
    *
    * Specifies whether the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.native
}

object PivotTableData {
  @scala.inline
  def apply(): PivotTableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableData]
  }
  @scala.inline
  implicit class PivotTableDataOps[Self <: PivotTableData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHierarchies(value: js.Array[RowColumnPivotHierarchyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHierarchies")(js.undefined)
        ret
    }
    @scala.inline
    def withDataHierarchies(value: js.Array[DataPivotHierarchyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHierarchies")(js.undefined)
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
    def withFilterHierarchies(value: js.Array[FilterPivotHierarchyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHierarchies")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchies(value: js.Array[PivotHierarchyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchies")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withRowHierarchies(value: js.Array[RowColumnPivotHierarchyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHierarchies")(js.undefined)
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

