package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionTypesMod.ActionInit
import typingsSlinky.popmotion.actionTypesMod.ActionProps
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.chainableMod.default
import typingsSlinky.popmotion.observerTypesMod.ObserverCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  
  def default[Sub /* <: ColdSubscription */](init: ActionInit): Action[Sub] = js.native
  
  @js.native
  class Action[Sub /* <: ColdSubscription */] () extends default[Action[ColdSubscription]] {
    
    def create(props: ActionProps): Action[ColdSubscription] = js.native
    
    def start(): Sub = js.native
    def start(observerCandidate: ObserverCandidate): Sub = js.native
  }
}
