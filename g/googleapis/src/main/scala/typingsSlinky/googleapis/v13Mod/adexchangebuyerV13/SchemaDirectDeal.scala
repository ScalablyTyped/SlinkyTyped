package typingsSlinky.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange direct deal.
  */
@js.native
trait SchemaDirectDeal extends js.Object {
  /**
    * The account id of the buyer this deal is for.
    */
  var accountId: js.UndefOr[Double] = js.native
  /**
    * The name of the advertiser this deal is for.
    */
  var advertiser: js.UndefOr[String] = js.native
  /**
    * Whether the publisher for this deal is eligible for alcohol ads.
    */
  var allowsAlcohol: js.UndefOr[Boolean] = js.native
  /**
    * The account id that this deal was negotiated for. It is either the buyer
    * or the client that this deal was negotiated on behalf of.
    */
  var buyerAccountId: js.UndefOr[String] = js.native
  /**
    * The currency code that applies to the fixed_cpm value. If not set then
    * assumed to be USD.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * The deal type such as programmatic reservation or fixed price and so on.
    */
  var dealTier: js.UndefOr[String] = js.native
  /**
    * End time for when this deal stops being active. If not set then this deal
    * is valid until manually disabled by the publisher. In seconds since the
    * epoch.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The fixed price for this direct deal. In cpm micros of currency according
    * to currency_code. If set, then this deal is eligible for the fixed price
    * tier of buying (highest priority, pay exactly the configured fixed
    * price).
    */
  var fixedCpm: js.UndefOr[String] = js.native
  /**
    * Deal id.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Deal name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The minimum price for this direct deal. In cpm micros of currency
    * according to currency_code. If set, then this deal is eligible for the
    * private exchange tier of buying (below fixed price priority, run as a
    * second price auction).
    */
  var privateExchangeMinCpm: js.UndefOr[String] = js.native
  /**
    * If true, the publisher has opted to have their blocks ignored when a
    * creative is bid with for this deal.
    */
  var publisherBlocksOverriden: js.UndefOr[Boolean] = js.native
  /**
    * The name of the publisher offering this direct deal.
    */
  var sellerNetwork: js.UndefOr[String] = js.native
  /**
    * Start time for when this deal becomes active. If not set then this deal
    * is active immediately upon creation. In seconds since the epoch.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaDirectDeal {
  @scala.inline
  def apply(): SchemaDirectDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDeal]
  }
  @scala.inline
  implicit class SchemaDirectDealOps[Self <: SchemaDirectDeal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiser")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowsAlcohol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsAlcohol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsAlcohol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsAlcohol")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDealTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealTier")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedCpm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedCpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedCpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedCpm")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateExchangeMinCpm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateExchangeMinCpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateExchangeMinCpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateExchangeMinCpm")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisherBlocksOverriden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherBlocksOverriden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherBlocksOverriden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherBlocksOverriden")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

