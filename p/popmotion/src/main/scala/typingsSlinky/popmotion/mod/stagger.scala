package typingsSlinky.popmotion.mod

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.staggerMod.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "stagger")
@js.native
object stagger extends js.Object {
  def apply(actions: js.Array[Action[ColdSubscription]], interval: Interval): Action[ColdSubscription] = js.native
}

