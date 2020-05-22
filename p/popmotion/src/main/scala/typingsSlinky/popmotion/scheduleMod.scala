package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/schedule", JSImport.Namespace)
@js.native
object scheduleMod extends js.Object {
  def default(scheduler: Action[ColdSubscription], schedulee: Action[ColdSubscription]): Action[ColdSubscription] = js.native
}

