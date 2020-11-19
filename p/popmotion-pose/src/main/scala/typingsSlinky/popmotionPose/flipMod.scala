package typingsSlinky.popmotionPose

import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.mod.Action_
import typingsSlinky.popmotionPose.libTypesMod.Pose
import typingsSlinky.popmotionPose.libTypesMod.PoserState
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.popmotionPose.typesMod.TransitionDefinition
import typingsSlinky.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion-pose/lib/dom/flip", JSImport.Namespace)
@js.native
object flipMod extends js.Object {
  
  def flipPose(
    props: PoserState[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action_[ColdSubscription], TransitionDefinition]
  ): Pose[Action_[ColdSubscription], TransitionDefinition] = js.native
  
  def isFlipPose(
    flip: Boolean,
    key: String,
    state: PoserState[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser]
  ): Boolean = js.native
  
  def setValue(
    hasValuesProps: PoserState[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser],
    key: String,
    to: js.Any
  ): Unit = js.native
  
  @js.native
  class Action[Sub /* <: ColdSubscription */] ()
    extends typingsSlinky.popmotion.actionMod.Action[Sub]
}
