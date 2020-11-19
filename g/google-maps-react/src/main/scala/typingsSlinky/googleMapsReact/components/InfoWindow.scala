package typingsSlinky.googleMapsReact.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googleMapsReact.anon.Typeofgoogle
import typingsSlinky.googleMapsReact.mod.IInfoWindowProps
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InfoWindow {
  
  @JSImport("google-maps-react", "InfoWindow")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.googleMapsReact.mod.InfoWindow] {
    
    @scala.inline
    def contentNode(value: Node): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: String | Node): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableAutoPan(value: Boolean): this.type = set("disableAutoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mapCenter(value: LatLng | LatLngLiteral): this.type = set("mapCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pixelOffset(value: Size): this.type = set("pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: LatLng | LatLngLiteral): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IInfoWindowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    google: Typeofgoogle,
    map: typingsSlinky.googlemaps.google.maps.Map[Element],
    marker: typingsSlinky.googlemaps.google.maps.Marker
  ): Builder = {
    val __props = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IInfoWindowProps]))
  }
}
