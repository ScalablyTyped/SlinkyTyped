package typingsSlinky.rxLite.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeDisposable extends IDisposable {
  var isDisposed: Boolean = js.native
  var length: Double = js.native
  def add(item: IDisposable): Unit = js.native
  def remove(item: IDisposable): Boolean = js.native
  def toArray(): js.Array[IDisposable] = js.native
}

object CompositeDisposable {
  @scala.inline
  def apply(
    add: IDisposable => Unit,
    dispose: () => Unit,
    isDisposed: Boolean,
    length: Double,
    remove: IDisposable => Boolean,
    toArray: () => js.Array[IDisposable]
  ): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[CompositeDisposable]
  }
  @scala.inline
  implicit class CompositeDisposableOps[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: IDisposable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDisposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: IDisposable => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[IDisposable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

