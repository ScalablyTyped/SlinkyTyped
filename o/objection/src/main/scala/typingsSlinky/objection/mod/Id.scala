package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait Id extends IdOrIds

object Id {
  @scala.inline
  implicit def apply(value: Double): Id = value.asInstanceOf[Id]
  @scala.inline
  implicit def apply(value: String): Id = value.asInstanceOf[Id]
}

