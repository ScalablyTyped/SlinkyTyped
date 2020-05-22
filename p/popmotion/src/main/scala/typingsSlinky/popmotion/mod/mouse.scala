package typingsSlinky.popmotion.mod

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "mouse")
@js.native
object mouse extends js.Object {
  def apply(): Action[ColdSubscription] = js.native
  def apply(hasPreventDefault: PointerProps): Action[ColdSubscription] = js.native
}

