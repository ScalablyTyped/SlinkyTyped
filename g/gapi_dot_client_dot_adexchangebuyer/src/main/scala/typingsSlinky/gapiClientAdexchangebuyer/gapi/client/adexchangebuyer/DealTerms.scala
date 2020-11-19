package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTerms extends js.Object {
  
  /** Visibilty of the URL in bid requests. */
  var brandingType: js.UndefOr[String] = js.native
  
  /**
    * Indicates that this ExternalDealId exists under at least two different AdxInventoryDeals. Currently, the only case that the same ExternalDealId will
    * exist is programmatic cross sell case.
    */
  var crossListedExternalDealIdType: js.UndefOr[String] = js.native
  
  /** Description for the proposed terms of the deal. */
  var description: js.UndefOr[String] = js.native
  
  /** Non-binding estimate of the estimated gross spend for this deal Can be set by buyer or seller. */
  var estimatedGrossSpend: js.UndefOr[Price] = js.native
  
  /** Non-binding estimate of the impressions served per day Can be set by buyer or seller. */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  
  /** The terms for guaranteed fixed price deals. */
  var guaranteedFixedPriceTerms: js.UndefOr[DealTermsGuaranteedFixedPriceTerms] = js.native
  
  /** The terms for non-guaranteed auction deals. */
  var nonGuaranteedAuctionTerms: js.UndefOr[DealTermsNonGuaranteedAuctionTerms] = js.native
  
  /** The terms for non-guaranteed fixed price deals. */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[DealTermsNonGuaranteedFixedPriceTerms] = js.native
  
  /** The terms for rubicon non-guaranteed deals. */
  var rubiconNonGuaranteedTerms: js.UndefOr[DealTermsRubiconNonGuaranteedTerms] = js.native
  
  /** For deals with Cost Per Day billing, defines the timezone used to mark the boundaries of a day (buyer-readonly) */
  var sellerTimeZone: js.UndefOr[String] = js.native
}
object DealTerms {
  
  @scala.inline
  def apply(): DealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTerms]
  }
  
  @scala.inline
  implicit class DealTermsOps[Self <: DealTerms] (val x: Self) extends AnyVal {
    
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
    def setBrandingType(value: String): Self = this.set("brandingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandingType: Self = this.set("brandingType", js.undefined)
    
    @scala.inline
    def setCrossListedExternalDealIdType(value: String): Self = this.set("crossListedExternalDealIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossListedExternalDealIdType: Self = this.set("crossListedExternalDealIdType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEstimatedGrossSpend(value: Price): Self = this.set("estimatedGrossSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedGrossSpend: Self = this.set("estimatedGrossSpend", js.undefined)
    
    @scala.inline
    def setEstimatedImpressionsPerDay(value: String): Self = this.set("estimatedImpressionsPerDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedImpressionsPerDay: Self = this.set("estimatedImpressionsPerDay", js.undefined)
    
    @scala.inline
    def setGuaranteedFixedPriceTerms(value: DealTermsGuaranteedFixedPriceTerms): Self = this.set("guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuaranteedFixedPriceTerms: Self = this.set("guaranteedFixedPriceTerms", js.undefined)
    
    @scala.inline
    def setNonGuaranteedAuctionTerms(value: DealTermsNonGuaranteedAuctionTerms): Self = this.set("nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonGuaranteedAuctionTerms: Self = this.set("nonGuaranteedAuctionTerms", js.undefined)
    
    @scala.inline
    def setNonGuaranteedFixedPriceTerms(value: DealTermsNonGuaranteedFixedPriceTerms): Self = this.set("nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonGuaranteedFixedPriceTerms: Self = this.set("nonGuaranteedFixedPriceTerms", js.undefined)
    
    @scala.inline
    def setRubiconNonGuaranteedTerms(value: DealTermsRubiconNonGuaranteedTerms): Self = this.set("rubiconNonGuaranteedTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRubiconNonGuaranteedTerms: Self = this.set("rubiconNonGuaranteedTerms", js.undefined)
    
    @scala.inline
    def setSellerTimeZone(value: String): Self = this.set("sellerTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerTimeZone: Self = this.set("sellerTimeZone", js.undefined)
  }
}
