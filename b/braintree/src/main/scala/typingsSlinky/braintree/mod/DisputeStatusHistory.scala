package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisputeStatusHistory extends js.Object {
  var disbursementDate: js.Date = js.native
  var effectiveDate: js.Date = js.native
  var status: DisputeStatus = js.native
  var timestamp: js.Date = js.native
}

object DisputeStatusHistory {
  @scala.inline
  def apply(disbursementDate: js.Date, effectiveDate: js.Date, status: DisputeStatus, timestamp: js.Date): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], effectiveDate = effectiveDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeStatusHistory]
  }
  @scala.inline
  implicit class DisputeStatusHistoryOps[Self <: DisputeStatusHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisbursementDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectiveDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DisputeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

