package typingsSlinky.paypalRestSdk.mod.payment

import typingsSlinky.paypalRestSdk.mod.Amount
import typingsSlinky.paypalRestSdk.mod.CaptureResource
import typingsSlinky.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureResponse
  extends CaptureResource
     with Response {
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.native
}

object CaptureResponse {
  @scala.inline
  def apply(amount: Amount, httpStatusCode: Double, id: String): CaptureResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureResponse]
  }
  @scala.inline
  implicit class CaptureResponseOps[Self <: CaptureResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(js.undefined)
        ret
    }
  }
  
}

