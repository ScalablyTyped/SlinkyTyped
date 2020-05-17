package typingsSlinky.mergerino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mergerino.mod.TopLevelPatch[S]
  - typingsSlinky.mergerino.mod.DeepArray[typingsSlinky.mergerino.mod.TopLevelPatch[S]]
*/
trait MultipleTopLevelPatch[S /* <: js.Object */] extends js.Object

object MultipleTopLevelPatch {
  @scala.inline
  implicit def apply[S](value: DeepArray[TopLevelPatch[S]]): MultipleTopLevelPatch[S] = value.asInstanceOf[MultipleTopLevelPatch[S]]
  @scala.inline
  implicit def apply[S](value: TopLevelPatch[S]): MultipleTopLevelPatch[S] = value.asInstanceOf[MultipleTopLevelPatch[S]]
}

