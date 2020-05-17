package typingsSlinky.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ava.mod.CbMacro[Args, Context]
  - typingsSlinky.ava.mod.UntitledCbMacro[Args, Context]
*/
trait EitherCbMacro[Args /* <: js.Array[_] */, Context] extends OneOrMoreCbMacros[Args, Context]

object EitherCbMacro {
  @scala.inline
  implicit def apply[Args, Context](value: (CbMacro[Args, Context]) | (UntitledCbMacro[Args, Context])): EitherCbMacro[Args, Context] = value.asInstanceOf[EitherCbMacro[Args, Context]]
}

