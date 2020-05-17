package typingsSlinky.facepaint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.facepaint.mod.BaseArg
  - js.Array[typingsSlinky.facepaint.mod.BaseArg]
*/
trait Arg extends js.Object

object Arg {
  @scala.inline
  implicit def apply(value: js.Array[BaseArg]): Arg = value.asInstanceOf[Arg]
  @scala.inline
  implicit def apply(value: BaseArg): Arg = value.asInstanceOf[Arg]
}

