package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromIterable", JSImport.Namespace)
@js.native
object internalObservableFromIterableMod extends js.Object {
  def fromIterable[T](input: js.Iterable[T]): Observable[T] = js.native
  def fromIterable[T](input: js.Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

