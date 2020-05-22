package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.decayTypesMod.DecayProps
import typingsSlinky.popmotion.vectorMod.ActionFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/decay", JSImport.Namespace)
@js.native
object decayMod extends js.Object {
  val default: ActionFactory = js.native
  def decaySole(): Action[ColdSubscription] = js.native
  def decaySole(props: DecayProps): Action[ColdSubscription] = js.native
}

