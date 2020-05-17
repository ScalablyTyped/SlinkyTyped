package typingsSlinky.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertiser extends js.Object {
  var advertiser: js.UndefOr[String] = js.native
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Height] = js.native
  /** A long description of the ad. */
  var body: js.UndefOr[String] = js.native
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[String] = js.native
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[String] = js.native
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  /** A short title for the ad. */
  var headline: js.UndefOr[String] = js.native
  /** A large image. */
  var image: js.UndefOr[Height] = js.native
  /** The URLs are called when the impression is rendered. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  /** A smaller image, for the advertiser logo. */
  var logo: js.UndefOr[Height] = js.native
  /** The price of the promoted app including the currency info. */
  var price: js.UndefOr[String] = js.native
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.native
  /** The URL to the app store to purchase/download the promoted app. */
  var store: js.UndefOr[String] = js.native
  /** The URL of the XML VAST for a native ad. Note this is a separate field from resource.video_url. */
  var videoURL: js.UndefOr[String] = js.native
}

object Advertiser {
  @scala.inline
  def apply(): Advertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advertiser]
  }
  @scala.inline
  implicit class AdvertiserOps[Self <: Advertiser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAppIcon(value: Height): Self = {
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
    def withImage(value: Height): Self = {
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
    def withImpressionTrackingUrl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionTrackingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionTrackingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionTrackingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: Height): Self = {
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
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
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
    def withStore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoURL")(js.undefined)
        ret
    }
  }
  
}

