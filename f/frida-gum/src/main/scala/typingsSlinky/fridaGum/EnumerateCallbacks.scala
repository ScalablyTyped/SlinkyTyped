package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumerateCallbacks[T] extends js.Object {
  def onComplete(): Unit = js.native
  def onMatch(item: T): Unit | EnumerateAction = js.native
}

object EnumerateCallbacks {
  @scala.inline
  def apply[T](onComplete: () => Unit, onMatch: T => Unit | EnumerateAction): EnumerateCallbacks[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateCallbacks[T]]
  }
  @scala.inline
  implicit class EnumerateCallbacksOps[Self[t] <: EnumerateCallbacks[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMatch(value: T => Unit | EnumerateAction): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

