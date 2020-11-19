package typingsSlinky.geolib

import typingsSlinky.geolib.anon.Altitude
import typingsSlinky.geolib.anon.AltitudeLatitude
import typingsSlinky.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
@js.native
object getCoordinateKeysMod extends js.Object {
  
  def default(point: GeolibInputCoordinates): AltitudeLatitude = js.native
  def default(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = js.native
}
