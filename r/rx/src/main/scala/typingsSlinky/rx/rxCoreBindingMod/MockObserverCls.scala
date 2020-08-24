package typingsSlinky.rx.rxCoreBindingMod

import typingsSlinky.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.core.binding", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rx.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

