package typingsSlinky.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interceptor extends js.Object {
  def abort(): Unit = js.native
  def passthrough(): Unit = js.native
}

object Interceptor {
  @scala.inline
  def apply(abort: () => Unit, passthrough: () => Unit): Interceptor = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), passthrough = js.Any.fromFunction0(passthrough))
    __obj.asInstanceOf[Interceptor]
  }
  @scala.inline
  implicit class InterceptorOps[Self <: Interceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPassthrough(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

