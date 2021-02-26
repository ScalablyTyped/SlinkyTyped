package typingsSlinky.paypalPayoutsSdk.mod

import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.BALANCE
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.CANCELED
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.DENIED
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.PROCESSING
import typingsSlinky.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutBatchHeader extends PayoutHeader {
  
  var amount: js.UndefOr[Currency] = js.native
  
  var fees: js.UndefOr[Currency] = js.native
  
  var funding_source: js.UndefOr[BALANCE] = js.native
  
  var time_closed: js.UndefOr[String] = js.native
  
  var time_completed: js.UndefOr[String] = js.native
}
object PayoutBatchHeader {
  
  @scala.inline
  def apply(
    batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS,
    payout_batch_id: String,
    sender_batch_header: PayoutSenderBatchHeader
  ): PayoutBatchHeader = {
    val __obj = js.Dynamic.literal(batch_status = batch_status.asInstanceOf[js.Any], payout_batch_id = payout_batch_id.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutBatchHeader]
  }
  
  @scala.inline
  implicit class PayoutBatchHeaderMutableBuilder[Self <: PayoutBatchHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setFees(value: Currency): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    @scala.inline
    def setFunding_source(value: BALANCE): Self = StObject.set(x, "funding_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding_sourceUndefined: Self = StObject.set(x, "funding_source", js.undefined)
    
    @scala.inline
    def setTime_closed(value: String): Self = StObject.set(x, "time_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_closedUndefined: Self = StObject.set(x, "time_closed", js.undefined)
    
    @scala.inline
    def setTime_completed(value: String): Self = StObject.set(x, "time_completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_completedUndefined: Self = StObject.set(x, "time_completed", js.undefined)
  }
}
