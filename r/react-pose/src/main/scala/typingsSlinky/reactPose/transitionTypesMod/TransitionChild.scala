package typingsSlinky.reactPose.transitionTypesMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactElement
  - typingsSlinky.reactPose.reactPoseBooleans.`false`
  - scala.Unit
*/
trait TransitionChild[T] extends TransitionChildren[T]

object TransitionChild {
  @scala.inline
  def `false`[T]: typingsSlinky.reactPose.reactPoseBooleans.`false` = false.asInstanceOf[typingsSlinky.reactPose.reactPoseBooleans.`false`]
  @scala.inline
  implicit def apply[T](value: ReactElement): TransitionChild[T] = value.asInstanceOf[TransitionChild[T]]
  @scala.inline
  implicit def apply[T](value: Unit): TransitionChild[T] = value.asInstanceOf[TransitionChild[T]]
}

