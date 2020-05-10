package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInAppProduct extends js.Object {
  /**
    * The default language of the localized data, as defined by BCP 47. e.g.
    * &quot;en-US&quot;, &quot;en-GB&quot;.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * Default price cannot be zero. In-app products can never be free. Default
    * price is always in the developer&#39;s Checkout merchant currency.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Grace period of the subscription, specified in ISO 8601 format. It will
    * allow developers to give their subscribers a grace period when the
    * payment for the new recurrence period is declined. Acceptable values =
    * &quot;P3D&quot; (three days) and &quot;P7D&quot; (seven days)
    */
  var gracePeriod: js.UndefOr[String] = js.native
  /**
    * List of localized title and description data.
    */
  var listings: js.UndefOr[StringDictionary[SchemaInAppProductListing]] = js.native
  /**
    * The package name of the parent app.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Prices per buyer region. None of these prices should be zero. In-app
    * products can never be free.
    */
  var prices: js.UndefOr[StringDictionary[SchemaPrice]] = js.native
  /**
    * Purchase type enum value. Unmodifiable after creation.
    */
  var purchaseType: js.UndefOr[String] = js.native
  /**
    * Definition of a season for a seasonal subscription. Can be defined only
    * for yearly subscriptions.
    */
  var season: js.UndefOr[SchemaSeason] = js.native
  /**
    * The stock-keeping-unit (SKU) of the product, unique within an app.
    */
  var sku: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  /**
    * Subscription period, specified in ISO 8601 format. Acceptable values are
    * &quot;P1W&quot; (one week), &quot;P1M&quot; (one month), &quot;P3M&quot;
    * (three months), &quot;P6M&quot; (six months), and &quot;P1Y&quot; (one
    * year).
    */
  var subscriptionPeriod: js.UndefOr[String] = js.native
  /**
    * Trial period, specified in ISO 8601 format. Acceptable values are
    * anything between &quot;P7D&quot; (seven days) and &quot;P999D&quot; (999
    * days). Seasonal subscriptions cannot have a trial period.
    */
  var trialPeriod: js.UndefOr[String] = js.native
}

object SchemaInAppProduct {
  @scala.inline
  def apply(): SchemaInAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppProduct]
  }
  @scala.inline
  implicit class SchemaInAppProductOps[Self <: SchemaInAppProduct] (val x: Self) extends AnyVal {
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
    def withDefaultPrice(value: SchemaPrice): Self = {
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
    def withGracePeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGracePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withListings(value: StringDictionary[SchemaInAppProductListing]): Self = {
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
    def withPrices(value: StringDictionary[SchemaPrice]): Self = {
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
    def withSeason(value: SchemaSeason): Self = {
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

