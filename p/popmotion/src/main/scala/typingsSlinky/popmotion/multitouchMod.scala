package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/input/multitouch", JSImport.Namespace)
@js.native
object multitouchMod extends js.Object {
  
  def default(): Action[ColdSubscription] = js.native
  def default(hasPreventDefaultScaleRotate: PointerProps): Action[ColdSubscription] = js.native
  
  def getIsTouchDevice(): Boolean = js.native
}
