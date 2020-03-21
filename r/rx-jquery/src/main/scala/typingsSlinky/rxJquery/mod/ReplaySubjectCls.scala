package typingsSlinky.rxJquery.mod

import typingsSlinky.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "ReplaySubjectCls")
@js.native
class ReplaySubjectCls[T] ()
  extends typingsSlinky.rxCoreBinding.Rx.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}

