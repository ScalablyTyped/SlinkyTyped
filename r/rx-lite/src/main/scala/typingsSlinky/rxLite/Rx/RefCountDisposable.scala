package typingsSlinky.rxLite.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefCountDisposable extends IDisposable {
  var isDisposed: Boolean = js.native
  def getDisposable(): IDisposable = js.native
}

object RefCountDisposable {
  @scala.inline
  def apply(dispose: () => Unit, getDisposable: () => IDisposable, isDisposed: Boolean): RefCountDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCountDisposable]
  }
  @scala.inline
  implicit class RefCountDisposableOps[Self <: RefCountDisposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDisposable(value: () => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisposable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDisposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisposed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

