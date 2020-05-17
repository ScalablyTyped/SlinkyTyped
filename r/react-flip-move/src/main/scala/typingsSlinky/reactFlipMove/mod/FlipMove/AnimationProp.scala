package typingsSlinky.reactFlipMove.mod.FlipMove

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactFlipMove.mod.FlipMove.AnimationPreset
  - typingsSlinky.reactFlipMove.mod.FlipMove.Animation
  - scala.Boolean
*/
trait AnimationProp extends js.Object

object AnimationProp {
  @scala.inline
  implicit def apply(value: Animation): AnimationProp = value.asInstanceOf[AnimationProp]
  @scala.inline
  implicit def apply(value: AnimationPreset): AnimationProp = value.asInstanceOf[AnimationProp]
  @scala.inline
  implicit def apply(value: Boolean): AnimationProp = value.asInstanceOf[AnimationProp]
}

