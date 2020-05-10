package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The deal terms specify the details of a Product/deal. They specify things
  * like price per buyer, the type of pricing model (e.g., fixed price,
  * auction) and expected impressions from the publisher.
  */
@js.native
trait SchemaDealTerms extends js.Object {
  /**
    * Visibility of the URL in bid requests. (default: BRANDED)
    */
  var brandingType: js.UndefOr[String] = js.native
  /**
    * Publisher provided description for the terms.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Non-binding estimate of the estimated gross spend for this deal. Can be
    * set by buyer or seller.
    */
  var estimatedGrossSpend: js.UndefOr[SchemaPrice] = js.native
  /**
    * Non-binding estimate of the impressions served per day. Can be set by
    * buyer or seller.
    */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  /**
    * The terms for guaranteed fixed price deals.
    */
  var guaranteedFixedPriceTerms: js.UndefOr[SchemaGuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for non-guaranteed auction deals.
    */
  var nonGuaranteedAuctionTerms: js.UndefOr[SchemaNonGuaranteedAuctionTerms] = js.native
  /**
    * The terms for non-guaranteed fixed price deals.
    */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[SchemaNonGuaranteedFixedPriceTerms] = js.native
  /**
    * The time zone name. For deals with Cost Per Day billing, defines the time
    * zone used to mark the boundaries of a day. It should be an IANA TZ name,
    * such as &quot;America/Los_Angeles&quot;. For more information, see
    * https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
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
    def withGuaranteedFixedPriceTerms(value: SchemaGuaranteedFixedPriceTerms): Self = {
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
    def withNonGuaranteedAuctionTerms(value: SchemaNonGuaranteedAuctionTerms): Self = {
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
    def withNonGuaranteedFixedPriceTerms(value: SchemaNonGuaranteedFixedPriceTerms): Self = {
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

