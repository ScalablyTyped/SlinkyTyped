package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalOperatorsGroupByMod.RefCountSubscription
import typingsSlinky.rxjs.internalSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typingsSlinky.rxjs.internalOperatorsGroupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: Subject[T]) = this()
  def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
}

