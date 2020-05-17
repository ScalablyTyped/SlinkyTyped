package typingsSlinky.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enumerator[T] extends Disposable {
  def getCurrent(): T = js.native
  def moveNext(): Boolean = js.native
}

object Enumerator {
  @scala.inline
  def apply[T](dispose: () => Unit, getCurrent: () => T, moveNext: () => Boolean): Enumerator[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getCurrent = js.Any.fromFunction0(getCurrent), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Enumerator[T]]
  }
  @scala.inline
  implicit class EnumeratorOps[Self[t] <: Enumerator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetCurrent(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrent")(js.Any.fromFunction0(value))
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

