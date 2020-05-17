package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String]
  - typingsSlinky.rollup.mod.IsExternal
*/
trait ExternalOption extends js.Object

object ExternalOption {
  @scala.inline
  implicit def apply(value: js.Array[String]): ExternalOption = value.asInstanceOf[ExternalOption]
  @scala.inline
  implicit def apply(value: IsExternal): ExternalOption = value.asInstanceOf[ExternalOption]
}

