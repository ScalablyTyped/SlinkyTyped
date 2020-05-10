package typingsSlinky.paypalRestSdk.mod.payment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteRequest extends js.Object {
  var payer_id: String = js.native
}

object ExecuteRequest {
  @scala.inline
  def apply(payer_id: String): ExecuteRequest = {
    val __obj = js.Dynamic.literal(payer_id = payer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteRequest]
  }
  @scala.inline
  implicit class ExecuteRequestOps[Self <: ExecuteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

