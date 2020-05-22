package typingsSlinky.googleMapsReact.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.googleMapsReact.anon.Typeofgoogle
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<googlemaps.google.maps.InfoWindowOptions> */
trait IInfoWindowProps extends js.Object {
  var content: js.UndefOr[String | Node] = js.undefined
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  var google: Typeofgoogle
  var map: typingsSlinky.googlemaps.google.maps.Map[Element]
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var marker: typingsSlinky.googlemaps.google.maps.Marker
  var maxWidth: js.UndefOr[Double] = js.undefined
  var pixelOffset: js.UndefOr[Size] = js.undefined
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IInfoWindowProps {
  @scala.inline
  def apply(
    google: Typeofgoogle,
    map: typingsSlinky.googlemaps.google.maps.Map[Element],
    marker: typingsSlinky.googlemaps.google.maps.Marker,
    content: String | Node = null,
    disableAutoPan: js.UndefOr[Boolean] = js.undefined,
    mapCenter: LatLng | LatLngLiteral = null,
    maxWidth: js.UndefOr[Double] = js.undefined,
    pixelOffset: Size = null,
    position: LatLng | LatLngLiteral = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IInfoWindowProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPan)) __obj.updateDynamic("disableAutoPan")(disableAutoPan.get.asInstanceOf[js.Any])
    if (mapCenter != null) __obj.updateDynamic("mapCenter")(mapCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoWindowProps]
  }
}

