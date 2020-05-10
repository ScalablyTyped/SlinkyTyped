package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTerms extends js.Object {
  /**
    * Visibilty of the URL in bid requests.
    */
  var brandingType: js.UndefOr[String] = js.native
  /**
    * Indicates that this ExternalDealId exists under at least two different
    * AdxInventoryDeals. Currently, the only case that the same ExternalDealId
    * will exist is programmatic cross sell case.
    */
  var crossListedExternalDealIdType: js.UndefOr[String] = js.native
  /**
    * Description for the proposed terms of the deal.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Non-binding estimate of the estimated gross spend for this deal Can be
    * set by buyer or seller.
    */
  var estimatedGrossSpend: js.UndefOr[SchemaPrice] = js.native
  /**
    * Non-binding estimate of the impressions served per day Can be set by
    * buyer or seller.
    */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  /**
    * The terms for guaranteed fixed price deals.
    */
  var guaranteedFixedPriceTerms: js.UndefOr[SchemaDealTermsGuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for non-guaranteed auction deals.
    */
  var nonGuaranteedAuctionTerms: js.UndefOr[SchemaDealTermsNonGuaranteedAuctionTerms] = js.native
  /**
    * The terms for non-guaranteed fixed price deals.
    */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[SchemaDealTermsNonGuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for rubicon non-guaranteed deals.
    */
  var rubiconNonGuaranteedTerms: js.UndefOr[SchemaDealTermsRubiconNonGuaranteedTerms] = js.native
  /**
    * For deals with Cost Per Day billing, defines the timezone used to mark
    * the boundaries of a day (buyer-readonly)
    */
  var sellerTimeZone: js.UndefOr[String] = js.native
}

object SchemaDealTerms {
  @scala.inline
  def apply(): SchemaDealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTerms]
  }
  @scala.inline
  implicit class SchemaDealTermsOps[Self <: SchemaDealTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrandingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingType")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossListedExternalDealIdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossListedExternalDealIdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossListedExternalDealIdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossListedExternalDealIdType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedGrossSpend(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedGrossSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedGrossSpend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedGrossSpend")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedImpressionsPerDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedImpressionsPerDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedImpressionsPerDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedImpressionsPerDay")(js.undefined)
        ret
    }
    @scala.inline
    def withGuaranteedFixedPriceTerms(value: SchemaDealTermsGuaranteedFixedPriceTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedFixedPriceTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuaranteedFixedPriceTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedFixedPriceTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withNonGuaranteedAuctionTerms(value: SchemaDealTermsNonGuaranteedAuctionTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonGuaranteedAuctionTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonGuaranteedAuctionTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonGuaranteedAuctionTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withNonGuaranteedFixedPriceTerms(value: SchemaDealTermsNonGuaranteedFixedPriceTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonGuaranteedFixedPriceTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonGuaranteedFixedPriceTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonGuaranteedFixedPriceTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withRubiconNonGuaranteedTerms(value: SchemaDealTermsRubiconNonGuaranteedTerms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rubiconNonGuaranteedTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRubiconNonGuaranteedTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rubiconNonGuaranteedTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerTimeZone")(js.undefined)
        ret
    }
  }
  
}

