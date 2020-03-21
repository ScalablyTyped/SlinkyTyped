package typingsSlinky.rxDom.mod

import typingsSlinky.rxCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "ReplaySubjectCls")
@js.native
class ReplaySubjectCls[T] ()
  extends typingsSlinky.rx.mod.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}

