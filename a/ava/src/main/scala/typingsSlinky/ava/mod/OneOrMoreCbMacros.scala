package typingsSlinky.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ava.mod.EitherCbMacro[Args, Context]
  - Array[typingsSlinky.ava.mod.EitherCbMacro[Args, Context]]
*/
trait OneOrMoreCbMacros[Args /* <: js.Array[_] */, Context] extends js.Object

object OneOrMoreCbMacros {
  @scala.inline
  implicit def apply[Args, Context](value: Array[EitherCbMacro[Args, Context]]): OneOrMoreCbMacros[Args, Context] = value.asInstanceOf[OneOrMoreCbMacros[Args, Context]]
  @scala.inline
  implicit def apply[Args, Context](value: EitherCbMacro[Args, Context]): OneOrMoreCbMacros[Args, Context] = value.asInstanceOf[OneOrMoreCbMacros[Args, Context]]
}

