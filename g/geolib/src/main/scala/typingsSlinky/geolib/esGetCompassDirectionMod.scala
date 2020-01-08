package typingsSlinky.geolib

import typingsSlinky.geolib.esTypesMod.GeolibInputCoordinates
import typingsSlinky.geolib.geolibStrings.E
import typingsSlinky.geolib.geolibStrings.ENE
import typingsSlinky.geolib.geolibStrings.ESE
import typingsSlinky.geolib.geolibStrings.N
import typingsSlinky.geolib.geolibStrings.NE
import typingsSlinky.geolib.geolibStrings.NNE
import typingsSlinky.geolib.geolibStrings.NNW
import typingsSlinky.geolib.geolibStrings.NW
import typingsSlinky.geolib.geolibStrings.S
import typingsSlinky.geolib.geolibStrings.SE
import typingsSlinky.geolib.geolibStrings.SSE
import typingsSlinky.geolib.geolibStrings.SSW
import typingsSlinky.geolib.geolibStrings.SW
import typingsSlinky.geolib.geolibStrings.W
import typingsSlinky.geolib.geolibStrings.WNW
import typingsSlinky.geolib.geolibStrings.WSW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCompassDirection", JSImport.Namespace)
@js.native
object esGetCompassDirectionMod extends js.Object {
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  type BearingFunction = js.Function2[/* origin */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}

