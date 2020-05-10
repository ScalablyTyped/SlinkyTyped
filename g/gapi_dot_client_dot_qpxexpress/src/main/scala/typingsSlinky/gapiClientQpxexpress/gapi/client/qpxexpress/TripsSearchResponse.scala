package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripsSearchResponse extends js.Object {
  /** Identifies this as a QPX Express API search response resource. Value: the fixed string qpxExpress#tripsSearch. */
  var kind: js.UndefOr[String] = js.native
  /** All possible solutions to the QPX Express search request. */
  var trips: js.UndefOr[TripOptionsResponse] = js.native
}

object TripsSearchResponse {
  @scala.inline
  def apply(): TripsSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripsSearchResponse]
  }
  @scala.inline
  implicit class TripsSearchResponseOps[Self <: TripsSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withTrips(value: TripOptionsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trips")(js.undefined)
        ret
    }
  }
  
}

