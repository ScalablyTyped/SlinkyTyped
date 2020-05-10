package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodingResponse[STATUSES] extends js.Object {
  /**
    * When the geocoder returns a status code other than `OK`, there may be an additional `error_message` field
    * within the Geocoding response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  /**
    * contains an array of geocoded address information and geometry information.
    *
    * Generally, only one entry in the `"results"` array is returned for address lookups,though the geocoder may return several results
    * when address queries are ambiguous.
    */
  var results: js.Array[GeocodingResult] = js.native
  /** contains metadata on the request. */
  var status: STATUSES = js.native
}

object GeocodingResponse {
  @scala.inline
  def apply[STATUSES](error_message: String, results: js.Array[GeocodingResult], status: STATUSES): GeocodingResponse[STATUSES] = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodingResponse[STATUSES]]
  }
  @scala.inline
  implicit class GeocodingResponseOps[Self[statuses] <: GeocodingResponse[statuses], STATUSES] (val x: Self[STATUSES]) extends AnyVal {
    @scala.inline
    def duplicate: Self[STATUSES] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[STATUSES]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[STATUSES] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[STATUSES] with Other]
    @scala.inline
    def withError_message(value: String): Self[STATUSES] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[GeocodingResult]): Self[STATUSES] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: STATUSES): Self[STATUSES] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

