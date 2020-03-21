package typingsSlinky.rxjs

import typingsSlinky.rxjs.schedulerMod.Scheduler
import typingsSlinky.rxjs.subscriptionLogMod.SubscriptionLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/SubscriptionLoggable", JSImport.Namespace)
@js.native
object subscriptionLoggableMod extends js.Object {
  @js.native
  class SubscriptionLoggable () extends js.Object {
    var scheduler: Scheduler = js.native
    var subscriptions: js.Array[SubscriptionLog] = js.native
    def logSubscribedFrame(): Double = js.native
    def logUnsubscribedFrame(index: Double): Unit = js.native
  }
  
}

