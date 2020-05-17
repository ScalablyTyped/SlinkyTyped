package typingsSlinky.reactDragtastic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait Type extends js.Object

object Type {
  @scala.inline
  implicit def apply(value: Double): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: String): Type = value.asInstanceOf[Type]
}

