package typingsSlinky.popmotionPose

import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.mod.Action_
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.poseCore.typesMod.TransitionMap
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Namespace)
@js.native
object defaultTransitionsMod extends js.Object {
  val default: Map[String, TransitionMap[Action_[ColdSubscription], TransitionDefinition]] = js.native
  def just(from: js.Any): Action_[ColdSubscription] = js.native
}

