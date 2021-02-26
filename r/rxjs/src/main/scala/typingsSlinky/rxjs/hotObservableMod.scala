package typingsSlinky.rxjs

import typingsSlinky.rxjs.schedulerMod.Scheduler
import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscriptionLogMod.SubscriptionLog
import typingsSlinky.rxjs.testMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotObservableMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.rxjs.subscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @JSImport("rxjs/internal/testing/HotObservable", "HotObservable")
  @js.native
  class HotObservable[T] protected () extends Subject[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
    
    def logSubscribedFrame(): Double = js.native
    
    def logUnsubscribedFrame(index: Double): Unit = js.native
    
    var messages: js.Array[TestMessage] = js.native
    
    var scheduler: Scheduler = js.native
    
    def setup(): Unit = js.native
    
    var subscriptions: js.Array[SubscriptionLog] = js.native
  }
}
