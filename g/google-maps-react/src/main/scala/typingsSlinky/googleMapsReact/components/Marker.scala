package typingsSlinky.googleMapsReact.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googleMapsReact.mod.IMarkerProps
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

object Marker {
  @JSImport("google-maps-react", "Marker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.googleMapsReact.mod.Marker] {
    @scala.inline
    def anchorPoint(value: Point): this.type = set("anchorPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def animation(value: Animation): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def crossOnDrag(value: Boolean): this.type = set("crossOnDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def cursor(value: String): this.type = set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: String | Icon | Symbol): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String | MarkerLabel): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def map(value: typingsSlinky.googlemaps.google.maps.Map[Element] | StreetViewPanorama): this.type = set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def mapCenter(value: LatLng | LatLngLiteral): this.type = set("mapCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(
      value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
    ): this.type = set("onClick", js.Any.fromFunction3(value))
    @scala.inline
    def onMouseover(
      value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typingsSlinky.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
    ): this.type = set("onMouseover", js.Any.fromFunction3(value))
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def optimized(value: Boolean): this.type = set("optimized", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: LatLng | LatLngLiteral): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def shape(value: MarkerShape): this.type = set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Marker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

