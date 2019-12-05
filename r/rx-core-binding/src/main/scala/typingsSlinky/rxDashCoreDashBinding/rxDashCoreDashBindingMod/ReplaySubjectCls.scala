package typingsSlinky.rxDashCoreDashBinding.rxDashCoreDashBindingMod

import typingsSlinky.rxDashCore.Rx.IScheduler
import typingsSlinky.rxDashCore.Rx.Observer
import typingsSlinky.rxDashCoreDashBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "ReplaySubject")
@js.native
class ReplaySubjectCls[T] () extends ISubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

