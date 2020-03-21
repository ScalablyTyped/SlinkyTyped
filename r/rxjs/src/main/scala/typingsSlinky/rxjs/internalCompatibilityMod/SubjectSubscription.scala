package typingsSlinky.rxjs.internalCompatibilityMod

import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubjectSubscription")
@js.native
class SubjectSubscription[T] protected ()
  extends typingsSlinky.rxjs.subjectSubscriptionMod.SubjectSubscription[T] {
  def this(subject: Subject[T], subscriber: Observer[T]) = this()
}

