package typingsSlinky.rxLiteTesting.Rx

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rxCore.Rx.Observable
import typingsSlinky.rxLiteVirtualtime.Rx.VirtualTimeScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestScheduler extends VirtualTimeScheduler[Double, Double] {
  def createColdObservable[T](records: Recorded*): Observable[T] = js.native
  def createHotObservable[T](records: Recorded*): Observable[T] = js.native
  def createObserver[T](): MockObserver[T] = js.native
  def startWithCreate[T](create: js.Function0[Observable[T]]): MockObserver[T] = js.native
  def startWithDispose[T](create: js.Function0[Observable[T]], disposedAt: Double): MockObserver[T] = js.native
  def startWithTiming[T](create: js.Function0[Observable[T]], createdAt: Double, subscribedAt: Double, disposedAt: Double): MockObserver[T] = js.native
}

@JSGlobal("Rx.TestScheduler")
@js.native
object TestScheduler extends Instantiable0[TestScheduler]

