package typingsSlinky.rxjs

import typingsSlinky.rxjs.schedulerMod.Scheduler
import typingsSlinky.rxjs.subscriptionLogMod.SubscriptionLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/testing/SubscriptionLoggable", JSImport.Namespace)
@js.native
object subscriptionLoggableMod extends js.Object {
  
  @js.native
  class SubscriptionLoggable () extends js.Object {
    
    def logSubscribedFrame(): Double = js.native
    
    def logUnsubscribedFrame(index: Double): Unit = js.native
    
    var scheduler: Scheduler = js.native
    
    var subscriptions: js.Array[SubscriptionLog] = js.native
  }
}
