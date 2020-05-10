package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppProduct extends js.Object {
  /** The default language of the localized data, as defined by BCP 47. e.g. "en-US", "en-GB". */
  var defaultLanguage: js.UndefOr[String] = js.native
  /** Default price cannot be zero. In-app products can never be free. Default price is always in the developer's Checkout merchant currency. */
  var defaultPrice: js.UndefOr[Price] = js.native
  /** List of localized title and description data. */
  var listings: js.UndefOr[Record[String, InAppProductListing]] = js.native
  /** The package name of the parent app. */
  var packageName: js.UndefOr[String] = js.native
  /** Prices per buyer region. None of these prices should be zero. In-app products can never be free. */
  var prices: js.UndefOr[Record[String, Price]] = js.native
  /** Purchase type enum value. Unmodifiable after creation. */
  var purchaseType: js.UndefOr[String] = js.native
  /** Definition of a season for a seasonal subscription. Can be defined only for yearly subscriptions. */
  var season: js.UndefOr[Season] = js.native
  /** The stock-keeping-unit (SKU) of the product, unique within an app. */
  var sku: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are "P1W" (one week), "P1M" (one month), "P3M" (three months), "P6M" (six months),
    * and "P1Y" (one year).
    */
  var subscriptionPeriod: js.UndefOr[String] = js.native
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are anything between "P7D" (seven days) and "P999D" (999 days). Seasonal subscriptions
    * cannot have a trial period.
    */
  var trialPeriod: js.UndefOr[String] = js.native
}

object InAppProduct {
  @scala.inline
  def apply(): InAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppProduct]
  }
  @scala.inline
  implicit class InAppProductOps[Self <: InAppProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPrice(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withListings(value: Record[String, InAppProductListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listings")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrices(value: Record[String, Price]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseType")(js.undefined)
        ret
    }
    @scala.inline
    def withSeason(value: Season): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(js.undefined)
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialPeriod")(js.undefined)
        ret
    }
  }
  
}

