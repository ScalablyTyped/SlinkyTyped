package typingsSlinky.iitc.iitctypesMod.IITC

import typingsSlinky.iitc.leafletMod.GeodesicPolyline_
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Link-Marker */
@JSImport("iitc/core/iitctypes", "IITC.Link")
@js.native
class Link protected () extends GeodesicPolyline_ {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  
  @JSName("options")
  var options_Link: LinkOptions = js.native
}
