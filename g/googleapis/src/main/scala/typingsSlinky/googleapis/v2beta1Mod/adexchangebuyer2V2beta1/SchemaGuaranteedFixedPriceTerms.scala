package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Programmatic Guaranteed Deals.
  */
@js.native
trait SchemaGuaranteedFixedPriceTerms extends js.Object {
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
    * Count of guaranteed looks. Required for deal, optional for product.
    */
  var guaranteedLooks: js.UndefOr[String] = js.native
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}

object SchemaGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(): SchemaGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuaranteedFixedPriceTerms]
  }
  @scala.inline
  implicit class SchemaGuaranteedFixedPriceTermsOps[Self <: SchemaGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPrices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPrices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPrices")(js.undefined)
        ret
    }
    @scala.inline
    def withGuaranteedImpressions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuaranteedImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withGuaranteedLooks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedLooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuaranteedLooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedLooks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumDailyLooks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDailyLooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumDailyLooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDailyLooks")(js.undefined)
        ret
    }
  }
  
}

