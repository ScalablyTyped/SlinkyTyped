package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridUpdating
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
  	 * Use option [locale.addRowLabel](ui.iggridupdating#options:locale.addRowLabel).
  	 */
  var addRowLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
  	 * Use option [locale.addRowTooltip](ui.iggridupdating#options:locale.addRowTooltip).
  	 */
  var addRowTooltip: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
  	 * Use option [locale.cancelLabel](ui.iggridupdating#options:locale.cancelLabel).
  	 */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
  	 * Use option [locale.cancelTooltip](ui.iggridupdating#options:locale.cancelTooltip).
  	 */
  var cancelTooltip: js.UndefOr[String] = js.native
  /**
  	 * A list of custom column options that specify editing and validation settings for a specific column.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridUpdatingColumnSetting]] = js.native
  /**
  	 * Event fired before the dataDirtyException is thrown. This can be controlled by the [enableDataDirtyException](ui.iggridupdating#options:enableDataDirtyException) property. Any pending changes may be committed in the handler of this event in order to prevent dataDirtyException from being thrown.
  	 * Return false in order to prevent the exception.
  	 */
  var dataDirty: js.UndefOr[DataDirtyEvent] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowLabel is used.
  	 * Use option [locale.deleteRowLabel](ui.iggridupdating#options:locale.deleteRowLabel).
  	 */
  var deleteRowLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
  	 * Use option [locale.deleteRowTooltip](ui.iggridupdating#options:locale.deleteRowTooltip).
  	 */
  var deleteRowTooltip: js.UndefOr[String] = js.native
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. For more information on how to utilize this property, please refer to the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
  	 * Use option [locale.doneLabel](ui.iggridupdating#options:locale.doneLabel).
  	 */
  var doneLabel: js.UndefOr[String] = js.native
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
  	 * Use option [locale.doneTooltip](ui.iggridupdating#options:locale.doneTooltip).
  	 */
  var doneTooltip: js.UndefOr[String] = js.native
  /**
  	 * Event fired after cell editing ends (including when row editing closes editing for a cell).
  	 */
  var editCellEnded: js.UndefOr[EditCellEndedEvent] = js.native
  /**
  	 * Event fired before cell editing ends (including when row editing closes editing for a cell).
  	 * Return false in order to prevent the grid from exiting edit mode (only functions if [editMode](ui.iggridupdating#options:editMode) is 'cell').
  	 */
  var editCellEnding: js.UndefOr[EditCellEndingEvent] = js.native
  /**
  	 * Event fired after cell editing begins (including when row editing opens editing for a cell).
  	 */
  var editCellStarted: js.UndefOr[EditCellStartedEvent] = js.native
  /**
  	 * Event fired before cell editing begins (including when row editing opens editing for a cell).
  	 * Return false in order to cancel editing.
  	 */
  var editCellStarting: js.UndefOr[EditCellStartingEvent] = js.native
  /**
  	 * Specifies the edit mode.
  	 *
  	 *
  	 * Valid values:
  	 * "row" Editors are shown for all columns that are not read-only. The editor of the clicked cell receives initial focus. Done and Cancel buttons may be displayed based on the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) property.
  	 * "cell" An editor is shown for the cell entering edit mode. The Done and Cancel buttons are not supported for this mode.
  	 * "dialog" A popup dialog is used with seperate settings available through the [rowEditDialogOptions](ui.iggridupdating#options:rowEditDialogOptions) property.
  	 * "none" Editing through the UI is disabled.
  	 */
  var editMode: js.UndefOr[String] = js.native
  /**
  	 * Event fired after row editing ends.
  	 */
  var editRowEnded: js.UndefOr[EditRowEndedEvent] = js.native
  /**
  	 * Event fired before row editing ends.
  	 * Return false in order to prevent the grid from exiting edit mode.
  	 */
  var editRowEnding: js.UndefOr[EditRowEndingEvent] = js.native
  /**
  	 * Event fired after row editing begins.
  	 */
  var editRowStarted: js.UndefOr[EditRowStartedEvent] = js.native
  /**
  	 * Event fired before row editing begins.
  	 * Return false in order to cancel editing.
  	 */
  var editRowStarting: js.UndefOr[EditRowStartingEvent] = js.native
  /**
  	 * Specifies if adding rows through the UI is enabled. When enabled an additional row is rendered at the bottom of the grid's header that works as a button. When the end-user clicks on it edit mode is initiated either through a dialog (when [editMode](ui.iggridupdating#options:editMode) is 'dialog') or mimicking the look and feel of 'row' [editMode](ui.iggridupdating#options:editMode) (when [editMode](ui.iggridupdating#options:editMode) is 'row' or 'cell').
  	 *
  	 */
  var enableAddRow: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if an exception should be thrown when the grid's data view changes while there are pending transactions in the data source. The data view changes when the data source performs a sorting, filtering, groupby or paging operation and the exception thrown will prevent the operation from succeeding. All pending transactions must be committed before a data view operation is able to complete. Committing transactions can be done manually through the grid's [commit](ui.iggrid#methods:commit) function or automatically by setting [autoCommit](ui.iggrid#options:autoCommit) to 'true'.
  	 *
  	 */
  var enableDataDirtyException: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if deleting rows through the UI is enabled.
  	 *
  	 */
  var enableDeleteRow: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables excel navigation style. When turned on, the arrow keys can be used for changing the currently edited cell similar to how Tab and Enter behave. When disabled, the arrow keys control the cursor inside editors.
  	 *
  	 */
  var excelNavigationMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired before editing starts for adding a new row, when Updating generates an automatic primary key for it.
  	 */
  var generatePrimaryKeyValue: js.UndefOr[GeneratePrimaryKeyValueEvent] = js.native
  /**
  	 * Determines if pressing Enter to navigate away from the currently edited cell should move the focus horizontally or vertically (default).
  	 *
  	 */
  var horizontalMoveOnEnter: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts in igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[IgGridUpdatingLocale] = js.native
  /**
  	 * Event fired after adding a new row.
  	 */
  var rowAdded: js.UndefOr[RowAddedEvent] = js.native
  /**
  	 * Event fired before adding a new row.
  	 * Return false in order to cancel the adding of the new row to the data source.
  	 */
  var rowAdding: js.UndefOr[RowAddingEvent] = js.native
  /**
  	 * Event fired after a row is deleted.
  	 */
  var rowDeleted: js.UndefOr[RowDeletedEvent] = js.native
  /**
  	 * Event fired before deleting a row.
  	 * Return false in order to cancel the row's deletion.
  	 */
  var rowDeleting: js.UndefOr[RowDeletingEvent] = js.native
  /**
  	 * Event fired after the row edit dialog is closed.
  	 */
  var rowEditDialogAfterClose: js.UndefOr[RowEditDialogAfterCloseEvent] = js.native
  /**
  	 * Event fired after the row edit dialog is opened.
  	 */
  var rowEditDialogAfterOpen: js.UndefOr[RowEditDialogAfterOpenEvent] = js.native
  /**
  	 * Event fired before the row edit dialog is closed.
  	 */
  var rowEditDialogBeforeClose: js.UndefOr[RowEditDialogBeforeCloseEvent] = js.native
  /**
  	 * Event fired before the row edit dialog is opened.
  	 */
  var rowEditDialogBeforeOpen: js.UndefOr[RowEditDialogBeforeOpenEvent] = js.native
  /**
  	 * Event fired after the row edit dialog is rendered.
  	 */
  var rowEditDialogContentsRendered: js.UndefOr[RowEditDialogContentsRenderedEvent] = js.native
  /**
  	 * A list of options controlling the rendering behavior of the row edit dialog. If [editMode](ui.iggridupdating#options:editMode) is not 'dialog' these have no effect.
  	 *
  	 */
  var rowEditDialogOptions: js.UndefOr[IgGridUpdatingRowEditDialogOptions] = js.native
  /**
  	 * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property fails. The function will be called with arguments representing the data returned by the server.
  	 *
  	 */
  var saveChangesErrorHandler: js.UndefOr[js.Function | String] = js.native
  /**
  	 * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property succeeds. The function will be called with arguments representing the data returned by the server.
  	 *
  	 */
  var saveChangesSuccessHandler: js.UndefOr[js.Function | String] = js.native
  /**
  	 * Determines if the Done and Cancel buttons will be available as means to end edit mode for [editMode](ui.iggridupdating#options:editMode) 'row' and when adding a new row.
  	 *
  	 */
  var showDoneCancelButtons: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies how end-users are able to start edit mode. Possible values: "click", "dblclick", "F2", "enter" and their combinations separated by coma or in array. The keyboard triggers have effect only if the grid cells can receive focus (the grid's [tabIndex](ui.iggrid#options:tabIndex) property should not have a negative value) or Selection is enabled. If "dblclick" is included, then "click" has no effect.
  	 *
  	 */
  var startEditTriggers: js.UndefOr[String | js.Array[_]] = js.native
  /**
  	 * On touch-enabled devices specifies the swipe distance for the delete button to appear.
  	 *
  	 */
  var swipeDistance: js.UndefOr[String | Double] = js.native
  /**
  	 * Specifies if the value of each editable column in the grid should be validated. The validation is done based on the rules of their corresponding editors.
  	 *
  	 */
  var validation: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls if navigation will wrap around the grid. The feature will never wrap around virtual grids.
  	 *
  	 */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object IgGridUpdating {
  @scala.inline
  def apply(): IgGridUpdating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdating]
  }
  @scala.inline
  implicit class IgGridUpdatingOps[Self <: IgGridUpdating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRowLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAddRowTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridUpdatingColumnSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDirty(value: (/* event */ Event, /* ui */ DataDirtyEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDirty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRowLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRowLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRowLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRowTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRowTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRowTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogWidget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidget")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withEditCellEnded(value: (/* event */ Event, /* ui */ EditCellEndedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellEnded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditCellEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withEditCellEnding(value: (/* event */ Event, /* ui */ EditCellEndingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellEnding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditCellEnding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellEnding")(js.undefined)
        ret
    }
    @scala.inline
    def withEditCellStarted(value: (/* event */ Event, /* ui */ EditCellStartedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellStarted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditCellStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withEditCellStarting(value: (/* event */ Event, /* ui */ EditCellStartingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellStarting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditCellStarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellStarting")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRowEnded(value: (/* event */ Event, /* ui */ EditRowEndedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowEnded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditRowEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRowEnding(value: (/* event */ Event, /* ui */ EditRowEndingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowEnding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditRowEnding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowEnding")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRowStarted(value: (/* event */ Event, /* ui */ EditRowStartedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowStarted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditRowStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRowStarting(value: (/* event */ Event, /* ui */ EditRowStartingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowStarting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditRowStarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRowStarting")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAddRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAddRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAddRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAddRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDataDirtyException(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDataDirtyException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDataDirtyException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDataDirtyException")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDeleteRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeleteRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDeleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelNavigationMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelNavigationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelNavigationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelNavigationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratePrimaryKeyValue(value: (/* event */ Event, /* ui */ GeneratePrimaryKeyValueEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePrimaryKeyValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGeneratePrimaryKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePrimaryKeyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalMoveOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalMoveOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalMoveOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalMoveOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgGridUpdatingLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withRowAdded(value: (/* event */ Event, /* ui */ RowAddedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withRowAdding(value: (/* event */ Event, /* ui */ RowAddingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeleted(value: (/* event */ Event, /* ui */ RowDeletedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeleting(value: (/* event */ Event, /* ui */ RowDeletingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditDialogAfterClose(value: (/* event */ Event, /* ui */ RowEditDialogAfterCloseEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogAfterClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowEditDialogAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogAfterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditDialogAfterOpen(value: (/* event */ Event, /* ui */ RowEditDialogAfterOpenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogAfterOpen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowEditDialogAfterOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogAfterOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditDialogBeforeClose(value: (/* event */ Event, /* ui */ RowEditDialogBeforeCloseEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogBeforeClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowEditDialogBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogBeforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditDialogBeforeOpen(value: (/* event */ Event, /* ui */ RowEditDialogBeforeOpenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogBeforeOpen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowEditDialogBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogBeforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditDialogContentsRendered(value: (/* event */ Event, /* ui */ RowEditDialogContentsRenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogContentsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRowEditDialogContentsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogContentsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEditDialogOptions(value: IgGridUpdatingRowEditDialogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowEditDialogOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditDialogOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveChangesErrorHandler(value: js.Function | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChangesErrorHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveChangesErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChangesErrorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveChangesSuccessHandler(value: js.Function | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChangesSuccessHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveChangesSuccessHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChangesSuccessHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDoneCancelButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoneCancelButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDoneCancelButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoneCancelButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEditTriggers(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEditTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartEditTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEditTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeDistance(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(js.undefined)
        ret
    }
  }
  
}

