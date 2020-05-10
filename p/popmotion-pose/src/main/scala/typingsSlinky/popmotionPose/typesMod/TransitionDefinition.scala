package typingsSlinky.popmotionPose.typesMod

import typingsSlinky.popmotion.keyframesTypesMod.Values
import typingsSlinky.popmotionPose.popmotionPoseStrings.decay
import typingsSlinky.popmotionPose.popmotionPoseStrings.keyframes
import typingsSlinky.popmotionPose.popmotionPoseStrings.physics
import typingsSlinky.popmotionPose.popmotionPoseStrings.spring
import typingsSlinky.popmotionPose.popmotionPoseStrings.tween
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
  def PhysicsDefinition(`type`: physics): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def SpringDefinition(`type`: spring): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def DecayDefinition(`type`: decay): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def TweenDefinition(`type`: tween): TransitionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
  @scala.inline
  def KeyframesDefinition(`type`: keyframes, values: Values): TransitionDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition]
  }
}

