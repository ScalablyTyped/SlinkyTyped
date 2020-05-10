package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Local
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Remote
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WorksheetRowSorted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the row-sorted event and its related worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait WorksheetRowSortedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the sorted areas of a specific worksheet. Only rows changed as a result of the sort operation are returned.
    *
    * [Api set: ExcelApi 1.10]
    */
  var address: String = js.native
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var source: EventSource | Local | Remote = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetRowSorted = js.native
  /**
    *
    * Gets the id of the worksheet where the sorting happened.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheetId: String = js.native
}

object WorksheetRowSortedEventArgs {
  @scala.inline
  def apply(
    address: String,
    source: EventSource | Local | Remote,
    `type`: WorksheetRowSorted,
    worksheetId: String
  ): WorksheetRowSortedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetRowSortedEventArgs]
  }
  @scala.inline
  implicit class WorksheetRowSortedEventArgsOps[Self <: WorksheetRowSortedEventArgs] (val x: Self) extends AnyVal {
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
    def withSource(value: EventSource | Local | Remote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WorksheetRowSorted): Self = {
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

