package typingsSlinky.popmotion.actionTypesMod

import typingsSlinky.popmotion.anon.PartialColdSubscription
import typingsSlinky.popmotion.observerTypesMod.Complete
import typingsSlinky.popmotion.observerTypesMod.Error
import typingsSlinky.popmotion.observerTypesMod.IObserver
import typingsSlinky.popmotion.observerTypesMod.Middleware
import typingsSlinky.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion.popmotion/lib/observer/types.ObserverProps & {  init  :popmotion.popmotion/lib/action/types.ActionInit} */
@js.native
trait ActionProps extends js.Object {
  var complete: js.UndefOr[Complete] = js.native
  var error: js.UndefOr[Error] = js.native
  @JSName("init")
  var init_Original: ActionInit = js.native
  var middleware: js.UndefOr[js.Array[Middleware]] = js.native
  var onComplete: js.UndefOr[js.Function] = js.native
  var registerParent: js.UndefOr[js.Function] = js.native
  var update: js.UndefOr[Update] = js.native
  def init(observer: IObserver): PartialColdSubscription | Unit = js.native
}

