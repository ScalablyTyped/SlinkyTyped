package typingsSlinky.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
*/
trait Position extends Coordinates

object Position {
  @scala.inline
  implicit def apply(value: Double): Position = value.asInstanceOf[Position]
  @scala.inline
  implicit def apply(value: String): Position = value.asInstanceOf[Position]
}

