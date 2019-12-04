package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalSubjectMod.Subject
import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import typingsSlinky.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/SubjectSubscription", JSImport.Namespace)
@js.native
object internalSubjectSubscriptionMod extends js.Object {
  @js.native
  class SubjectSubscription[T] protected () extends Subscription {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
    var subject: Subject[T] = js.native
    var subscriber: Observer[T] = js.native
  }
  
}

