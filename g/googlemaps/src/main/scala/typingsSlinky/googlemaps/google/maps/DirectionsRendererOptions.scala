package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsRendererOptions extends js.Object {
  var directions: js.UndefOr[DirectionsResult] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var hideRouteList: js.UndefOr[Boolean] = js.native
  var infoWindow: js.UndefOr[InfoWindow] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  var panel: js.UndefOr[Element] = js.native
  var polylineOptions: js.UndefOr[PolylineOptions] = js.native
  var preserveViewport: js.UndefOr[Boolean] = js.native
  var routeIndex: js.UndefOr[Double] = js.native
  var suppressBicyclingLayer: js.UndefOr[Boolean] = js.native
  var suppressInfoWindows: js.UndefOr[Boolean] = js.native
  var suppressMarkers: js.UndefOr[Boolean] = js.native
  var suppressPolylines: js.UndefOr[Boolean] = js.native
}

object DirectionsRendererOptions {
  @scala.inline
  def apply(): DirectionsRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRendererOptions]
  }
  @scala.inline
  implicit class DirectionsRendererOptionsOps[Self <: DirectionsRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirections(value: DirectionsResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withHideRouteList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRouteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideRouteList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideRouteList")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoWindow(value: InfoWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOptions(value: MarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineOptions(value: PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveViewport")(js.undefined)
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
    def withSuppressBicyclingLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressBicyclingLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressBicyclingLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressBicyclingLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressInfoWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressInfoWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressInfoWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressInfoWindows")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressPolylines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPolylines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressPolylines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPolylines")(js.undefined)
        ret
    }
  }
  
}

