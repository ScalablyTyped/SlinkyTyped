package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/input/pointer/mouse", JSImport.Namespace)
@js.native
object mouseMod extends js.Object {
  def default(): Action[ColdSubscription] = js.native
  def default(hasPreventDefault: PointerProps): Action[ColdSubscription] = js.native
}

