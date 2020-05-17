package typingsSlinky.geolib

import typingsSlinky.geolib.anon.Latitude
import typingsSlinky.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getBoundsOfDistance", JSImport.Namespace)
@js.native
object getBoundsOfDistanceMod extends js.Object {
  def default(point: GeolibInputCoordinates, distance: Double): js.Array[Latitude] = js.native
}

