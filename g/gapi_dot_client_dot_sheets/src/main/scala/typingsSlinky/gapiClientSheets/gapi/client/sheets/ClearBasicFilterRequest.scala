package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearBasicFilterRequest extends js.Object {
  /** The sheet ID on which the basic filter should be cleared. */
  var sheetId: js.UndefOr[Double] = js.native
}

object ClearBasicFilterRequest {
  @scala.inline
  def apply(): ClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearBasicFilterRequest]
  }
  @scala.inline
  implicit class ClearBasicFilterRequestOps[Self <: ClearBasicFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(js.undefined)
        ret
    }
  }
  
}

