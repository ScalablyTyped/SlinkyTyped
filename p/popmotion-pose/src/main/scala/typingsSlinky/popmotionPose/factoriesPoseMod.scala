package typingsSlinky.popmotionPose

import typingsSlinky.popmotion.mod.Action_
import typingsSlinky.popmotion.typesMod.ColdSubscription
import typingsSlinky.popmotionPose.libTypesMod.PoserConfig
import typingsSlinky.popmotionPose.typesMod.PopmotionPoserFactoryConfig
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import typingsSlinky.poseCore.typesMod.Poser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
@js.native
object factoriesPoseMod extends js.Object {
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[/* config */ PoserConfig[Value], Poser[Value, Action_, ColdSubscription, P]] = js.native
}

