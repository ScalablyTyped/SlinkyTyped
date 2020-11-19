package typingsSlinky.rxjs

import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/SubjectSubscription", JSImport.Namespace)
@js.native
object subjectSubscriptionMod extends js.Object {
  
  @js.native
  class SubjectSubscription[T] protected () extends Subscription {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
    
    var subject: Subject[T] = js.native
    
    var subscriber: Observer[T] = js.native
  }
}
