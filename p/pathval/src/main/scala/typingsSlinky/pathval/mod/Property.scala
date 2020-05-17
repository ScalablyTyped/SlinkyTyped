package typingsSlinky.pathval.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
  - scala.Double
*/
trait Property extends js.Object

object Property {
  @scala.inline
  implicit def apply(value: Double): Property = value.asInstanceOf[Property]
  @scala.inline
  implicit def apply(value: String): Property = value.asInstanceOf[Property]
  @scala.inline
  implicit def apply(value: js.Symbol): Property = value.asInstanceOf[Property]
}

