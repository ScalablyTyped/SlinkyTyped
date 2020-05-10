package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.WorksheetDeactivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorksheetDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetDeactivated = js.native
  /**
    *
    * Gets the id of the worksheet that is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String = js.native
}

object WorksheetDeactivatedEventArgs {
  @scala.inline
  def apply(`type`: WorksheetDeactivated, worksheetId: String): WorksheetDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetDeactivatedEventArgs]
  }
  @scala.inline
  implicit class WorksheetDeactivatedEventArgsOps[Self <: WorksheetDeactivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: WorksheetDeactivated): Self = {
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

