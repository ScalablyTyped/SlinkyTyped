package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hidden
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Local
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Remote
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unhidden
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WorksheetRowHiddenChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet's row hidden change event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait WorksheetRowHiddenChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var address: String = js.native
  /**
    *
    * Gets the type of change that represents how the event was triggered. See `Excel.RowHiddenChangeType` for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var changeType: RowHiddenChangeType | Unhidden | Hidden = js.native
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: WorksheetRowHiddenChanged = js.native
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String = js.native
}

object WorksheetRowHiddenChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    changeType: RowHiddenChangeType | Unhidden | Hidden,
    source: EventSource | Local | Remote,
    `type`: WorksheetRowHiddenChanged,
    worksheetId: String
  ): WorksheetRowHiddenChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetRowHiddenChangedEventArgs]
  }
  @scala.inline
  implicit class WorksheetRowHiddenChangedEventArgsOps[Self <: WorksheetRowHiddenChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeType(value: RowHiddenChangeType | Unhidden | Hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: EventSource | Local | Remote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WorksheetRowHiddenChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorksheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

