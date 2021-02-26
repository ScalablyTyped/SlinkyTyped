package typingsSlinky.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSavingsPlanRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than three digits after the decimal point.
    */
  var commitment: Amount = js.native
  
  /**
    * The time at which to purchase the Savings Plan, in UTC format (YYYY-MM-DDTHH:MM:SSZ).
    */
  var purchaseTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ID of the offering.
    */
  var savingsPlanOfferingId: SavingsPlanOfferingId = js.native
  
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the Savings Plan. This parameter is supported only if the payment option is Partial Upfront.
    */
  var upfrontPaymentAmount: js.UndefOr[Amount] = js.native
}
object CreateSavingsPlanRequest {
  
  @scala.inline
  def apply(commitment: Amount, savingsPlanOfferingId: SavingsPlanOfferingId): CreateSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], savingsPlanOfferingId = savingsPlanOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSavingsPlanRequest]
  }
  
  @scala.inline
  implicit class CreateSavingsPlanRequestMutableBuilder[Self <: CreateSavingsPlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setCommitment(value: Amount): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTime(value: js.Date): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTimeUndefined: Self = StObject.set(x, "purchaseTime", js.undefined)
    
    @scala.inline
    def setSavingsPlanOfferingId(value: SavingsPlanOfferingId): Self = StObject.set(x, "savingsPlanOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUpfrontPaymentAmount(value: Amount): Self = StObject.set(x, "upfrontPaymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpfrontPaymentAmountUndefined: Self = StObject.set(x, "upfrontPaymentAmount", js.undefined)
  }
}
