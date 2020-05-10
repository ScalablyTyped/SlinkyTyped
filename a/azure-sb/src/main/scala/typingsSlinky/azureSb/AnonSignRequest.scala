package typingsSlinky.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSignRequest extends js.Object {
  def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit = js.native
}

object AnonSignRequest {
  @scala.inline
  def apply(signRequest: (js.Any, js.Function0[Unit]) => Unit): AnonSignRequest = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
    __obj.asInstanceOf[AnonSignRequest]
  }
  @scala.inline
  implicit class AnonSignRequestOps[Self <: AnonSignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignRequest(value: (js.Any, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signRequest")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

