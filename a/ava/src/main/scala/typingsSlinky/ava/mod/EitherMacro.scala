package typingsSlinky.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ava.mod.Macro[Args, Context]
  - typingsSlinky.ava.mod.UntitledMacro[Args, Context]
*/
trait EitherMacro[Args /* <: js.Array[_] */, Context] extends OneOrMoreMacros[Args, Context]

object EitherMacro {
  @scala.inline
  implicit def apply[Args, Context](value: (Macro[Args, Context]) | (UntitledMacro[Args, Context])): EitherMacro[Args, Context] = value.asInstanceOf[EitherMacro[Args, Context]]
}

