package typingsSlinky.googleMapsReact.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googleMapsReact.mod.GoogleAPI
import typingsSlinky.googleMapsReact.mod.MapProps
import typingsSlinky.googlemaps.google.maps.FullscreenControlOptions
import typingsSlinky.googlemaps.google.maps.GestureHandlingOptions
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.MapRestriction
import typingsSlinky.googlemaps.google.maps.MapTypeControlOptions
import typingsSlinky.googlemaps.google.maps.MapTypeId
import typingsSlinky.googlemaps.google.maps.MapTypeStyle
import typingsSlinky.googlemaps.google.maps.PanControlOptions
import typingsSlinky.googlemaps.google.maps.RotateControlOptions
import typingsSlinky.googlemaps.google.maps.ScaleControlOptions
import typingsSlinky.googlemaps.google.maps.StreetViewControlOptions
import typingsSlinky.googlemaps.google.maps.StreetViewPanorama
import typingsSlinky.googlemaps.google.maps.ZoomControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Map {
  @JSImport("google-maps-react", "Map")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.googleMapsReact.mod.Map] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def bounds(value: LatLngBounds | LatLngBoundsLiteral): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def center(value: LatLng | LatLngLiteral): this.type = set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def centerAroundCurrentLocation(value: Boolean): this.type = set("centerAroundCurrentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def clickableIcons(value: Boolean): this.type = set("clickableIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def controlSize(value: Double): this.type = set("controlSize", value.asInstanceOf[js.Any])
    @scala.inline
    def disableDefaultUI(value: Boolean): this.type = set("disableDefaultUI", value.asInstanceOf[js.Any])
    @scala.inline
    def disableDoubleClickZoom(value: Boolean): this.type = set("disableDoubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def draggableCursor(value: String): this.type = set("draggableCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def draggingCursor(value: String): this.type = set("draggingCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def fullscreenControl(value: Boolean): this.type = set("fullscreenControl", value.asInstanceOf[js.Any])
    @scala.inline
    def fullscreenControlOptions(value: FullscreenControlOptions): this.type = set("fullscreenControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def gestureHandling(value: GestureHandlingOptions): this.type = set("gestureHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def heading(value: Double): this.type = set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def initialCenter(value: LatLngLiteral): this.type = set("initialCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardShortcuts(value: Boolean): this.type = set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def loaded(value: Boolean): this.type = set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def mapTypeControl(value: Boolean): this.type = set("mapTypeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def mapTypeControlOptions(value: MapTypeControlOptions): this.type = set("mapTypeControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def mapTypeId(value: MapTypeId | String): this.type = set("mapTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def noClear(value: Boolean): this.type = set("noClear", value.asInstanceOf[js.Any])
    @scala.inline
    def onBoundsChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onBoundsChanged", js.Any.fromFunction3(value))
    @scala.inline
    def onCenterChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onCenterChanged", js.Any.fromFunction3(value))
    @scala.inline
    def onClick(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onClick", js.Any.fromFunction3(value))
    @scala.inline
    def onDblclick(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onDblclick", js.Any.fromFunction3(value))
    @scala.inline
    def onDragend(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onDragend", js.Any.fromFunction3(value))
    @scala.inline
    def onDragstart(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onDragstart", js.Any.fromFunction3(value))
    @scala.inline
    def onHeadingChange(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onHeadingChange", js.Any.fromFunction3(value))
    @scala.inline
    def onIdle(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onIdle", js.Any.fromFunction3(value))
    @scala.inline
    def onMaptypeidChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onMaptypeidChanged", js.Any.fromFunction3(value))
    @scala.inline
    def onMousemove(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onMousemove", js.Any.fromFunction3(value))
    @scala.inline
    def onMouseout(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onMouseout", js.Any.fromFunction3(value))
    @scala.inline
    def onMouseover(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onMouseover", js.Any.fromFunction3(value))
    @scala.inline
    def onProjectionChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onProjectionChanged", js.Any.fromFunction3(value))
    @scala.inline
    def onReady(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onReady", js.Any.fromFunction3(value))
    @scala.inline
    def onRecenter(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onRecenter", js.Any.fromFunction3(value))
    @scala.inline
    def onResize(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onResize", js.Any.fromFunction3(value))
    @scala.inline
    def onRightclick(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onRightclick", js.Any.fromFunction3(value))
    @scala.inline
    def onTilesloaded(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onTilesloaded", js.Any.fromFunction3(value))
    @scala.inline
    def onTiltChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onTiltChanged", js.Any.fromFunction3(value))
    @scala.inline
    def onZoomChanged(
      value: (/* mapProps */ js.UndefOr[MapProps], /* map */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Map[Element]], /* event */ js.UndefOr[js.Any]) => js.Any
    ): this.type = set("onZoomChanged", js.Any.fromFunction3(value))
    @scala.inline
    def panControl(value: Boolean): this.type = set("panControl", value.asInstanceOf[js.Any])
    @scala.inline
    def panControlOptions(value: PanControlOptions): this.type = set("panControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def restriction(value: MapRestriction): this.type = set("restriction", value.asInstanceOf[js.Any])
    @scala.inline
    def rotateControl(value: Boolean): this.type = set("rotateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def rotateControlOptions(value: RotateControlOptions): this.type = set("rotateControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleControl(value: Boolean): this.type = set("scaleControl", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleControlOptions(value: ScaleControlOptions): this.type = set("scaleControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollwheel(value: Boolean): this.type = set("scrollwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def streetView(value: StreetViewPanorama): this.type = set("streetView", value.asInstanceOf[js.Any])
    @scala.inline
    def streetViewControl(value: Boolean): this.type = set("streetViewControl", value.asInstanceOf[js.Any])
    @scala.inline
    def streetViewControlOptions(value: StreetViewControlOptions): this.type = set("streetViewControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: js.Array[MapTypeStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def tilt(value: Double): this.type = set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomControl(value: Boolean): this.type = set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomControlOptions(value: ZoomControlOptions): this.type = set("zoomControlOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(google: GoogleAPI): Builder = {
    val __props = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MapProps]))
  }
}

