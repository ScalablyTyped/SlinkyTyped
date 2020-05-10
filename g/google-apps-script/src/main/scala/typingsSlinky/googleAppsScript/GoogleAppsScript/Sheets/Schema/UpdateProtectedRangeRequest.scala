package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProtectedRangeRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var protectedRange: js.UndefOr[ProtectedRange] = js.native
}

object UpdateProtectedRangeRequest {
  @scala.inline
  def apply(): UpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProtectedRangeRequest]
  }
  @scala.inline
  implicit class UpdateProtectedRangeRequestOps[Self <: UpdateProtectedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedRange(value: ProtectedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRange")(js.undefined)
        ret
    }
  }
  
}

