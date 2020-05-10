package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A directions query to be sent to the DirectionsService. */
@js.native
trait DirectionsRequest extends js.Object {
  /**
    * If true, instructs the Directions service to avoid ferries where
    * possible. Optional.
    */
  var avoidFerries: js.UndefOr[Boolean] = js.native
  /**
    * If true, instructs the Directions service to avoid highways where
    * possible. Optional.
    */
  var avoidHighways: js.UndefOr[Boolean] = js.native
  /**
    * If true, instructs the Directions service to avoid toll roads where
    * possible. Optional.
    */
  var avoidTolls: js.UndefOr[Boolean] = js.native
  /**
    * Location of destination. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var destination: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.native
  /**
    * Settings that apply only to requests where travelMode is DRIVING. This
    * object will have no effect for other travel modes.
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.native
  /** Deprecated. Use drivingOptions field instead */
  var durationInTraffic: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the DirectionService will attempt to re-order the
    * supplied intermediate waypoints to minimize overall cost of the route. If
    * waypoints are optimized, inspect DirectionsRoute.waypoint_order in the
    * response to determine the new ordering.
    */
  var optimizeWaypoints: js.UndefOr[Boolean] = js.native
  /**
    * Location of origin. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var origin: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.native
  /** Whether or not route alternatives should be provided. Optional. */
  var provideRouteAlternatives: js.UndefOr[Boolean] = js.native
  /** Region code used as a bias for geocoding requests. Optional. */
  var region: js.UndefOr[String] = js.native
  /**
    * Settings that apply only to requests where travelMode is TRANSIT. This
    * object will have no effect for other travel modes.
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.native
  /** Type of routing requested. Required. */
  var travelMode: js.UndefOr[TravelMode] = js.native
  /**
    * Preferred unit system to use when displaying distance. Defaults to the
    * unit system used in the country of origin.
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.native
  /**
    * Array of intermediate waypoints. Directions will be calculated from the
    * origin to the destination by way of each waypoint in this array. The
    * maximum allowed waypoints is 8, plus the origin, and destination. Premium
    * Plan customers are allowed 23 waypoints, plus the origin, and
    * destination. Waypoints are not supported for transit directions.
    * Optional.
    */
  var waypoints: js.UndefOr[js.Array[DirectionsWaypoint]] = js.native
}

object DirectionsRequest {
  @scala.inline
  def apply(): DirectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRequest]
  }
  @scala.inline
  implicit class DirectionsRequestOps[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidFerries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFerries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidFerries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFerries")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidHighways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidHighways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidHighways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidHighways")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidTolls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidTolls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidTolls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidTolls")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String | LatLng | LatLngLiteral | Place): Self = {
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
    def withDrivingOptions(value: DrivingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrivingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationInTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeWaypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeWaypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeWaypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String | LatLng | LatLngLiteral | Place): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideRouteAlternatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideRouteAlternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvideRouteAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideRouteAlternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitOptions(value: TransitOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelMode(value: TravelMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitSystem(value: UnitSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[DirectionsWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(js.undefined)
        ret
    }
  }
  
}

