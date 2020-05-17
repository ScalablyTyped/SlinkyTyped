package typingsSlinky.popmotionPose.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.popmotionPose.typesMod.TweenDefinition
  - typingsSlinky.popmotionPose.typesMod.PhysicsDefinition
  - typingsSlinky.popmotionPose.typesMod.SpringDefinition
  - typingsSlinky.popmotionPose.typesMod.DecayDefinition
  - typingsSlinky.popmotionPose.typesMod.KeyframesDefinition
*/
trait TransitionDefinition extends js.Object

object TransitionDefinition {
  @scala.inline
  implicit def apply(value: DecayDefinition): TransitionDefinition = value.asInstanceOf[TransitionDefinition]
  @scala.inline
  implicit def apply(value: KeyframesDefinition): TransitionDefinition = value.asInstanceOf[TransitionDefinition]
  @scala.inline
  implicit def apply(value: PhysicsDefinition): TransitionDefinition = value.asInstanceOf[TransitionDefinition]
  @scala.inline
  implicit def apply(value: SpringDefinition): TransitionDefinition = value.asInstanceOf[TransitionDefinition]
  @scala.inline
  implicit def apply(value: TweenDefinition): TransitionDefinition = value.asInstanceOf[TransitionDefinition]
}

