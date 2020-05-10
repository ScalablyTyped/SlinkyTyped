package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarIconSettings extends js.Object {
  /** Allows you to set the visibility of Add Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableAddReport: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Calculated Member icon in the toolbar panel.
    * @Default {false}
    */
  var enableCalculatedMember: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Chart Types icon in the toolbar panel.
    * @Default {true}
    */
  var enableChartTypes: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of DB Manipulation icon in the toolbar panel.
    * @Default {true}
    */
  var enableDBManipulation: js.UndefOr[Boolean] = js.native
  /** Allows to set the visibility of Defer Update icon in the toolbar panel.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Excel Export icon in the toolbar panel.
    * @Default {true}
    */
  var enableExcelExport: js.UndefOr[Boolean] = js.native
  /** Allows to set the visibility of Full Screen icon in the toolbar panel.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of MDX Query icon in the toolbar panel.
    * @Default {true}
    */
  var enableMDXQuery: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of New Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableNewReport: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of PDF Export icon in the toolbar panel.
    * @Default {true}
    */
  var enablePdfExport: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Remove Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableRemoveReport: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Rename Report icon in the toolbar panel.
    * @Default {true}
    */
  var enableRenameReport: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Sort/Filter Column icon in the toolbar panel.
    * @Default {true}
    */
  var enableSortOrFilterColumn: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Sort/Filter Row icon in the toolbar panel.
    * @Default {true}
    */
  var enableSortOrFilterRow: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Toggle Axis icon in the toolbar panel.
    * @Default {true}
    */
  var enableToggleAxis: js.UndefOr[Boolean] = js.native
  /** Allows you to set the visibility of Word Export icon in the toolbar panel.
    * @Default {true}
    */
  var enableWordExport: js.UndefOr[Boolean] = js.native
}

object ToolbarIconSettings {
  @scala.inline
  def apply(): ToolbarIconSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarIconSettings]
  }
  @scala.inline
  implicit class ToolbarIconSettingsOps[Self <: ToolbarIconSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableAddReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAddReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAddReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAddReport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCalculatedMember(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCalculatedMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCalculatedMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCalculatedMember")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableChartTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChartTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableChartTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChartTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDBManipulation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDBManipulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDBManipulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDBManipulation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeferUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeferUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeferUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableExcelExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExcelExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExcelExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExcelExport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMDXQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMDXQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMDXQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMDXQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNewReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNewReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNewReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNewReport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePdfExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePdfExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePdfExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePdfExport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRemoveReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRemoveReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRemoveReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRemoveReport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRenameReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRenameReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRenameReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRenameReport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSortOrFilterColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSortOrFilterColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSortOrFilterColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSortOrFilterColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSortOrFilterRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSortOrFilterRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSortOrFilterRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSortOrFilterRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToggleAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToggleAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToggleAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToggleAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWordExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWordExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordExport")(js.undefined)
        ret
    }
  }
  
}

