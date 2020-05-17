package typingsSlinky.popmotionPopcorn.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.popmotionPopcorn.typesMod.Point2D
  - typingsSlinky.popmotionPopcorn.typesMod.Point3D
*/
trait Point
  extends typingsSlinky.popmotionPopcorn.distanceMod.Point

object Point {
  @scala.inline
  implicit def apply(value: Point2D): Point = value.asInstanceOf[Point]
  @scala.inline
  implicit def apply(value: Point3D): Point = value.asInstanceOf[Point]
}

