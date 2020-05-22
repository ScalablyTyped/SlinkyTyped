package typingsSlinky.popmotion.mod

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "pointer")
@js.native
object pointer extends js.Object {
  def apply(): Action[ColdSubscription] = js.native
  def apply(hasXYProps: PointerProps): Action[ColdSubscription] = js.native
}

