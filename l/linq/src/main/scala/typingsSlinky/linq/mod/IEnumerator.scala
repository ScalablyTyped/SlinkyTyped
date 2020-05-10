package typingsSlinky.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnumerator[T] extends js.Object {
  def current(): T = js.native
  def dispose(): Unit = js.native
  def moveNext(): Boolean = js.native
}

object IEnumerator {
  @scala.inline
  def apply[T](current: () => T, dispose: () => Unit, moveNext: () => Boolean): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), dispose = js.Any.fromFunction0(dispose), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[IEnumerator[T]]
  }
  @scala.inline
  implicit class IEnumeratorOps[Self[t] <: IEnumerator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

