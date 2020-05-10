package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsRequestOptions extends js.Object {
  /** The unit to use when displaying direction distances. */
  var distanceUnit: js.UndefOr[DistanceUnit] = js.native
  /** The number of routes to calculate. */
  var maxRoutes: js.UndefOr[Double] = js.native
  /** The features to avoid when calculating the route. */
  var routeAvoidance: js.UndefOr[js.Array[RouteAvoidance]] = js.native
  /** A boolean indicating whether the route line on the map can be dragged with the mouse cursor.  */
  var routeDraggable: js.UndefOr[Boolean] = js.native
  /** If multiple routes are returned, the index of the route and directions to display. */
  var routeIndex: js.UndefOr[Double] = js.native
  /** The type of directions to calculate. */
  var routeMode: js.UndefOr[RouteMode] = js.native
  /** The optimization setting for the route calculation. */
  var routeOptimization: js.UndefOr[RouteOptimization] = js.native
  /** The time to use when calculating the route. If this property is set to null, the current time is used */
  var time: js.UndefOr[js.Date] = js.native
  /** The type of the time specified. The default value is departure. */
  var timeType: js.UndefOr[TimeType] = js.native
  /** Specifies the vehicle attributes to use when calculating a truck route. */
  var vehicleSpec: js.UndefOr[IVehicleSpec] = js.native
}

object IDirectionsRequestOptions {
  @scala.inline
  def apply(): IDirectionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectionsRequestOptions]
  }
  @scala.inline
  implicit class IDirectionsRequestOptionsOps[Self <: IDirectionsRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceUnit(value: DistanceUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRoutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteAvoidance(value: js.Array[RouteAvoidance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeAvoidance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteAvoidance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeAvoidance")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteMode(value: RouteMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteOptimization(value: RouteOptimization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeOptimization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteOptimization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeOptimization")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeType(value: TimeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeType")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleSpec(value: IVehicleSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleSpec")(js.undefined)
        ret
    }
  }
  
}

