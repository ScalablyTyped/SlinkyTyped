package typingsSlinky.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.async.mod.AsyncAutoTaskFunctionWithoutDependencies[R1, E]
  - js.Array[
(/ * keyof R * / java.lang.String) | (typingsSlinky.async.mod.AsyncAutoTaskFunction[R1, R, E])]
*/
trait AsyncAutoTask[R1, R /* <: Dictionary[_] */, E] extends js.Object

object AsyncAutoTask {
  @scala.inline
  implicit def apply[R1, R, E](value: js.Array[(/* keyof R */ String) | (AsyncAutoTaskFunction[R1, R, E])]): AsyncAutoTask[R1, R, E] = value.asInstanceOf[AsyncAutoTask[R1, R, E]]
  @scala.inline
  implicit def apply[R1, R, E](value: AsyncAutoTaskFunctionWithoutDependencies[R1, E]): AsyncAutoTask[R1, R, E] = value.asInstanceOf[AsyncAutoTask[R1, R, E]]
}

