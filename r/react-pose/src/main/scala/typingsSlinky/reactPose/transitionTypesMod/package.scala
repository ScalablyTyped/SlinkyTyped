package typingsSlinky.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionTypesMod {
  type TransitionChild[T] = slinky.core.facade.ReactElement | typingsSlinky.reactPose.reactPoseBooleans.`false` | scala.Unit
  type TransitionChildren[T] = typingsSlinky.reactPose.transitionTypesMod.TransitionChild[T] | js.Array[typingsSlinky.reactPose.transitionTypesMod.TransitionChild[T]]
}
