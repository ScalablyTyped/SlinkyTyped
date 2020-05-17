package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
@js.native
trait XGlobalSheetSettings extends js.Object {
  /** specifies whether automatic completion of text in a cell is used. */
  var DoAutoComplete: Boolean = js.native
  /** specifies whether the enter key can be used to start editing a cell. */
  var EnterEdit: Boolean = js.native
  /** specifies whether formula references are extended when cells are inserted below or to the right of them. */
  var ExpandReferences: Boolean = js.native
  /** specifies whether cell formatting is extended when entering data. */
  var ExtendFormat: Boolean = js.native
  /**
    * specifies the update mode for external linked data.
    *
    * 0 = always
    *
    * 1 = never
    *
    * 2 = on demand
    */
  var LinkUpdateMode: Double = js.native
  /** specifies whether the current selection is highlighted in column and row headers. */
  var MarkHeader: Boolean = js.native
  /**
    * contains the metric for all spreadsheet documents.
    * @see com.sun.star.util.MeasureUnit
    */
  var Metric: Double = js.native
  /**
    * contains the direction the cursor moves after entering cells.
    * @see com.sun.star.sheet.MoveDirection
    */
  var MoveDirection: Double = js.native
  /** specifies whether the cursor is moved after entering into cells. */
  var MoveSelection: Boolean = js.native
  /** specifies whether all sheets or only selected sheets are printed. */
  var PrintAllSheets: Boolean = js.native
  /** specifies whether empty pages are printed. */
  var PrintEmptyPages: Boolean = js.native
  /** specifies whether ranges are highlighted on the sheet when editing a formula. */
  var RangeFinder: Boolean = js.native
  /** specifies whether a warning is shown before replacing cells (i.e. when pasting from clipboard). */
  var ReplaceCellsWarning: Boolean = js.native
  /**
    * contains the default scale for new spreadsheet documents (in percent).
    *
    * There are several special values:
    *
    * -1 = Optimal width
    *
    * -2 = Show whole page
    *
    * -3 = Page width
    */
  var Scale: Double = js.native
  /**
    * contains the function that is displayed in the status bar.
    * @see com.sun.star.sheet.StatusBarFunction
    */
  var StatusBarFunction: Double = js.native
  /** specifies whether printer metrics are used for display. */
  var UsePrinterMetrics: Boolean = js.native
  /** specifies whether the enter key moves the cursor to the column it was in before using the tab key to change columns. */
  var UseTabCol: Boolean = js.native
  /**
    * contains the string lists used for sorting and filling.
    *
    * Each string contains the members of a list, separated by commas.
    */
  var UserLists: SafeArray[String] = js.native
}

object XGlobalSheetSettings {
  @scala.inline
  def apply(
    DoAutoComplete: Boolean,
    EnterEdit: Boolean,
    ExpandReferences: Boolean,
    ExtendFormat: Boolean,
    LinkUpdateMode: Double,
    MarkHeader: Boolean,
    Metric: Double,
    MoveDirection: Double,
    MoveSelection: Boolean,
    PrintAllSheets: Boolean,
    PrintEmptyPages: Boolean,
    RangeFinder: Boolean,
    ReplaceCellsWarning: Boolean,
    Scale: Double,
    StatusBarFunction: Double,
    UsePrinterMetrics: Boolean,
    UseTabCol: Boolean,
    UserLists: SafeArray[String]
  ): XGlobalSheetSettings = {
    val __obj = js.Dynamic.literal(DoAutoComplete = DoAutoComplete.asInstanceOf[js.Any], EnterEdit = EnterEdit.asInstanceOf[js.Any], ExpandReferences = ExpandReferences.asInstanceOf[js.Any], ExtendFormat = ExtendFormat.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], MarkHeader = MarkHeader.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], MoveDirection = MoveDirection.asInstanceOf[js.Any], MoveSelection = MoveSelection.asInstanceOf[js.Any], PrintAllSheets = PrintAllSheets.asInstanceOf[js.Any], PrintEmptyPages = PrintEmptyPages.asInstanceOf[js.Any], RangeFinder = RangeFinder.asInstanceOf[js.Any], ReplaceCellsWarning = ReplaceCellsWarning.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], StatusBarFunction = StatusBarFunction.asInstanceOf[js.Any], UsePrinterMetrics = UsePrinterMetrics.asInstanceOf[js.Any], UseTabCol = UseTabCol.asInstanceOf[js.Any], UserLists = UserLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[XGlobalSheetSettings]
  }
  @scala.inline
  implicit class XGlobalSheetSettingsOps[Self <: XGlobalSheetSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoAutoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnterEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandReferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkUpdateMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkUpdateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintAllSheets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintAllSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintEmptyPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintEmptyPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeFinder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeFinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceCellsWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceCellsWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusBarFunction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusBarFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePrinterMetrics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePrinterMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTabCol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseTabCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserLists(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserLists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

