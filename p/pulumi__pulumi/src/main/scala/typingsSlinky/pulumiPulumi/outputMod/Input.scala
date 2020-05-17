package typingsSlinky.pulumiPulumi.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Promise[T]
  - typingsSlinky.pulumiPulumi.outputMod.OutputInstance[T]
*/
trait Input[T] extends js.Object

object Input {
  @scala.inline
  implicit def apply[T](value: OutputInstance[T]): Input[T] = value.asInstanceOf[Input[T]]
  @scala.inline
  implicit def apply[T](value: js.Promise[T]): Input[T] = value.asInstanceOf[Input[T]]
  @scala.inline
  implicit def apply[T](value: T): Input[T] = value.asInstanceOf[Input[T]]
}

