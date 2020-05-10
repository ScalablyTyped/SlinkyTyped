package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBandingRequest extends js.Object {
  /** The ID of the banded range to delete. */
  var bandedRangeId: js.UndefOr[Double] = js.native
}

object DeleteBandingRequest {
  @scala.inline
  def apply(): DeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBandingRequest]
  }
  @scala.inline
  implicit class DeleteBandingRequestOps[Self <: DeleteBandingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandedRangeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandedRangeId")(js.undefined)
        ret
    }
  }
  
}

