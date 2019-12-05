package typingsSlinky.popmotion

import typingsSlinky.popmotion.libActionTypesMod.ActionInit
import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotion.libObserverTypesMod.IObserver
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Init extends js.Object {
  @JSName("init")
  var init_Original: ActionInit = js.native
  def init(observer: IObserver): Partial[ColdSubscription] | Unit = js.native
}

