package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.SchedulerAction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/range", JSImport.Namespace)
@js.native
object internalObservableRangeMod extends js.Object {
  def dispatch(`this`: SchedulerAction[_], state: js.Any): Unit = js.native
  def range(): Observable[Double] = js.native
  def range(start: Double): Observable[Double] = js.native
  def range(start: Double, count: Double): Observable[Double] = js.native
  def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

