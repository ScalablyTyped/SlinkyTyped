package typingsSlinky.rx.rxMod

import typingsSlinky.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rxDashLiteDashTesting.Rx.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

