package typingsSlinky.leafletGeocoderMapzen.mod

import typingsSlinky.leafletGeocoderMapzen.mod.Control_.Geocoder
import typingsSlinky.leafletGeocoderMapzen.mod.Control_.GeocoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  
  /**
    * Creates a geocoder control.
    */
  def geocoder(api_key: String): Geocoder = js.native
  def geocoder(api_key: String, options: GeocoderOptions): Geocoder = js.native
}
