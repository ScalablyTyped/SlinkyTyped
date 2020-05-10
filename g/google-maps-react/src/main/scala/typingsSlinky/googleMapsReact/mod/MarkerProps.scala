package typingsSlinky.googleMapsReact.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.Animation
import typingsSlinky.googlemaps.google.maps.Icon
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.MarkerLabel
import typingsSlinky.googlemaps.google.maps.MarkerShape
import typingsSlinky.googlemaps.google.maps.Point
import typingsSlinky.googlemaps.google.maps.StreetViewPanorama
import typingsSlinky.googlemaps.google.maps.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<googlemaps.google.maps.MarkerOptions> */
@js.native
trait MarkerProps extends js.Object {
  var anchorPoint: js.UndefOr[Point] = js.native
  var animation: js.UndefOr[Animation] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var crossOnDrag: js.UndefOr[Boolean] = js.native
  var cursor: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String | Icon | Symbol] = js.native
  var label: js.UndefOr[String | MarkerLabel] = js.native
  var map: js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element] | StreetViewPanorama] = js.native
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.native
  var onClick: js.UndefOr[markerEventHandler] = js.native
  var onDblclick: js.UndefOr[markerEventHandler] = js.native
  var onDragend: js.UndefOr[markerEventHandler] = js.native
  var onMousedown: js.UndefOr[markerEventHandler] = js.native
  var onMouseout: js.UndefOr[markerEventHandler] = js.native
  var onMouseover: js.UndefOr[markerEventHandler] = js.native
  var onMouseup: js.UndefOr[markerEventHandler] = js.native
  var onRecenter: js.UndefOr[markerEventHandler] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var optimized: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  var shape: js.UndefOr[MarkerShape] = js.native
  var title: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MarkerProps {
  @scala.inline
  def apply(): MarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOnDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOnDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
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
    def withIcon(value: String | Icon | Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String | MarkerLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: typingsSlinky.googlemaps.google.maps.Map[Element] | StreetViewPanorama): Self = {
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
    def withMapCenter(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblclick(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblclick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragend(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragend")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousedown(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseout(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseover(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseover")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseup(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRecenter(
      value: (/* props */ js.UndefOr[MarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRecenter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRecenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRecenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimized")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: MarkerShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

