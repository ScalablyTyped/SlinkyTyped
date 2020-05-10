package typingsSlinky.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
@js.native
trait Observer[T] extends js.Object {
  def checked(): Observer[_] = js.native
}

object Observer {
  @scala.inline
  def apply[T](checked: () => Observer[_]): Observer[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked))
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self[t] <: Observer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChecked(value: () => Observer[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

