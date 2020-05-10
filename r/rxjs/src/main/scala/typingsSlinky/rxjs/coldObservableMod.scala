package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.schedulerMod.Scheduler
import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.subscriptionLogMod.SubscriptionLog
import typingsSlinky.rxjs.testMessageMod.TestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/ColdObservable", JSImport.Namespace)
@js.native
object coldObservableMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rxjs.subscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @js.native
  class ColdObservable[T] protected () extends Observable[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
    var messages: js.Array[TestMessage] = js.native
    var scheduler: Scheduler = js.native
    var subscriptions: js.Array[SubscriptionLog] = js.native
    def logSubscribedFrame(): Double = js.native
    def logUnsubscribedFrame(index: Double): Unit = js.native
    def scheduleMessages(subscriber: Subscriber[_]): Unit = js.native
  }
  
}

