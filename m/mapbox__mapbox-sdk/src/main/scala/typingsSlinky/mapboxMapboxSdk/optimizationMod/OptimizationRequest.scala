package typingsSlinky.mapboxMapboxSdk.optimizationMod

import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.`false`
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.any
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.first
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.full
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.last
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.simplified
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapboxProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimizationRequest extends js.Object {
  /**
    * Return additional metadata along the route. You can include several annotations as a comma-separated list. Possible values are:
    */
  var annotations: js.UndefOr[duration | speed | distance] = js.native
  /**
    * Specify the destination coordinate of the returned route. Accepts  any (default) or  last .
    */
  var destination: js.UndefOr[any | last] = js.native
  /**
    * Specify pick-up and drop-off locations for a trip by providing a ; delimited list of number pairs that correspond with the coordinates list.
    * The first number of a pair indicates the index to the coordinate of the pick-up location in the coordinates list,
    * and the second number indicates the index to the coordinate of the drop-off location in the coordinates list.
    * Each pair must contain exactly 2 numbers, which cannot be the same.
    * The returned solution will visit pick-up locations before visiting drop-off locations. The first location can only be a pick-up location, not a drop-off location.
    */
  var distributions: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The format of the returned geometry. Allowed values are:  geojson (as LineString ),  polyline (default, a polyline with precision 5),  polyline6 (a polyline with precision 6).
    */
  var geometries: js.UndefOr[geojson | polyline | polyline6] = js.native
  /**
    * The language of returned turn-by-turn text instructions. See supported languages . The default is  en (English).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The type of the returned overview geometry.
    * Can be 'full' (the most detailed geometry available), 'simplified' (default, a simplified version of the full geometry), or 'false' (no overview geometry).
    */
  var overview: js.UndefOr[full | simplified | `false`] = js.native
  /**
    * A Mapbox Directions routing profile ID.
    */
  var profile: MapboxProfile = js.native
  /**
    * Indicates whether the returned route is roundtrip, meaning the route returns to the first location ( true , default) or not ( false ).
    * If roundtrip=false , the  source and  destination parameters are required but not all combinations will be possible.
    * See the Fixing Start and End Points section below for additional notes.
    */
  var roundtrip: js.UndefOr[Boolean] = js.native
  /**
    * The coordinate at which to start the returned route. Accepts  any (default) or  first .
    */
  var source: js.UndefOr[any | first] = js.native
  /**
    * Whether to return steps and turn-by-turn instructions ( true ) or not ( false , default).
    */
  var steps: js.UndefOr[Boolean] = js.native
  /**
    * A semicolon-separated list of {longitude},{latitude} coordinates. There must be between 2 and 12 coordinates. The first coordinate is the start and end point of the trip.
    */
  var waypoints: js.Array[OptimizationWaypoint] = js.native
}

object OptimizationRequest {
  @scala.inline
  def apply(profile: MapboxProfile, waypoints: js.Array[OptimizationWaypoint]): OptimizationRequest = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationRequest]
  }
  @scala.inline
  implicit class OptimizationRequestOps[Self <: OptimizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfile(value: MapboxProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[OptimizationWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: duration | speed | distance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: any | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometries(value: geojson | polyline | polyline6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: full | simplified | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundtrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundtrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtrip")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: any | first): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

