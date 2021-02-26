package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDealTermsGuaranteedFixedPriceTerms extends StObject {
  
  /**
    * External billing info for this Deal. This field is relevant when external
    * billing info such as price has a different currency code than DFP/AdX.
    */
  var billingInfo: js.UndefOr[SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo] = js.native
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
  
  /**
    * Guaranteed impressions as a percentage. This is the percentage of
    * guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String] = js.native
  
  /**
    * Count of guaranteed looks. Required for deal, optional for product. For
    * CPD deals, buyer changes to guaranteed_looks will be ignored.
    */
  var guaranteedLooks: js.UndefOr[String] = js.native
  
  /**
    * Count of minimum daily looks for a CPD deal. For CPD deals, buyer should
    * negotiate on this field instead of guaranteed_looks.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}
object SchemaDealTermsGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): SchemaDealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class SchemaDealTermsGuaranteedFixedPriceTermsMutableBuilder[Self <: SchemaDealTermsGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingInfo(value: SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo): Self = StObject.set(x, "billingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingInfoUndefined: Self = StObject.set(x, "billingInfo", js.undefined)
    
    @scala.inline
    def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPricesUndefined: Self = StObject.set(x, "fixedPrices", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "fixedPrices", js.Array(value :_*))
    
    @scala.inline
    def setGuaranteedImpressions(value: String): Self = StObject.set(x, "guaranteedImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuaranteedImpressionsUndefined: Self = StObject.set(x, "guaranteedImpressions", js.undefined)
    
    @scala.inline
    def setGuaranteedLooks(value: String): Self = StObject.set(x, "guaranteedLooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuaranteedLooksUndefined: Self = StObject.set(x, "guaranteedLooks", js.undefined)
    
    @scala.inline
    def setMinimumDailyLooks(value: String): Self = StObject.set(x, "minimumDailyLooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDailyLooksUndefined: Self = StObject.set(x, "minimumDailyLooks", js.undefined)
  }
}
