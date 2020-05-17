package typingsSlinky.rxjs

import typingsSlinky.rxjs.anon.Index
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/pairs", JSImport.Namespace)
@js.native
object pairsMod extends js.Object {
  def dispatch[T](state: Index[T]): Unit = js.native
  def pairs[T](obj: js.Object): Observable[js.Tuple2[String, T]] = js.native
  def pairs[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = js.native
}

