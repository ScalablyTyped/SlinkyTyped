package typingsSlinky.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetFromId extends Worksheet {
  @JSName("data")
  var data_WorksheetFromId: js.Array[Row] = js.native
}

object WorksheetFromId {
  @scala.inline
  def apply(data: js.Array[Row], title: String, updated: String): WorksheetFromId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetFromId]
  }
  @scala.inline
  implicit class WorksheetFromIdOps[Self <: WorksheetFromId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Row]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

