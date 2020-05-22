package typingsSlinky.rxLiteTesting.global.Rx

import typingsSlinky.rxCore.Rx.IScheduler
import typingsSlinky.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.MockObserver")
@js.native
class MockObserverCls[T] protected ()
  extends typingsSlinky.rxLiteTesting.Rx.MockObserver[T] {
  def this(scheduler: IScheduler) = this()
  /* CompleteClass */
  override var messages: js.Array[typingsSlinky.rxLiteTesting.Rx.Recorded] = js.native
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
}

