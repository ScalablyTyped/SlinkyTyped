package typingsSlinky.googleGax.apitypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GRPCCallResult extends js.Object {
  def cancel(): Unit = js.native
}

object GRPCCallResult {
  @scala.inline
  def apply(cancel: () => Unit): GRPCCallResult = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[GRPCCallResult]
  }
  @scala.inline
  implicit class GRPCCallResultOps[Self <: GRPCCallResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

