package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRangeRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.native
  var shiftDimension: js.UndefOr[String] = js.native
}

object DeleteRangeRequest {
  @scala.inline
  def apply(): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRangeRequest]
  }
  @scala.inline
  implicit class DeleteRangeRequestOps[Self <: DeleteRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDimension")(js.undefined)
        ret
    }
  }
  
}

