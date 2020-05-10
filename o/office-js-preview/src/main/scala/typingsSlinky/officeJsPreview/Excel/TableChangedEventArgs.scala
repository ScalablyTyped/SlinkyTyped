package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CellDeleted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CellInserted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColumnDeleted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColumnInserted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Local
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RangeEdited
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Remote
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RowDeleted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RowInserted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TableChanged
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the Changed event.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait TableChangedEventArgs extends js.Object {
  /**
    *
    * Gets the address that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String = js.native
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted = js.native
  /**
    *
    * Gets the information about the change detail. This property can be retrieved when the Changed event is triggered on a single cell. If the Changed event is triggered on multiple cells, this property cannot be retrieved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var details: ChangedEventDetail = js.native
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote = js.native
  /**
    *
    * Gets the id of the table in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableChanged = js.native
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String = js.native
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range = js.native
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range = js.native
}

object TableChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    tableId: String,
    `type`: TableChanged,
    worksheetId: String
  ): TableChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangedEventArgs]
  }
  @scala.inline
  implicit class TableChangedEventArgsOps[Self <: TableChangedEventArgs] (val x: Self) extends AnyVal {
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
    def withChangeType(
      value: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: ChangedEventDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRange(value: RequestContext => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRangeOrNullObject(value: RequestContext => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRangeOrNullObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSource(value: EventSource | Local | Remote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TableChanged): Self = {
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

