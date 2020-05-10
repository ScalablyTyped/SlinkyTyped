package typingsSlinky.reactNativeGoogleAnalyticsBridge.analyticsMod

import typingsSlinky.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByField
import typingsSlinky.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsByIndex
import typingsSlinky.reactNativeGoogleAnalyticsBridge.customMod.CustomMetrics
import typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.Product
import typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitPayload extends js.Object {
  var customDimensions: js.UndefOr[CustomDimensionsByIndex | CustomDimensionsByField] = js.native
  var customMetrics: js.UndefOr[CustomMetrics] = js.native
  var impressionList: js.UndefOr[String] = js.native
  var impressionProducts: js.UndefOr[js.Array[Product]] = js.native
  var impressionSource: js.UndefOr[String] = js.native
  var productAction: js.UndefOr[ProductAction] = js.native
  var products: js.UndefOr[js.Array[Product]] = js.native
  var session: js.UndefOr[SessionState] = js.native
  var utmCampaignUrl: js.UndefOr[String] = js.native
}

object HitPayload {
  @scala.inline
  def apply(): HitPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitPayload]
  }
  @scala.inline
  implicit class HitPayloadOps[Self <: HitPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomDimensions(value: CustomDimensionsByIndex | CustomDimensionsByField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMetrics(value: CustomMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionList")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionProducts(value: js.Array[Product]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionProducts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionProducts")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionSource")(js.undefined)
        ret
    }
    @scala.inline
    def withProductAction(value: ProductAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAction")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts(value: js.Array[Product]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: SessionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmCampaignUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmCampaignUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmCampaignUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmCampaignUrl")(js.undefined)
        ret
    }
  }
  
}

