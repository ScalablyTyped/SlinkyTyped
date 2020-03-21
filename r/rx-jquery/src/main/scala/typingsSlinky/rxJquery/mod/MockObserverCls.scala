package typingsSlinky.rxJquery.mod

import typingsSlinky.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "MockObserverCls")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rxLiteTesting.Rx.MockObserverCls[T] {
  def this(scheduler: IScheduler) = this()
}

