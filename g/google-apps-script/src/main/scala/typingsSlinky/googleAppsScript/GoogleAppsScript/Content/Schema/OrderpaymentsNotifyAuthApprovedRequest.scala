package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  var authAmountPretax: js.UndefOr[Price] = js.native
  var authAmountTax: js.UndefOr[Price] = js.native
}

object OrderpaymentsNotifyAuthApprovedRequest {
  @scala.inline
  def apply(): OrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyAuthApprovedRequest]
  }
  @scala.inline
  implicit class OrderpaymentsNotifyAuthApprovedRequestOps[Self <: OrderpaymentsNotifyAuthApprovedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthAmountPretax(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountPretax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthAmountPretax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountPretax")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthAmountTax(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthAmountTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountTax")(js.undefined)
        ret
    }
  }
  
}

