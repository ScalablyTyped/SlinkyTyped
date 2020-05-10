package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProtectedRangeRequest extends js.Object {
  /** The ID of the protected range to delete. */
  var protectedRangeId: js.UndefOr[Double] = js.native
}

object DeleteProtectedRangeRequest {
  @scala.inline
  def apply(): DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProtectedRangeRequest]
  }
  @scala.inline
  implicit class DeleteProtectedRangeRequestOps[Self <: DeleteProtectedRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtectedRangeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRangeId")(js.undefined)
        ret
    }
  }
  
}

