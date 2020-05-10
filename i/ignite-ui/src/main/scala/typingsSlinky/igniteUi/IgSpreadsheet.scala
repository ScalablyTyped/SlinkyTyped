package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSpreadsheet
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Invoked when an action is executed on the Spreadsheet.
  	 */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.native
  /**
  	 * Invoked when an action is about to be executed by the Spreadsheet.
  	 */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.native
  /**
  	 * Returns or sets the A1 format address of the current active cell within the selected worksheet.
  	 *
  	 */
  var activeCell: js.UndefOr[String] = js.native
  /**
  	 * Invoked when the activeCell of the Spreadsheet has changed.
  	 */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.native
  /**
  	 * Invoked when the activePane of the Spreadsheet has changed.
  	 */
  var activePaneChanged: js.UndefOr[ActivePaneChangedEvent] = js.native
  /**
  	 * Invoked when the activeTable of the Spreadsheet has changed.
  	 */
  var activeTableChanged: js.UndefOr[ActiveTableChangedEvent] = js.native
  /**
  	 * Returns or sets the Worksheet from the workbook whose content should be displayed within the control.
  	 *
  	 */
  var activeWorksheet: js.UndefOr[js.Any] = js.native
  /**
  	 * Invoked when the activeWorksheet of the Spreadsheet has changed.
  	 */
  var activeWorksheetChanged: js.UndefOr[ActiveWorksheetChangedEvent] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the spreadsheet allows adding worksheets.
  	 *
  	 */
  var allowAddWorksheet: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the spreadsheet allows deleting worksheets.
  	 *
  	 */
  var allowDeleteWorksheet: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating if the grid lines are displayed in the selected worksheets.
  	 *
  	 */
  var areGridlinesVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating if the row and column headers are displayed for the selected worksheets.
  	 *
  	 */
  var areHeadersVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets an object with brushes for areas of the spreadsheet. The property name should be an item in the [SpreadsheetResourceId enumeration](ig.spreadsheet.SpreadsheetResourceId) and the property value a string representing a brush. These brushes override any css styling for the associated object.
  	 *
  	 */
  var brushes: js.UndefOr[IgSpreadsheetBrushes] = js.native
  /**
  	 * Invoked when a contextmenu is being opened for the Spreadsheet.
  	 */
  var contextMenuOpening: js.UndefOr[ContextMenuOpeningEvent] = js.native
  /**
  	 * Invoked when the Spreadsheet has started in-place editing of the activeCell.
  	 */
  var editModeEntered: js.UndefOr[EditModeEnteredEvent] = js.native
  /**
  	 * Invoked when the Spreadsheet is about to start in-place editing of the activeCell.
  	 */
  var editModeEntering: js.UndefOr[EditModeEnteringEvent] = js.native
  /**
  	 * Invoked when the Spreadsheet has ended the in-place editing of the activeCell.
  	 */
  var editModeExited: js.UndefOr[EditModeExitedEvent] = js.native
  /**
  	 * Invoked when the Spreadsheet is about to end the in-place editing of the activeCell.
  	 */
  var editModeExiting: js.UndefOr[EditModeExitingEvent] = js.native
  /**
  	 * Invoked when the Spreadsheet is exiting edit mode and the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
  	 * The EditModeValidationError is raised while exiting edit mode if the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
  	 * Since the rule needs to evaluate the value of the cell and potentially other cell's in the Worksheet, the value is first applied to the cell(s) and then is validated. By default if the event is not handled and the
  	 * showErrorMessageForInvalidValue is true, a message box will be displayed to the end user to determine what action to take. One can handle this event and specify the action that should
  	 * be taken using the action.Note: The validation rule will not be evaluated if edit mode is being cancelled such as when the user presses Escape to cancel edit.Note: The action will default to AcceptChange if the ShowErrorMessageForInvalidValue of the validationRule is false; otherwise it will default to ShowPrompt.Note: Like Microsoft Excel, only the validation rule of the active cell is considered even if the update is affecting other cells in the selection.
  	 */
  var editModeValidationError: js.UndefOr[EditModeValidationErrorEvent] = js.native
  /**
  	 * Invoked when the Spreadsheet is performing an operation on a protected Worksheet and there is a single range that may be unlocked to allow the operation to be performed.
  	 */
  var editRangePasswordNeeded: js.UndefOr[EditRangePasswordNeededEvent] = js.native
  /**
  	 * Returns or sets an enumeration indicating the direction of the cell adjacent to the activeCell that should be activated when the enter key is pressed.
  	 * This property is only used if the isEnterKeyNavigationEnabled is set to true. Also, the reverse direction is
  	 * navigated when Shift + Enter are pressed.
  	 * down  The cell below should be activated.
  	 * right  The cell to the right should be activated
  	 * up  The cell above should be activated.
  	 * left  The cell to the left should be activated
  	 *
  	 */
  var enterKeyNavigationDirection: js.UndefOr[String] = js.native
  /**
  	 * Returns or sets the number of decimal places by which a whole number typed in during edit mode should be adjusted when isFixedDecimalEnabled is true
  	 *
  	 */
  var fixedDecimalPlaceCount: js.UndefOr[Double] = js.native
  /**
  	 * The height of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Invoked when a hyperlink is being followed in the Spreadsheet.
  	 */
  var hyperlinkExecuting: js.UndefOr[HyperlinkExecutingEvent] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the adjacent cell indicated by the enterKeyNavigationDirection should be navigated to when the enter key is pressed.
  	 *
  	 */
  var isEnterKeyNavigationEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating whether a fixed decimal place is automatically added when a whole number is entered while in edit mode.
  	 *
  	 */
  var isFixedDecimalEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating if the formula bar is displayed within the Spreadsheet.
  	 *
  	 */
  var isFormulaBarVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the control is in "End mode".
  	 * End mode is a mode that affects certain keyboard navigation such as navigating with the arrow keys. For example when in
  	 * end mode and one presses the right arrow, the activeCell will be changed to be the first cell to the right of the current ActiveCell
  	 * that has a value (even if the value is ""). If there were no cells to the right with a value then it would activate the right most cell in that row. End
  	 * mode will end automatically such as when one presses an arrow key.
  	 *
  	 */
  var isInEndMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating whether the scroll lock key is toggled.
  	 * This property is used when certain keys are pressed while the control has focus. For example
  	 * if an arrow key is pressed while the scroll lock is enabled the cell area will be scrolled rather than changing
  	 * the active cell. Note: This property is not maintained/changed by the control. It is just queried when
  	 * performing actions that consider whether the scroll lock is enabled.
  	 *
  	 */
  var isScrollLocked: js.UndefOr[Boolean] = js.native
  /**
  	 * Returns or sets a boolean indicating whether undo is enabled for the control.
  	 *
  	 */
  var isUndoEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Returns or sets the width of the name box within the formula bar.
  	 *
  	 */
  var nameBoxWidth: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Type="ig.excel.Worksheet[]" Returns or sets an array of the Worksheets whose tabs are selected.
  	 *
  	 */
  var selectedWorksheets: js.UndefOr[js.Any] = js.native
  /**
  	 * Invoked when the selection for a ig.spreadsheet.SpreadsheetPane of the Spreadsheet is changed.
  	 */
  var selectionChanged: js.UndefOr[IgSpreadsheetSelectionChangedEvent] = js.native
  /**
  	 * Returns or sets a value indicating how the selection is updated when interacting with the cells via the mouse or keyboard.
  	 * normal  The selection is replaced when dragging the mouse to select a cell or range of cells. Similarly when navigating via the keyboard a new selection is created. One may add a new range by holding the Ctrl key and using the mouse and one may alter the selection range containing the active cell by holding the Shift key down while clicking with the mouse or navigating with the keyboard such as with the arrow keys.
  	 * extendSelection  The selection range in the cellRanges representing the active cell is updated as one uses the mouse to select a cell or navigating via the keyboard.
  	 * addToSelection  New cell ranges are added to the cellRanges without needing to hold down the ctrl key when dragging via the mouse and a range is added with the first arrow key navigation after entering the mode. One can enter the mode by pressing Shift+F8.
  	 *
  	 */
  var selectionMode: js.UndefOr[String] = js.native
  /**
  	 * Invoked when the user will be prompted with a message regarding an operation that is being performed.
  	 */
  var userPromptDisplaying: js.UndefOr[UserPromptDisplayingEvent] = js.native
  /**
  	 * Returns or sets the position of the screen tip used to display the input message for the data validation rule associated with the active cell.
  	 *
  	 * The provided object should have numeric properties called x and y.
  	 */
  var validationInputMessagePosition: js.UndefOr[js.Any] = js.native
  /**
  	 * The width of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number
  	 */
  var width: js.UndefOr[String | Double] = js.native
  /**
  	 * Returns or sets the workbook whose information is displayed in the control.
  	 *
  	 */
  var workbook: js.UndefOr[js.Any] = js.native
  /**
  	 * Invoked when a change has been made to the workbook that might require a save.
  	 * Note: This event is invoked asynchronously with regards to the change(s) that
  	 * have occurred. Also some changes alone are not considered to dirty the Workbook even though it
  	 * does change state on the Workbook or one of its subobjects. An example of that would be a zoom
  	 * type operation (e.g. changing the magnificationInNormalView).
  	 */
  var workbookDirtied: js.UndefOr[WorkbookDirtiedEvent] = js.native
  /**
  	 * Returns or sets the magnification of the selected worksheets.
  	 *
  	 */
  var zoomLevel: js.UndefOr[Double] = js.native
}

object IgSpreadsheet {
  @scala.inline
  def apply(): IgSpreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSpreadsheet]
  }
  @scala.inline
  implicit class IgSpreadsheetOps[Self <: IgSpreadsheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionExecuted(value: (/* event */ Event_, /* ui */ ActionExecutedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActionExecuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuted")(js.undefined)
        ret
    }
    @scala.inline
    def withActionExecuting(value: (/* event */ Event_, /* ui */ ActionExecutingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActionExecuting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecuting")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCellChanged(value: (/* event */ Event_, /* ui */ ActiveCellChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCellChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveCellChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCellChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withActivePaneChanged(value: (/* event */ Event_, /* ui */ ActivePaneChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePaneChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivePaneChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePaneChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveTableChanged(value: (/* event */ Event_, /* ui */ ActiveTableChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTableChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveTableChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTableChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveWorksheet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeWorksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeWorksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveWorksheetChanged(value: (/* event */ Event_, /* ui */ ActiveWorksheetChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeWorksheetChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActiveWorksheetChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeWorksheetChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAddWorksheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddWorksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAddWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAddWorksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleteWorksheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteWorksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleteWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleteWorksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withAreGridlinesVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areGridlinesVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreGridlinesVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areGridlinesVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withAreHeadersVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areHeadersVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreHeadersVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areHeadersVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushes(value: IgSpreadsheetBrushes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushes")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuOpening(value: (/* event */ Event_, /* ui */ ContextMenuOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutContextMenuOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withEditModeEntered(value: (/* event */ Event_, /* ui */ EditModeEnteredEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeEntered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditModeEntered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeEntered")(js.undefined)
        ret
    }
    @scala.inline
    def withEditModeEntering(value: (/* event */ Event_, /* ui */ EditModeEnteringEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeEntering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditModeEntering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeEntering")(js.undefined)
        ret
    }
    @scala.inline
    def withEditModeExited(value: (/* event */ Event_, /* ui */ EditModeExitedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeExited")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditModeExited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeExited")(js.undefined)
        ret
    }
    @scala.inline
    def withEditModeExiting(value: (/* event */ Event_, /* ui */ EditModeExitingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeExiting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditModeExiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeExiting")(js.undefined)
        ret
    }
    @scala.inline
    def withEditModeValidationError(value: (/* event */ Event_, /* ui */ EditModeValidationErrorEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeValidationError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditModeValidationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editModeValidationError")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRangePasswordNeeded(value: (/* event */ Event_, /* ui */ EditRangePasswordNeededEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRangePasswordNeeded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEditRangePasswordNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRangePasswordNeeded")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterKeyNavigationDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKeyNavigationDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterKeyNavigationDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKeyNavigationDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedDecimalPlaceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedDecimalPlaceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedDecimalPlaceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedDecimalPlaceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinkExecuting(value: (/* event */ Event_, /* ui */ HyperlinkExecutingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkExecuting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHyperlinkExecuting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkExecuting")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnterKeyNavigationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnterKeyNavigationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnterKeyNavigationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnterKeyNavigationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFixedDecimalEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixedDecimalEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFixedDecimalEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixedDecimalEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFormulaBarVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormulaBarVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFormulaBarVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormulaBarVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInEndMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInEndMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInEndMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInEndMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScrollLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrollLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUndoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUndoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUndoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUndoEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
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
    def withNameBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameBoxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameBoxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedWorksheets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedWorksheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedWorksheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedWorksheets")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChanged(value: (/* event */ Event_, /* ui */ IgSpreadsheetSelectionChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPromptDisplaying(value: (/* event */ Event_, /* ui */ UserPromptDisplayingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPromptDisplaying")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUserPromptDisplaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPromptDisplaying")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationInputMessagePosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationInputMessagePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationInputMessagePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationInputMessagePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkbook(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkbook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workbook")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkbookDirtied(value: (/* event */ Event_, /* ui */ WorkbookDirtiedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workbookDirtied")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWorkbookDirtied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workbookDirtied")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(js.undefined)
        ret
    }
  }
  
}

