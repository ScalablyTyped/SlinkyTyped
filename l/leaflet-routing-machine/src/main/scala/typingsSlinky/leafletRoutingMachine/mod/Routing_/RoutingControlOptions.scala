package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingControlOptions extends ItineraryOptions {
  var altLineOptions: js.UndefOr[LineOptions] = js.native
  var autoRoute: js.UndefOr[Boolean] = js.native
   // IGeocorder is from other library;
  var fitSelectedRoutes: js.UndefOr[smart | Boolean] = js.native
  var geocoder: js.UndefOr[js.Any] = js.native
  var lineOptions: js.UndefOr[LineOptions] = js.native
  var plan: js.UndefOr[Plan_] = js.native
  var routeDragInterval: js.UndefOr[Double] = js.native
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line_]] = js.native
  var routeWhileDragging: js.UndefOr[Boolean] = js.native
  var router: js.UndefOr[IRouter] = js.native
  var showAlternatives: js.UndefOr[Boolean] = js.native
  var useZoomParameter: js.UndefOr[Boolean] = js.native
  var waypointMode: js.UndefOr[String] = js.native
  var waypoints: js.UndefOr[js.Array[LatLng_ | Waypoint_]] = js.native
}

object RoutingControlOptions {
  @scala.inline
  def apply(): RoutingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingControlOptions]
  }
  @scala.inline
  implicit class RoutingControlOptionsOps[Self <: RoutingControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltLineOptions(value: LineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altLineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltLineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altLineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRoute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withFitSelectedRoutes(value: smart | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitSelectedRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitSelectedRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitSelectedRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withGeocoder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeocoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoder")(js.undefined)
        ret
    }
    @scala.inline
    def withLineOptions(value: LineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan(value: Plan_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteDragInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeDragInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteDragInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeDragInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteLine(value: (/* route */ IRoute, /* options */ LineOptions) => Line_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeLine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRouteLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeLine")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteWhileDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeWhileDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteWhileDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeWhileDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withRouter(value: IRouter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAlternatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withUseZoomParameter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useZoomParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseZoomParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useZoomParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypointMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaypointMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[LatLng_ | Waypoint_]): Self = {
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

