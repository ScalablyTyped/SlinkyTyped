package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/fromIterable", JSImport.Namespace)
@js.native
object fromIterableMod extends js.Object {
  
  def fromIterable[T](input: js.Iterable[T]): Observable[T] = js.native
  def fromIterable[T](input: js.Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}
