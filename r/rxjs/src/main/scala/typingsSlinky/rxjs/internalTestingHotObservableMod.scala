package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalSchedulerMod.Scheduler
import typingsSlinky.rxjs.internalSubjectMod.Subject
import typingsSlinky.rxjs.internalTestingSubscriptionLogMod.SubscriptionLog
import typingsSlinky.rxjs.internalTestingTestMessageMod.TestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/HotObservable", JSImport.Namespace)
@js.native
object internalTestingHotObservableMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.rxjs.internalTestingSubscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @js.native
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

