package typingsSlinky.saywhen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHandler[T /* <: Func */] extends js.Object {
  val isCalled: Proxy[T] = js.native
  def isCalledWith(args: js.Any*): Proxy[T] = js.native
}

object CallHandler {
  @scala.inline
  def apply[T](isCalled: Proxy[T], isCalledWith: /* repeated */ js.Any => Proxy[T]): CallHandler[T] = {
    val __obj = js.Dynamic.literal(isCalled = isCalled.asInstanceOf[js.Any], isCalledWith = js.Any.fromFunction1(isCalledWith))
    __obj.asInstanceOf[CallHandler[T]]
  }
  @scala.inline
  implicit class CallHandlerOps[Self[t] <: CallHandler[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsCalled(value: Proxy[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCalledWith(value: /* repeated */ js.Any => Proxy[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalledWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

