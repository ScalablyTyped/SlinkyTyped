package typingsSlinky.reactPose.transitionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactPose.transitionTypesMod.TransitionChild[T]
  - js.Array[typingsSlinky.reactPose.transitionTypesMod.TransitionChild[T]]
*/
trait TransitionChildren[T] extends js.Object

object TransitionChildren {
  @scala.inline
  implicit def apply[T](value: js.Array[TransitionChild[T]]): TransitionChildren[T] = value.asInstanceOf[TransitionChildren[T]]
  @scala.inline
  implicit def apply[T](value: TransitionChild[T]): TransitionChildren[T] = value.asInstanceOf[TransitionChildren[T]]
}

