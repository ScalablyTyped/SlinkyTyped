package typingsSlinky.readlineSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.RegExp
  - js.Function1[/ * input * / java.lang.String, scala.Boolean]
*/
trait OptionType extends js.Object

object OptionType {
  @scala.inline
  implicit def apply(value: Double): OptionType = value.asInstanceOf[OptionType]
  @scala.inline
  implicit def apply(value: js.Function1[/* input */ String, Boolean]): OptionType = value.asInstanceOf[OptionType]
  @scala.inline
  implicit def apply(value: js.RegExp): OptionType = value.asInstanceOf[OptionType]
  @scala.inline
  implicit def apply(value: String): OptionType = value.asInstanceOf[OptionType]
}

