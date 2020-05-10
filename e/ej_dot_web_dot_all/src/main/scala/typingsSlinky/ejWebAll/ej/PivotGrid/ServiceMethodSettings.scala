package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for adding a calculated field to the report.
    * @Default {CalculatedField}
    */
  var calculatedField: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for editing the cells.
    * @Default {CellEditing}
    */
  var cellEditing: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method responsible for performing server-side actions based on defer update.
    * @Default {DeferUpdate}
    */
  var deferUpdate: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for service method which is responsible for drill up/down operation in the PivotGrid.
    * @Default {DrillGrid}
    */
  var drillDown: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for exporting.
    * @Default {Export}
    */
  var exportPivotGrid: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for getting values of the tree-view inside filter dialog.
    * @Default {FetchMembers}
    */
  var fetchMembers: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for filtering operation in the PivotGrid.
    * @Default {Filtering}
    */
  var filtering: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for initializing the PivotGrid.
    * @Default {InitializeGrid}
    */
  var initialize: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for loading a report from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for expanding members in the member editor.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for the server-side action when dropping a node from the field list.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for server-side action when changing the checked state of a node in the field list.
    * @Default {NodeStateModified}
    */
  var nodeStateModified: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing paging operation in the PivotGrid.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for removing the pivot button from the GroupingBar/field list.
    * @Default {RemoveButton}
    */
  var removeButton: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for saving the current report to the database.
    * @Default {SaveReport}
    */
  var saveReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for sorting operation in the PivotGrid.
    * @Default {Sorting}
    */
  var sorting: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotGrid.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for write-back operation in the OLAP Cube. This is applicable only in the server-side component.
    * @Default {WriteBack}
    */
  var writeBack: js.UndefOr[String] = js.native
}

object ServiceMethodSettings {
  @scala.inline
  def apply(): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMethodSettings]
  }
  @scala.inline
  implicit class ServiceMethodSettingsOps[Self <: ServiceMethodSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculatedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedField")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThroughDataTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThroughDataTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillThroughDataTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThroughDataTable")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThroughHierarchies(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThroughHierarchies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillThroughHierarchies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThroughHierarchies")(js.undefined)
        ret
    }
    @scala.inline
    def withExportPivotGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPivotGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportPivotGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPivotGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchMembers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReport")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberExpand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDropped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeStateModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStateModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeStateModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStateModified")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReport")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSorting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBack")(js.undefined)
        ret
    }
  }
  
}

