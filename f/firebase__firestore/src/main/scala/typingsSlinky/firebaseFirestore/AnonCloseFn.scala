package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseFn[I] extends js.Object {
  def closeFn(): Unit = js.native
  def sendFn(msg: I): Unit = js.native
}

object AnonCloseFn {
  @scala.inline
  def apply[I](closeFn: () => Unit, sendFn: I => Unit): AnonCloseFn[I] = {
    val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction0(closeFn), sendFn = js.Any.fromFunction1(sendFn))
    __obj.asInstanceOf[AnonCloseFn[I]]
  }
  @scala.inline
  implicit class AnonCloseFnOps[Self[i] <: AnonCloseFn[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withCloseFn(value: () => Unit): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSendFn(value: I => Unit): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

