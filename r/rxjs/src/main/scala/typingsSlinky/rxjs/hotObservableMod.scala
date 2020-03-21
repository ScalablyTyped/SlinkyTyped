package typingsSlinky.rxjs

import typingsSlinky.rxjs.schedulerMod.Scheduler
import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscriptionLogMod.SubscriptionLog
import typingsSlinky.rxjs.testMessageMod.TestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/HotObservable", JSImport.Namespace)
@js.native
object hotObservableMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.rxjs.subscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @js.native
  class HotObservable[T] protected () extends Subject[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
    var messages: js.Array[TestMessage] = js.native
    var scheduler: Scheduler = js.native
    var subscriptions: js.Array[SubscriptionLog] = js.native
    def logSubscribedFrame(): Double = js.native
    def logUnsubscribedFrame(index: Double): Unit = js.native
    def setup(): Unit = js.native
  }
  
}

