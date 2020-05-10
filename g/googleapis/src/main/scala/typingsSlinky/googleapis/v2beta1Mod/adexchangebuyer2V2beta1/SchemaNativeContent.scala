package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Native content for a creative.
  */
@js.native
trait SchemaNativeContent extends js.Object {
  /**
    * The name of the advertiser or sponsor, to be displayed in the ad
    * creative.
    */
  var advertiserName: js.UndefOr[String] = js.native
  /**
    * The app icon, for app download ads.
    */
  var appIcon: js.UndefOr[SchemaImage] = js.native
  /**
    * A long description of the ad.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * A label for the button that the user is supposed to click.
    */
  var callToAction: js.UndefOr[String] = js.native
  /**
    * The URL that the browser/SDK will load when the user clicks the ad.
    */
  var clickLinkUrl: js.UndefOr[String] = js.native
  /**
    * The URL to use for click tracking.
    */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  /**
    * A short title for the ad.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * A large image.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * A smaller image, for the advertiser&#39;s logo.
    */
  var logo: js.UndefOr[SchemaImage] = js.native
  /**
    * The price of the promoted app including currency info.
    */
  var priceDisplayText: js.UndefOr[String] = js.native
  /**
    * The app rating in the app store. Must be in the range [0-5].
    */
  var starRating: js.UndefOr[Double] = js.native
  /**
    * The URL to the app store to purchase/download the promoted app.
    */
  var storeUrl: js.UndefOr[String] = js.native
  /**
    * The URL to fetch a native video ad.
    */
  var videoUrl: js.UndefOr[String] = js.native
}

object SchemaNativeContent {
  @scala.inline
  def apply(): SchemaNativeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNativeContent]
  }
  @scala.inline
  implicit class SchemaNativeContentOps[Self <: SchemaNativeContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertiserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppIcon(value: SchemaImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCallToAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callToAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallToAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callToAction")(js.undefined)
        ret
    }
    @scala.inline
    def withClickLinkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickLinkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickLinkUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickLinkUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTrackingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTrackingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTrackingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTrackingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: SchemaImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceDisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceDisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starRating")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoUrl")(js.undefined)
        ret
    }
  }
  
}

