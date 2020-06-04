package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRendererOptions extends js.Object {
  var directions: js.UndefOr[DirectionsResult] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hideRouteList: js.UndefOr[Boolean] = js.undefined
  var infoWindow: js.UndefOr[InfoWindow] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  var panel: js.UndefOr[Element] = js.undefined
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  var routeIndex: js.UndefOr[Double] = js.undefined
  var suppressBicyclingLayer: js.UndefOr[Boolean] = js.undefined
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  var suppressMarkers: js.UndefOr[Boolean] = js.undefined
  var suppressPolylines: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirections(value: DirectionsResult): Self = this.set("directions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setHideRouteList(value: Boolean): Self = this.set("hideRouteList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideRouteList: Self = this.set("hideRouteList", js.undefined)
    @scala.inline
    def setInfoWindow(value: InfoWindow): Self = this.set("infoWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoWindow: Self = this.set("infoWindow", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMarkerOptions(value: MarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setPanel(value: Element): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setPolylineOptions(value: PolylineOptions): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    @scala.inline
    def setPreserveViewport(value: Boolean): Self = this.set("preserveViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveViewport: Self = this.set("preserveViewport", js.undefined)
    @scala.inline
    def setRouteIndex(value: Double): Self = this.set("routeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteIndex: Self = this.set("routeIndex", js.undefined)
    @scala.inline
    def setSuppressBicyclingLayer(value: Boolean): Self = this.set("suppressBicyclingLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressBicyclingLayer: Self = this.set("suppressBicyclingLayer", js.undefined)
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = this.set("suppressInfoWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressInfoWindows: Self = this.set("suppressInfoWindows", js.undefined)
    @scala.inline
    def setSuppressMarkers(value: Boolean): Self = this.set("suppressMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMarkers: Self = this.set("suppressMarkers", js.undefined)
    @scala.inline
    def setSuppressPolylines(value: Boolean): Self = this.set("suppressPolylines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressPolylines: Self = this.set("suppressPolylines", js.undefined)
  }
  
}

