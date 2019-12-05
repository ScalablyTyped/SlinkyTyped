package typingsSlinky.popmotionDashPose

import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typingsSlinky.popmotionDashPose.libTypesMod.TransitionDefinition
import typingsSlinky.popmotionDashPose.libTypesMod.Value
import typingsSlinky.popmotionDashPose.poseDashCoreLibTypesMod.Pose
import typingsSlinky.popmotionDashPose.poseDashCoreLibTypesMod.PoserState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
@js.native
object libDomFlipMod extends js.Object {
  @js.native
  class Action ()
    extends typingsSlinky.popmotion.libActionMod.Action
  
  def flipPose(
    props: PoserState[
      Value, 
      typingsSlinky.popmotion.popmotionMod.Action, 
      ColdSubscription, 
      DomPopmotionPoser
    ],
    nextPose: Pose[typingsSlinky.popmotion.popmotionMod.Action, TransitionDefinition]
  ): Pose[typingsSlinky.popmotion.popmotionMod.Action, TransitionDefinition] = js.native
  def isFlipPose(
    flip: Boolean,
    key: String,
    state: PoserState[
      Value, 
      typingsSlinky.popmotion.popmotionMod.Action, 
      ColdSubscription, 
      DomPopmotionPoser
    ]
  ): Boolean = js.native
  def setValue(
    hasValuesProps: PoserState[
      Value, 
      typingsSlinky.popmotion.popmotionMod.Action, 
      ColdSubscription, 
      DomPopmotionPoser
    ],
    key: String,
    to: js.Any
  ): Unit = js.native
}

