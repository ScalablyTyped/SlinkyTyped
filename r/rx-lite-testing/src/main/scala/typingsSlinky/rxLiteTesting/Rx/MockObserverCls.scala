package typingsSlinky.rxLiteTesting.Rx

import typingsSlinky.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected () extends MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

