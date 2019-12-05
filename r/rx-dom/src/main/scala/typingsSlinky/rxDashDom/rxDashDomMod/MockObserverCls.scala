package typingsSlinky.rxDashDom.rxDashDomMod

import typingsSlinky.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rx.rxMod.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

