package typingsSlinky.reactDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTransitionTypesMod {
  import slinky.core.facade.ReactElement
  import typingsSlinky.reactDashPose.reactDashPoseBooleans.`false`

  type TransitionChild[T] = ReactElement | `false` | Unit
  type TransitionChildren[T] = TransitionChild[T] | js.Array[TransitionChild[T]]
}
