package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripsSearchRequest extends js.Object {
  /** A QPX Express search request. Required values are at least one adult or senior passenger, an origin, a destination, and a date. */
  var request: js.UndefOr[TripOptionsRequest] = js.native
}

object TripsSearchRequest {
  @scala.inline
  def apply(): TripsSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripsSearchRequest]
  }
  @scala.inline
  implicit class TripsSearchRequestOps[Self <: TripsSearchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: TripOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

