package typingsSlinky.popmotionDashPose

import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotionDashPose.libDomFlipMod.Action
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typingsSlinky.popmotionDashPose.libTypesMod.TransitionDefinition
import typingsSlinky.popmotionDashPose.libTypesMod.Value
import typingsSlinky.popmotionDashPose.poseDashCoreLibTypesMod.Pose
import typingsSlinky.popmotionDashPose.poseDashCoreLibTypesMod.PoserState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
@js.native
object libDomUnitDashConversionMod extends js.Object {
  def convertPositionalUnits(
    state: PoserState[Value, Action, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action, TransitionDefinition]
  ): Pose[Action, TransitionDefinition] = js.native
  def isPositional(pose: Pose[Action, TransitionDefinition]): Boolean = js.native
}

