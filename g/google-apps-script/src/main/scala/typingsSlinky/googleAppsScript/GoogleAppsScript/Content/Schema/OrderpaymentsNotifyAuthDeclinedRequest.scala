package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderpaymentsNotifyAuthDeclinedRequest extends js.Object {
  var declineReason: js.UndefOr[String] = js.native
}

object OrderpaymentsNotifyAuthDeclinedRequest {
  @scala.inline
  def apply(): OrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyAuthDeclinedRequest]
  }
  @scala.inline
  implicit class OrderpaymentsNotifyAuthDeclinedRequestOps[Self <: OrderpaymentsNotifyAuthDeclinedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclineReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declineReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclineReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declineReason")(js.undefined)
        ret
    }
  }
  
}

