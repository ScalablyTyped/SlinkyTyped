package typingsSlinky.rxCoreBinding.global.Rx

import typingsSlinky.rxCore.Rx.IScheduler
import typingsSlinky.rxCoreBinding.Rx.ISubject
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

