package typingsSlinky.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ava.mod.EitherMacro[Args, Context]
  - Array[typingsSlinky.ava.mod.EitherMacro[Args, Context]]
*/
trait OneOrMoreMacros[Args /* <: js.Array[_] */, Context] extends js.Object

object OneOrMoreMacros {
  @scala.inline
  implicit def apply[Args, Context](value: Array[EitherMacro[Args, Context]]): OneOrMoreMacros[Args, Context] = value.asInstanceOf[OneOrMoreMacros[Args, Context]]
  @scala.inline
  implicit def apply[Args, Context](value: EitherMacro[Args, Context]): OneOrMoreMacros[Args, Context] = value.asInstanceOf[OneOrMoreMacros[Args, Context]]
}

