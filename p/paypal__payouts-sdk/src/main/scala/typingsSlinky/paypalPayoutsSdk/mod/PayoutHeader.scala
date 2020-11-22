package typingsSlinky.paypalPayoutsSdk.mod

import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.CANCELED
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.DENIED
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PROCESSING
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutHeader extends js.Object {
  
  var batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS = js.native
  
  var errors: js.UndefOr[js.Any] = js.native
  
  var payout_batch_id: String = js.native
  
  var sender_batch_header: PayoutSenderBatchHeader = js.native
  
  var time_created: js.UndefOr[String] = js.native
}
object PayoutHeader {
  
  @scala.inline
  def apply(
    batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS,
    payout_batch_id: String,
    sender_batch_header: PayoutSenderBatchHeader
  ): PayoutHeader = {
    val __obj = js.Dynamic.literal(batch_status = batch_status.asInstanceOf[js.Any], payout_batch_id = payout_batch_id.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutHeader]
  }
  
  @scala.inline
  implicit class PayoutHeaderOps[Self <: PayoutHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatch_status(value: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS): Self = this.set("batch_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayout_batch_id(value: String): Self = this.set("payout_batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_batch_header(value: PayoutSenderBatchHeader): Self = this.set("sender_batch_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setTime_created(value: String): Self = this.set("time_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_created: Self = this.set("time_created", js.undefined)
  }
}
