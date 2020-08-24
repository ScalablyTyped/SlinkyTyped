package typingsSlinky.rx.rxCoreTestingMod

import typingsSlinky.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.core.testing", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rx.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

