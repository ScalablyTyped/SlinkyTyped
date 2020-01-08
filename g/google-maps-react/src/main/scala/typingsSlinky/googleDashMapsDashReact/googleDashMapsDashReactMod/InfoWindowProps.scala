package typingsSlinky.googleDashMapsDashReact.googleDashMapsDashReactMod

import org.scalajs.dom.raw.Element
import typingsSlinky.googleDashMapsDashReact.Typeofgoogle
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof googlemaps.google.maps.InfoWindowOptions ]:? googlemaps.google.maps.InfoWindowOptions[P]} */ trait InfoWindowProps extends js.Object {
  var google: Typeofgoogle
  var map: typingsSlinky.googlemaps.google.maps.Map[Element]
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var marker: typingsSlinky.googlemaps.google.maps.Marker
  var visible: js.UndefOr[Boolean] = js.undefined
}

object InfoWindowProps {
  @scala.inline
  def apply(
    google: Typeofgoogle,
    map: typingsSlinky.googlemaps.google.maps.Map[Element],
    marker: typingsSlinky.googlemaps.google.maps.Marker,
    mapCenter: LatLng | LatLngLiteral = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): InfoWindowProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowProps]
  }
}

