package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalSubjectMod.Subject
import typingsSlinky.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubjectSubscription")
@js.native
class SubjectSubscription[T] protected ()
  extends typingsSlinky.rxjs.internalSubjectSubscriptionMod.SubjectSubscription[T] {
  def this(subject: Subject[T], subscriber: Observer[T]) = this()
}

