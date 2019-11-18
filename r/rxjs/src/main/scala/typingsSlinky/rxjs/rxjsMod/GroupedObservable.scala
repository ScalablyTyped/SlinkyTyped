package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalOperatorsGroupByMod.RefCountSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typingsSlinky.rxjs.internalOperatorsGroupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: typingsSlinky.rxjs.internalSubjectMod.Subject[T]) = this()
  def this(
    key: K,
    groupSubject: typingsSlinky.rxjs.internalSubjectMod.Subject[T],
    refCountSubscription: RefCountSubscription
  ) = this()
}

