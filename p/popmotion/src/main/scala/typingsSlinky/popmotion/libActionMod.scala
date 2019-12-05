package typingsSlinky.popmotion

import typingsSlinky.popmotion.libActionMod.Action
import typingsSlinky.popmotion.libActionTypesMod.ActionInit
import typingsSlinky.popmotion.libActionTypesMod.ActionProps
import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotion.libChainableMod.default
import typingsSlinky.popmotion.libObserverTypesMod.ObserverCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action", JSImport.Namespace)
@js.native
object libActionMod extends js.Object {
  @js.native
  class Action () extends default[Action] {
    def create(props: ActionProps): Action = js.native
    def start(): ColdSubscription = js.native
    def start(observerCandidate: ObserverCandidate): ColdSubscription = js.native
  }
  
  def default(init: ActionInit): Action = js.native
}

