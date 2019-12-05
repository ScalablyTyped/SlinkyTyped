package typingsSlinky.popmotionDashPose

import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotion.popmotionMod.Action
import typingsSlinky.popmotionDashPose.libTypesMod.PopmotionPoserFactoryConfig
import typingsSlinky.popmotionDashPose.libTypesMod.TransitionDefinition
import typingsSlinky.popmotionDashPose.libTypesMod.Value
import typingsSlinky.popmotionDashPose.poseDashCoreLibTypesMod.PoserConfig
import typingsSlinky.poseDashCore.libTypesMod.Poser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
@js.native
object libFactoriesPoseMod extends js.Object {
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[/* config */ PoserConfig[Value], Poser[Value, Action, ColdSubscription, P]] = js.native
}

