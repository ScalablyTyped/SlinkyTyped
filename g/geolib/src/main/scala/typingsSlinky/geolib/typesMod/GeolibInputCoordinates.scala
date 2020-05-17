package typingsSlinky.geolib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geolib.typesMod.UserInputCoordinates
  - typingsSlinky.geolib.typesMod.GeolibGeoJSONPoint
*/
trait GeolibInputCoordinates extends js.Object

object GeolibInputCoordinates {
  @scala.inline
  implicit def apply(value: GeolibGeoJSONPoint): GeolibInputCoordinates = value.asInstanceOf[GeolibInputCoordinates]
  @scala.inline
  implicit def apply(value: UserInputCoordinates): GeolibInputCoordinates = value.asInstanceOf[GeolibInputCoordinates]
}

