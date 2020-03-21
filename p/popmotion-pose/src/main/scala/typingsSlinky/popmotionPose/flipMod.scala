package typingsSlinky.popmotionPose

import typingsSlinky.popmotion.mod.Action_
import typingsSlinky.popmotion.typesMod.ColdSubscription
import typingsSlinky.popmotionPose.libTypesMod.Pose
import typingsSlinky.popmotionPose.libTypesMod.PoserState
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
@js.native
object flipMod extends js.Object {
  @js.native
  class Action ()
    extends typingsSlinky.popmotion.actionMod.Action
  
  def flipPose(
    props: PoserState[Value, Action_, ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action_, TransitionDefinition]
  ): Pose[Action_, TransitionDefinition] = js.native
  def isFlipPose(flip: Boolean, key: String, state: PoserState[Value, Action_, ColdSubscription, DomPopmotionPoser]): Boolean = js.native
  def setValue(
    hasValuesProps: PoserState[Value, Action_, ColdSubscription, DomPopmotionPoser],
    key: String,
    to: js.Any
  ): Unit = js.native
}

