package typingsSlinky.googleMaps

import typingsSlinky.googleMaps.mod.LatLngLiteralVerbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocation extends js.Object {
  /** Contains a `latitude` and `longitude` value. */
  var location: LatLngLiteralVerbose = js.native
  /**
    * An integer that indicates the corresponding value in the original request.
    * Each point in the request maps to at most two segmentsin the response:
    *  - If there are no nearby roads, no segment is returned.
    *  - If the nearest road is one-way, one segment is returned.
    *  - If the nearest road is bidirectional, two segments are returned.
    */
  var originalIndex: Double = js.native
  /**
    * A unique identifier for a place. All place IDs returned by the Roads API correspond to road segments.
    * Place IDs can be used with other Google APIs, including the Places SDK and the Maps JavaScript API.
    * For example, if you need to get road names for the snapped points returned by the Roads API,
    * you can pass the `placeId` to the Places SDK or the Geocoding API. Within the Roads API,
    * you can pass the `placeId` in a speed limits request to determine the speed limit along that road segment.
    */
  var placeId: String = js.native
}

object AnonLocation {
  @scala.inline
  def apply(location: LatLngLiteralVerbose, originalIndex: Double, placeId: String): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
  @scala.inline
  implicit class AnonLocationOps[Self <: AnonLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: LatLngLiteralVerbose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

