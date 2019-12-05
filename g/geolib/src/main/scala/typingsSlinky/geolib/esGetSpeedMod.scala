package typingsSlinky.geolib

import typingsSlinky.geolib.esTypesMod.GeolibDistanceFn
import typingsSlinky.geolib.esTypesMod.GeolibInputCoordinatesWithTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getSpeed", JSImport.Namespace)
@js.native
object esGetSpeedMod extends js.Object {
  def default(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = js.native
  def default(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = js.native
}

