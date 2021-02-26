package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingCharge extends StObject {
  
  /**
    * Reserved: TBD
    */
  var allowedQuantity: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var blocked: js.UndefOr[String] = js.native
  
  /**
    * Provides information on what services the charge item is for.
    *
    * The following table provides a description of the different chargeName values available at this time.
    *
    * | chargeName | Description |
    * | --- | --- |
    * | id_check | ID Check Charge |
    * | in_person_signing | In Person Signing charge |
    * | envelopes Included | Sent Envelopes for the account |
    * | age_verify | Age verification check |
    * | ofac | OFAC Check |
    * | id_confirm | ID confirmation check |
    * | student_authentication | STAN PIN authentication check |
    * | wet_sign_fax | Pages for returning signed documents by fax |
    * | attachment_fax | Pages for returning attachments by fax |
    * | phone_authentication | Phone authentication charge |
    * | powerforms | PowerForm envelopes sent |
    * | signer_payments | Payment processing charge |
    * | outbound_fax | Send by fax charge |
    * | bulk_recipient_envelopes | Bulk Recipient Envelopes sent |
    * | sms_authentications | SMS authentication charge |
    * | saml_authentications | SAML authentication charge |
    * | express_signer_certificate | DocuSign Express Certificate charge |
    * | personal_signer_certificate | Personal Signer Certificate charge |
    * | safe_certificate | SAFE BioPharma Signer Certificate charge |
    * | seats | Included active seats charge |
    * | open_trust_certificate | OpenTrust Signer Certificate charge |
    */
  var chargeName: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var chargeType: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var chargeUnitOfMeasure: js.UndefOr[String] = js.native
  
  var discounts: js.UndefOr[js.Array[BillingDiscount]] = js.native
  
  var firstEffectiveDate: js.UndefOr[String] = js.native
  
  var includedQuantity: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var incrementalQuantity: js.UndefOr[String] = js.native
  
  var lastEffectiveDate: js.UndefOr[String] = js.native
  
  var prices: js.UndefOr[js.Array[BillingPrice]] = js.native
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.native
  
  var usedQuantity: js.UndefOr[String] = js.native
}
object BillingCharge {
  
  @scala.inline
  def apply(): BillingCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingCharge]
  }
  
  @scala.inline
  implicit class BillingChargeMutableBuilder[Self <: BillingCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedQuantity(value: String): Self = StObject.set(x, "allowedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedQuantityUndefined: Self = StObject.set(x, "allowedQuantity", js.undefined)
    
    @scala.inline
    def setBlocked(value: String): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    @scala.inline
    def setChargeName(value: String): Self = StObject.set(x, "chargeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargeNameUndefined: Self = StObject.set(x, "chargeName", js.undefined)
    
    @scala.inline
    def setChargeType(value: String): Self = StObject.set(x, "chargeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargeTypeUndefined: Self = StObject.set(x, "chargeType", js.undefined)
    
    @scala.inline
    def setChargeUnitOfMeasure(value: String): Self = StObject.set(x, "chargeUnitOfMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargeUnitOfMeasureUndefined: Self = StObject.set(x, "chargeUnitOfMeasure", js.undefined)
    
    @scala.inline
    def setDiscounts(value: js.Array[BillingDiscount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    @scala.inline
    def setDiscountsVarargs(value: BillingDiscount*): Self = StObject.set(x, "discounts", js.Array(value :_*))
    
    @scala.inline
    def setFirstEffectiveDate(value: String): Self = StObject.set(x, "firstEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstEffectiveDateUndefined: Self = StObject.set(x, "firstEffectiveDate", js.undefined)
    
    @scala.inline
    def setIncludedQuantity(value: String): Self = StObject.set(x, "includedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedQuantityUndefined: Self = StObject.set(x, "includedQuantity", js.undefined)
    
    @scala.inline
    def setIncrementalQuantity(value: String): Self = StObject.set(x, "incrementalQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalQuantityUndefined: Self = StObject.set(x, "incrementalQuantity", js.undefined)
    
    @scala.inline
    def setLastEffectiveDate(value: String): Self = StObject.set(x, "lastEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEffectiveDateUndefined: Self = StObject.set(x, "lastEffectiveDate", js.undefined)
    
    @scala.inline
    def setPrices(value: js.Array[BillingPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    @scala.inline
    def setPricesVarargs(value: BillingPrice*): Self = StObject.set(x, "prices", js.Array(value :_*))
    
    @scala.inline
    def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    @scala.inline
    def setUsedQuantity(value: String): Self = StObject.set(x, "usedQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedQuantityUndefined: Self = StObject.set(x, "usedQuantity", js.undefined)
  }
}
