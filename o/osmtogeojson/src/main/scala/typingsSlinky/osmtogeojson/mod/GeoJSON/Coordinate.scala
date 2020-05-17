package typingsSlinky.osmtogeojson.mod.GeoJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.osmtogeojson.mod.GeoJSON.Coordinate2d
  - typingsSlinky.osmtogeojson.mod.GeoJSON.Coordinate3d
*/
trait Coordinate extends js.Object

object Coordinate {
  @scala.inline
  implicit def apply(value: Coordinate2d): Coordinate = value.asInstanceOf[Coordinate]
  @scala.inline
  implicit def apply(value: Coordinate3d): Coordinate = value.asInstanceOf[Coordinate]
}

