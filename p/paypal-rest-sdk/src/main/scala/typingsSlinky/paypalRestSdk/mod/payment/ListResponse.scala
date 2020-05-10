package typingsSlinky.paypalRestSdk.mod.payment

import typingsSlinky.paypalRestSdk.mod.Payment_
import typingsSlinky.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResponse extends Response {
  @JSName("count")
  var count_ListResponse: Double = js.native
  var next_id: String = js.native
  var payments: js.Array[Payment_] = js.native
}

object ListResponse {
  @scala.inline
  def apply(count: Double, httpStatusCode: Double, next_id: String, payments: js.Array[Payment_]): ListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], next_id = next_id.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
  @scala.inline
  implicit class ListResponseOps[Self <: ListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayments(value: js.Array[Payment_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

