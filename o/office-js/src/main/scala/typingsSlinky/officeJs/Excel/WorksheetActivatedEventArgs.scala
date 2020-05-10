package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.WorksheetActivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Activated event.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorksheetActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetActivated = js.native
  /**
    *
    * Gets the id of the worksheet that is activated.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String = js.native
}

object WorksheetActivatedEventArgs {
  @scala.inline
  def apply(`type`: WorksheetActivated, worksheetId: String): WorksheetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetActivatedEventArgs]
  }
  @scala.inline
  implicit class WorksheetActivatedEventArgsOps[Self <: WorksheetActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: WorksheetActivated): Self = {
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

