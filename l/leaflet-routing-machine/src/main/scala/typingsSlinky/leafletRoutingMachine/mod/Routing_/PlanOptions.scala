package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.Marker_
import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanOptions extends js.Object {
  var addButtonClassName: js.UndefOr[String] = js.native
   // IGeocoder
  var addWaypoints: js.UndefOr[Boolean] = js.native
  var createGeocoder: js.UndefOr[
    js.Function3[/* waypointIndex */ Double, /* numberWaypoints */ Double, /* plan */ Plan_, js.Object]
  ] = js.native
  var createMarker: js.UndefOr[
    js.Function3[
      /* waypointIndex */ Double, 
      /* waypoint */ Waypoint_, 
      /* numberWaypoints */ Double, 
      Marker_[_]
    ]
  ] = js.native
  var dragStyles: js.UndefOr[js.Array[PathOptions]] = js.native
  var draggableWaypoints: js.UndefOr[Boolean] = js.native
  var geocoder: js.UndefOr[js.Any] = js.native
  var geocoderClass: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberWaypoints */ Double, Unit]] = js.native
  var geocoderPlaceholder: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberWaypoints */ Double, String]] = js.native
  var geocodersClassName: js.UndefOr[String] = js.native
  var maxGeocoderTolerance: js.UndefOr[Double] = js.native
  var reverseWaypoints: js.UndefOr[Boolean] = js.native
  var routeWhileDragging: js.UndefOr[Boolean] = js.native
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.native
}

object PlanOptions {
  @scala.inline
  def apply(): PlanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanOptions]
  }
  @scala.inline
  implicit class PlanOptionsOps[Self <: PlanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withAddWaypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWaypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWaypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateGeocoder(value: (/* waypointIndex */ Double, /* numberWaypoints */ Double, /* plan */ Plan_) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGeocoder")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateGeocoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGeocoder")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateMarker(
      value: (/* waypointIndex */ Double, /* waypoint */ Waypoint_, /* numberWaypoints */ Double) => Marker_[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMarker")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStyles(value: js.Array[PathOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableWaypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableWaypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableWaypoints")(js.undefined)
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
    def withGeocoderClass(value: (/* waypointIndex */ Double, /* numberWaypoints */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoderClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGeocoderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoderClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGeocoderPlaceholder(value: (/* waypointIndex */ Double, /* numberWaypoints */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoderPlaceholder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGeocoderPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoderPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withGeocodersClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocodersClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeocodersClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocodersClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxGeocoderTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGeocoderTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxGeocoderTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGeocoderTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseWaypoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseWaypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseWaypoints")(js.undefined)
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
    def withWaypointNameFallback(value: /* latLng */ LatLng_ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointNameFallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWaypointNameFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointNameFallback")(js.undefined)
        ret
    }
  }
  
}

