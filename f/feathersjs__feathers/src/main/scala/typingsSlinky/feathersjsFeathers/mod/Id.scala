package typingsSlinky.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
*/
trait Id extends NullableId

object Id {
  @scala.inline
  implicit def apply(value: Double): Id = value.asInstanceOf[Id]
  @scala.inline
  implicit def apply(value: String): Id = value.asInstanceOf[Id]
}

