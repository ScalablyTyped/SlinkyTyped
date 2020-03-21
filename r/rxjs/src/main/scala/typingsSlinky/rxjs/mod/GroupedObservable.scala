package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.groupByMod.RefCountSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typingsSlinky.rxjs.groupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: typingsSlinky.rxjs.subjectMod.Subject[T]) = this()
  def this(
    key: K,
    groupSubject: typingsSlinky.rxjs.subjectMod.Subject[T],
    refCountSubscription: RefCountSubscription
  ) = this()
}

