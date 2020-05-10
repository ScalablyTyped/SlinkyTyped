package typingsSlinky.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoOp extends js.Object {
  def end(): Unit = js.native
  def params(types: String*): NoOp = js.native
}

object NoOp {
  @scala.inline
  def apply(end: () => Unit, params: /* repeated */ String => NoOp): NoOp = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), params = js.Any.fromFunction1(params))
    __obj.asInstanceOf[NoOp]
  }
  @scala.inline
  implicit class NoOpOps[Self <: NoOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParams(value: /* repeated */ String => NoOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

