package typingsSlinky.rxjs.groupByMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/groupBy", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected () extends Observable[T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: Subject[T]) = this()
  def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
  
  var groupSubject: js.Any = js.native
  
  var key: K = js.native
  
  var refCountSubscription: js.Any = js.native
}
