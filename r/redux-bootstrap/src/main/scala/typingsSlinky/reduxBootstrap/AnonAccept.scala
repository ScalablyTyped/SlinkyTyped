package typingsSlinky.reduxBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccept extends js.Object {
  def accept(path: String, cb: js.Function0[Unit]): Unit = js.native
}

object AnonAccept {
  @scala.inline
  def apply(accept: (String, js.Function0[Unit]) => Unit): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction2(accept))
    __obj.asInstanceOf[AnonAccept]
  }
  @scala.inline
  implicit class AnonAcceptOps[Self <: AnonAccept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

