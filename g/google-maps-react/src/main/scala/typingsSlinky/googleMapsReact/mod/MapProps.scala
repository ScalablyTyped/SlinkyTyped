package typingsSlinky.googleMapsReact.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapProps extends MapOptions {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.native
  var google: GoogleAPI = js.native
  var initialCenter: js.UndefOr[LatLngLiteral] = js.native
  var loaded: js.UndefOr[Boolean] = js.native
  var onBoundsChanged: js.UndefOr[mapEventHandler] = js.native
  var onCenterChanged: js.UndefOr[mapEventHandler] = js.native
  var onClick: js.UndefOr[mapEventHandler] = js.native
  var onDblclick: js.UndefOr[mapEventHandler] = js.native
  var onDragend: js.UndefOr[mapEventHandler] = js.native
  var onDragstart: js.UndefOr[mapEventHandler] = js.native
  var onHeadingChange: js.UndefOr[mapEventHandler] = js.native
  var onIdle: js.UndefOr[mapEventHandler] = js.native
  var onMaptypeidChanged: js.UndefOr[mapEventHandler] = js.native
  var onMousemove: js.UndefOr[mapEventHandler] = js.native
  var onMouseout: js.UndefOr[mapEventHandler] = js.native
  var onMouseover: js.UndefOr[mapEventHandler] = js.native
  var onProjectionChanged: js.UndefOr[mapEventHandler] = js.native
  var onReady: js.UndefOr[mapEventHandler] = js.native
  var onRecenter: js.UndefOr[mapEventHandler] = js.native
  var onResize: js.UndefOr[mapEventHandler] = js.native
  var onRightclick: js.UndefOr[mapEventHandler] = js.native
  var onTilesloaded: js.UndefOr[mapEventHandler] = js.native
  var onTiltChanged: js.UndefOr[mapEventHandler] = js.native
  var onZoomChanged: js.UndefOr[mapEventHandler] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object MapProps {
  @scala.inline
  def apply(google: GoogleAPI): MapProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProps]
  }
  @scala.inline
  implicit class MapPropsOps[Self <: MapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogle(value: GoogleAPI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterAroundCurrentLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAroundCurrentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterAroundCurrentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAroundCurrentLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialCenter(value: LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBoundsChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBoundsChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnBoundsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBoundsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCenterChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCenterChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCenterChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCenterChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
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
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
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
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
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
    def withOnDragstart(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragstart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeadingChange(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeadingChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnHeadingChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeadingChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIdle(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIdle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMaptypeidChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMaptypeidChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMaptypeidChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMaptypeidChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousemove(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousemove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseout(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
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
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
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
    def withOnProjectionChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProjectionChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnProjectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProjectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRecenter(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
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
    def withOnResize(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRightclick(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightclick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRightclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRightclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTilesloaded(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTilesloaded")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTilesloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTilesloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTiltChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTiltChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTiltChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTiltChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnZoomChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomChanged")(js.undefined)
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
  }
  
}

