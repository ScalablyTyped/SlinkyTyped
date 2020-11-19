package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.springTypesMod.SpringProps
import typingsSlinky.popmotion.vectorMod.ActionFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/spring", JSImport.Namespace)
@js.native
object springMod extends js.Object {
  
  val default: ActionFactory = js.native
  
  def springSole(): Action[ColdSubscription] = js.native
  def springSole(props: SpringProps): Action[ColdSubscription] = js.native
}
