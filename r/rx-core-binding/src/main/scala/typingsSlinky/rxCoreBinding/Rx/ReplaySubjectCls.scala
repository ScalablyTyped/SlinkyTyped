package typingsSlinky.rxCoreBinding.Rx

import typingsSlinky.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.ReplaySubject")
@js.native
class ReplaySubjectCls[T] () extends ISubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}

