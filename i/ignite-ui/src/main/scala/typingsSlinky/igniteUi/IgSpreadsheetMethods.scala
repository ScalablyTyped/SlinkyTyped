package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSpreadsheetMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  def changeLocale($container: js.Object): Unit = js.native
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Executes the action associated with the specified id.
  	 *
  	 * @param action An [enumeration](ig.spreadsheet.SpreadsheetAction) or string that identifies the action to execute.
  	 */
  def executeAction(action: js.Object): Boolean = js.native
  /**
  	 * Exports visual data from the spreadsheet to aid in unit testing
  	 */
  def exportVisualData(): Unit = js.native
  /**
  	 * Forces any pending deferred work to render on the spreadsheet before continuing
  	 */
  def flush(): Unit = js.native
  /**
  	 * Returns an object that represents the pane with the focus.
  	 */
  def getActivePane(): js.Object = js.native
  /**
  	 * Returns an object that represents the current selection of the active pane.
  	 */
  def getActiveSelection(): js.Object = js.native
  /**
  	 * Returns an object used to get the formatting of the activeCell and where modifications are applied to the entire active selection.
  	 *         Any changes made to this object will affect all the objects in the selection. So for example, the
  	 *         Font.Name may return "Arial" because the active cell has that as its resolved font name even though the other
  	 *         cells are using a different font but if you set the Font.Name of this object to "Arial" then all the objects
  	 *         affected by the selection will have their Font.Name updated to that value.
  	 */
  def getActiveSelectionCellRangeFormat(): js.Object = js.native
  /**
  	 * Returns an object that represents the pane with the focus.
  	 */
  def getActiveTable(): js.Object = js.native
  /**
  	 * Returns an enumeration used to indicate the current edit mode state.
  	 */
  def getCellEditMode(): js.Object = js.native
  /**
  	 * Returns a boolean indicating if the control is currently editing the value of the activeCell.
  	 */
  def getIsInEditMode(): Boolean = js.native
  /**
  	 * Returns a boolean indicating if the user is currently editing the name of the active worksheet.
  	 */
  def getIsRenamingWorksheet(): Boolean = js.native
  /**
  	 * Returns an array of the panes for the activeWorksheet.
  	 *
  	 *     returnType="ig.spreadsheet.SpreadsheetPane[]"
  	 */
  def getPanes(): Unit = js.native
  /**
  	 * Shows the filter dialog for the specified relative column of the [filterSettings](ig.excel.Worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param worksheetTableColumn A [region](ig.excel.WorksheetTableColumn) whose filter is to be viewed or changed.
  	 * @param spreadsheetFilterDialogOption Optional enumeration that specifies the initial display of the filter dialog.
  	 */
  def showFilterDialogForTable(worksheetTableColumn: js.Object, spreadsheetFilterDialogOption: js.Object): Unit = js.native
  /**
  	 * Shows the filter dialog for the specified relative column of the [filterSettings](ig.excel.worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param relativeColumnIndex A zero based column index relative to the [region](ig.excel.worksheetFilterSettings#methods:region) of the active worksheet.
  	 * @param spreadsheetFilterDialogOption Optional enumeration that specifies the initial display of the filter dialog.
  	 */
  def showFilterDialogForWorksheet(relativeColumnIndex: Double, spreadsheetFilterDialogOption: js.Object): Unit = js.native
  /**
  	 * Shows the top or bottom dialog for the specified relative column of the [filterSettings](ig.excel.Worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param worksheetTableColumn A [region](ig.excel.WorksheetTableColumn) whose filter is to be viewed or changed.
  	 */
  def showTopOrBottomDialogForTable(worksheetTableColumn: js.Object): Unit = js.native
  /**
  	 * Shows the top or bottom dialog for the specified relative column of the [filterSettings](ig.excel.worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param relativeColumnIndex A zero based column index relative to the [region](ig.excel.worksheetFilterSettings#methods:region) of the active worksheet.
  	 */
  def showTopOrBottomDialogForWorksheet(relativeColumnIndex: Double): Unit = js.native
  /**
  	 * Notify the spreadsheet that style information used for rendering the spreadsheet may have been updated.
  	 */
  def styleUpdated(): Unit = js.native
}

object IgSpreadsheetMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    executeAction: js.Object => Boolean,
    exportVisualData: () => Unit,
    flush: () => Unit,
    getActivePane: () => js.Object,
    getActiveSelection: () => js.Object,
    getActiveSelectionCellRangeFormat: () => js.Object,
    getActiveTable: () => js.Object,
    getCellEditMode: () => js.Object,
    getIsInEditMode: () => Boolean,
    getIsRenamingWorksheet: () => Boolean,
    getPanes: () => Unit,
    showFilterDialogForTable: (js.Object, js.Object) => Unit,
    showFilterDialogForWorksheet: (Double, js.Object) => Unit,
    showTopOrBottomDialogForTable: js.Object => Unit,
    showTopOrBottomDialogForWorksheet: Double => Unit,
    styleUpdated: () => Unit
  ): IgSpreadsheetMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), executeAction = js.Any.fromFunction1(executeAction), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getActivePane = js.Any.fromFunction0(getActivePane), getActiveSelection = js.Any.fromFunction0(getActiveSelection), getActiveSelectionCellRangeFormat = js.Any.fromFunction0(getActiveSelectionCellRangeFormat), getActiveTable = js.Any.fromFunction0(getActiveTable), getCellEditMode = js.Any.fromFunction0(getCellEditMode), getIsInEditMode = js.Any.fromFunction0(getIsInEditMode), getIsRenamingWorksheet = js.Any.fromFunction0(getIsRenamingWorksheet), getPanes = js.Any.fromFunction0(getPanes), showFilterDialogForTable = js.Any.fromFunction2(showFilterDialogForTable), showFilterDialogForWorksheet = js.Any.fromFunction2(showFilterDialogForWorksheet), showTopOrBottomDialogForTable = js.Any.fromFunction1(showTopOrBottomDialogForTable), showTopOrBottomDialogForWorksheet = js.Any.fromFunction1(showTopOrBottomDialogForWorksheet), styleUpdated = js.Any.fromFunction0(styleUpdated))
    __obj.asInstanceOf[IgSpreadsheetMethods]
  }
  @scala.inline
  implicit class IgSpreadsheetMethodsOps[Self <: IgSpreadsheetMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeGlobalLanguage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeGlobalRegional(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalRegional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeLocale(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecuteAction(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExportVisualData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportVisualData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActivePane(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActivePane")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveSelection(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveSelectionCellRangeFormat(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveSelectionCellRangeFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveTable(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCellEditMode(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellEditMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsInEditMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsInEditMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsRenamingWorksheet(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsRenamingWorksheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPanes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowFilterDialogForTable(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterDialogForTable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowFilterDialogForWorksheet(value: (Double, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilterDialogForWorksheet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowTopOrBottomDialogForTable(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTopOrBottomDialogForTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowTopOrBottomDialogForWorksheet(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTopOrBottomDialogForWorksheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyleUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUpdated")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

