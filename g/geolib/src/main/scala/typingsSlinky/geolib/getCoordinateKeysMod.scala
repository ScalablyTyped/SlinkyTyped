package typingsSlinky.geolib

import typingsSlinky.geolib.anon.Altitude
import typingsSlinky.geolib.anon.AltitudeLatitude
import typingsSlinky.geolib.anon.LatitudeLongitude
import typingsSlinky.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
@js.native
object getCoordinateKeysMod extends js.Object {
  def default(point: GeolibInputCoordinates): AltitudeLatitude | LatitudeLongitude = js.native
  def default(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude | LatitudeLongitude = js.native
}

