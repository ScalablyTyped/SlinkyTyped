package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  def BadArgumentException(): Unit = js.native
  def Exception(msg: String): Unit = js.native
  def InvalidStateException(): Unit = js.native
}

object Errors {
  @scala.inline
  def apply(BadArgumentException: () => Unit, Exception: String => Unit, InvalidStateException: () => Unit): Errors = {
    val __obj = js.Dynamic.literal(BadArgumentException = js.Any.fromFunction0(BadArgumentException), Exception = js.Any.fromFunction1(Exception), InvalidStateException = js.Any.fromFunction0(InvalidStateException))
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadArgumentException(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BadArgumentException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withException(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exception")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvalidStateException(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidStateException")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

