package typingsSlinky.popmotion

import typingsSlinky.popmotion.chainableMod.default
import typingsSlinky.popmotion.observerTypesMod.ObserverCandidate
import typingsSlinky.popmotion.typesMod.ActionInit
import typingsSlinky.popmotion.typesMod.ActionProps
import typingsSlinky.popmotion.typesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  @js.native
  class Action () extends default[Action] {
    def create(props: ActionProps): Action = js.native
    def start(): ColdSubscription = js.native
    def start(observerCandidate: ObserverCandidate): ColdSubscription = js.native
  }
  
  def default(init: ActionInit): Action = js.native
}

