package typingsSlinky.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disposable extends js.Object {
  def dispose(): Unit = js.native
  def isDisposed(): Boolean = js.native
}

object Disposable {
  @scala.inline
  def apply(dispose: () => Unit, isDisposed: () => Boolean): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = js.Any.fromFunction0(isDisposed))
    __obj.asInstanceOf[Disposable]
  }
  @scala.inline
  implicit class DisposableOps[Self <: Disposable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDisposed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisposed")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

