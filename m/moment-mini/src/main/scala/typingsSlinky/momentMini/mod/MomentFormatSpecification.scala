package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.momentMini.mod.MomentBuiltinFormat
  - js.Array[java.lang.String | typingsSlinky.momentMini.mod.MomentBuiltinFormat]
*/
trait MomentFormatSpecification extends js.Object

object MomentFormatSpecification {
  @scala.inline
  implicit def apply(value: js.Array[String | MomentBuiltinFormat]): MomentFormatSpecification = value.asInstanceOf[MomentFormatSpecification]
  @scala.inline
  implicit def apply(value: MomentBuiltinFormat): MomentFormatSpecification = value.asInstanceOf[MomentFormatSpecification]
  @scala.inline
  implicit def apply(value: String): MomentFormatSpecification = value.asInstanceOf[MomentFormatSpecification]
}

