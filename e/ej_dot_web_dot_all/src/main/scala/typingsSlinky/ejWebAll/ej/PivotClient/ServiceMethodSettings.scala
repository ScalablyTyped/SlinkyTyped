package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for updating the report with the calculated member.
    * @Default {CalculatedMember}
    */
  var calculatedMember: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for updating the entire report and widget, while changing the cube.
    * @Default {CubeChanged}
    */
  var cubeChanged: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation in the data table.
    * @Default {DrillThroughDataTable}
    */
  var drillThroughDataTable: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing the drill through operation.
    * @Default {DrillThroughHierarchies}
    */
  var drillThroughHierarchies: js.UndefOr[String] = js.native
  /** Allows to set the custom name for the service method responsible for exporting.
    * @Default {Export}
    */
  var exportPivotClient: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible to get the members for tree-view in the member-editor dialog.
    * @Default {FetchMemberTreeNodes}
    */
  var fetchMemberTreeNodes: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for fetching the report names from the database.
    * @Default {FetchReportListFromDB}
    */
  var fetchReportList: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for updating the report while filtering the members.
    * @Default {FilterElement}
    */
  var filterElement: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for initializing the pivot client.
    * @Default {InitializeClient}
    */
  var initialize: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for loading a report collection from the database.
    * @Default {LoadReportFromDB}
    */
  var loadReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for retrieving the MDX query for the current report.
    * @Default {GetMDXQuery}
    */
  var mdxQuery: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for updating the tree-view in the cube browser, while changing the measure group.
    * @Default {MeasureGroupChanged}
    */
  var measureGroupChanged: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible to get the child members, on tree-view node expansion.
    * @Default {MemberExpanded}
    */
  var memberExpand: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for updating the report while dropping a node/split button in the axis element builder.
    * @Default {NodeDropped}
    */
  var nodeDropped: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method while navigating between the pages in the paged pivot client.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible to remove a report collection from the database.
    * @Default {RemoveReportFromDB}
    */
  var removeDBReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible to update the report while removing the split button from the axis element builder.
    * @Default {RemoveSplitButton}
    */
  var removeSplitButton: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for renaming the report collection in the database.
    * @Default {RenameReportInDB}
    */
  var renameDBReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for saving the report collection in the database.
    * @Default {SaveReportToDB}
    */
  var saveReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for toggling the elements in the row and column axes.
    * @Default {ToggleAxis}
    */
  var toggleAxis: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for all the toolbar operations.
    * @Default {ToolbarOperations}
    */
  var toolbarServices: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for updating the report collection.
    * @Default {UpdateReport}
    */
  var updateReport: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method that is responsible for performing value sorting operation in the PivotClient.
    * @Default {ValueSorting}
    */
  var valueSorting: js.UndefOr[String] = js.native
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
    def withCalculatedMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedMember")(js.undefined)
        ret
    }
    @scala.inline
    def withCubeChanged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCubeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeChanged")(js.undefined)
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
    def withExportPivotClient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPivotClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportPivotClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPivotClient")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchMemberTreeNodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMemberTreeNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchMemberTreeNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMemberTreeNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchReportList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchReportList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchReportList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchReportList")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterElement")(js.undefined)
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
    def withMdxQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdxQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdxQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdxQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureGroupChanged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureGroupChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureGroupChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureGroupChanged")(js.undefined)
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
    def withRemoveDBReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDBReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDBReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDBReport")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSplitButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSplitButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSplitButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSplitButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameDBReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameDBReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameDBReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameDBReport")(js.undefined)
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
    def withToggleAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarServices(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarServices")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReport")(js.undefined)
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
  }
  
}

