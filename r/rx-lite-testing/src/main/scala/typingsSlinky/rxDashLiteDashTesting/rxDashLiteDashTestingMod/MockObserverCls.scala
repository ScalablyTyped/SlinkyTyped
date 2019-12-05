package typingsSlinky.rxDashLiteDashTesting.rxDashLiteDashTestingMod

import typingsSlinky.rxDashCore.Rx.IScheduler
import typingsSlinky.rxDashCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite-testing", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rxDashLiteDashTesting.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[typingsSlinky.rxDashLiteDashTesting.Rx.Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}

