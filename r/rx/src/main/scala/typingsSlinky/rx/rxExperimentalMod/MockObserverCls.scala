package typingsSlinky.rx.rxExperimentalMod

import typingsSlinky.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.experimental", "MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rx.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
}

