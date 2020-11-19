package typingsSlinky.popmotion.mod

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ActionInit
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion", "action")
@js.native
object action extends js.Object {
  
  def apply[Sub /* <: ColdSubscription */](init: ActionInit): Action[Sub] = js.native
}
