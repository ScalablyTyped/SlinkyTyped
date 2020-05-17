package typingsSlinky.hapiHapi.mod.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any value greater than 10 is truncated.
  */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
*/
trait StringifySpace extends js.Object

object StringifySpace {
  @scala.inline
  implicit def apply(value: Double): StringifySpace = value.asInstanceOf[StringifySpace]
  @scala.inline
  implicit def apply(value: String): StringifySpace = value.asInstanceOf[StringifySpace]
}

