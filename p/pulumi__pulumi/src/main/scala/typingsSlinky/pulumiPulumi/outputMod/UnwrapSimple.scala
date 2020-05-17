package typingsSlinky.pulumiPulumi.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiPulumi.outputMod.UnwrappedObject[T]
  - typingsSlinky.pulumiPulumi.outputMod.UnwrappedArray[js.Any]
  - T
*/
trait UnwrapSimple[T] extends js.Object

object UnwrapSimple {
  @scala.inline
  implicit def apply[T](value: T): UnwrapSimple[T] = value.asInstanceOf[UnwrapSimple[T]]
  @scala.inline
  implicit def apply[T](value: UnwrappedArray[js.Any]): UnwrapSimple[T] = value.asInstanceOf[UnwrapSimple[T]]
  @scala.inline
  implicit def apply[T](value: UnwrappedObject[T]): UnwrapSimple[T] = value.asInstanceOf[UnwrapSimple[T]]
}

