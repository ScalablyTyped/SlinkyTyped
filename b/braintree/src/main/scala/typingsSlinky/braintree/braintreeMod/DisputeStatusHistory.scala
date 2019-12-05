package typingsSlinky.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeStatusHistory extends js.Object {
  var disbursementDate: js.Date
  var effectiveDate: js.Date
  var status: DisputeStatus
  var timestamp: js.Date
}

object DisputeStatusHistory {
  @scala.inline
  def apply(disbursementDate: js.Date, effectiveDate: js.Date, status: DisputeStatus, timestamp: js.Date): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], effectiveDate = effectiveDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisputeStatusHistory]
  }
}

