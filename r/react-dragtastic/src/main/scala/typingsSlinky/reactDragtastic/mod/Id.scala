package typingsSlinky.reactDragtastic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait Id extends js.Object

object Id {
  @scala.inline
  implicit def apply(value: Double): Id = value.asInstanceOf[Id]
  @scala.inline
  implicit def apply(value: String): Id = value.asInstanceOf[Id]
}

