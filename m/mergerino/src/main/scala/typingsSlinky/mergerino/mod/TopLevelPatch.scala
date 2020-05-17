package typingsSlinky.mergerino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mergerino.mod.FunctionPatch[S]
  - typingsSlinky.mergerino.mod.ObjectPatch[S]
  - typingsSlinky.mergerino.mod.ArrayPatch[S]
  - typingsSlinky.mergerino.mod.Falsy
*/
trait TopLevelPatch[S /* <: js.Object */] extends MultipleTopLevelPatch[S]

object TopLevelPatch {
  @scala.inline
  implicit def apply[S](value: ArrayPatch[S] | ObjectPatch[S]): TopLevelPatch[S] = value.asInstanceOf[TopLevelPatch[S]]
  @scala.inline
  implicit def apply[S](value: Falsy): TopLevelPatch[S] = value.asInstanceOf[TopLevelPatch[S]]
  @scala.inline
  implicit def apply[S](value: FunctionPatch[S]): TopLevelPatch[S] = value.asInstanceOf[TopLevelPatch[S]]
}

