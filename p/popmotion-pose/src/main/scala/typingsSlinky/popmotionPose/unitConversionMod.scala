package typingsSlinky.popmotionPose

import typingsSlinky.popmotion.typesMod.ColdSubscription
import typingsSlinky.popmotionPose.flipMod.Action
import typingsSlinky.popmotionPose.libTypesMod.Pose
import typingsSlinky.popmotionPose.libTypesMod.PoserState
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
@js.native
object unitConversionMod extends js.Object {
  def convertPositionalUnits(
    state: PoserState[Value, Action, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action, TransitionDefinition]
  ): Pose[Action, TransitionDefinition] = js.native
  def isPositional(pose: Pose[Action, TransitionDefinition]): Boolean = js.native
}

