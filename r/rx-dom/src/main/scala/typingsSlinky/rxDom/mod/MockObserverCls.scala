package typingsSlinky.rxDom.mod

import typingsSlinky.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rx.mod.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

