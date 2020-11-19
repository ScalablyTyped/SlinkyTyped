package typingsSlinky.popmotion

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/compositors/composite", JSImport.Namespace)
@js.native
object compositeMod extends js.Object {
  
  def default(actions: ActionMap): Action[ColdSubscription] = js.native
  
  type ActionMap = StringDictionary[Action[ColdSubscription]]
}
