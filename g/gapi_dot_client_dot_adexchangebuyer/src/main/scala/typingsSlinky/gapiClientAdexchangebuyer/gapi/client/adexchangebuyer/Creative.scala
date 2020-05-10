package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClientAdexchangebuyer.AnonAdvertiser
import typingsSlinky.gapiClientAdexchangebuyer.AnonContexts
import typingsSlinky.gapiClientAdexchangebuyer.AnonDate
import typingsSlinky.gapiClientAdexchangebuyer.AnonDisapprovalReasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Creative extends js.Object {
  /** The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should not be set. */
  var HTMLSnippet: js.UndefOr[String] = js.native
  /** Account id. */
  var accountId: js.UndefOr[Double] = js.native
  /** The link to the Ad Preferences page. This is only supported for native ads. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.native
  /** Detected advertiser id, if any. Read-only. This field should not be set in requests. */
  var advertiserId: js.UndefOr[js.Array[String]] = js.native
  /** The name of the company being advertised in the creative. The value provided must exist in the advertisers.txt file. */
  var advertiserName: js.UndefOr[String] = js.native
  /** The agency id for this creative. */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of this field is generated, and will be ignored for
    * uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String] = js.native
  /**
    * List of buyer selectable attributes for the ads that may be shown from this snippet. Each attribute is represented by an integer as defined in
    * buyer-declarable-creative-attributes.txt.
    */
  var attribute: js.UndefOr[js.Array[Double]] = js.native
  /** A buyer-specific id identifying the creative in this ad. */
  var buyerCreativeId: js.UndefOr[String] = js.native
  /** The set of destination urls for the snippet. */
  var clickThroughUrl: js.UndefOr[js.Array[String]] = js.native
  /** Shows any corrections that were applied to this creative. Read-only. This field should not be set in requests. */
  var corrections: js.UndefOr[js.Array[AnonContexts]] = js.native
  /**
    * Top-level deals status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=DIRECT_DEALS (or ALL) in
    * servingRestrictions will also exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from
    * servingRestrictions directly.
    */
  var dealsStatus: js.UndefOr[String] = js.native
  /** Detected domains for this creative. Read-only. This field should not be set in requests. */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.native
  /** The filtering reasons for the creative. Read-only. This field should not be set in requests. */
  var filteringReasons: js.UndefOr[AnonDate] = js.native
  /** Ad height. */
  var height: js.UndefOr[Double] = js.native
  /** The set of urls to be called to record an impression. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** Detected languages for this creative. Read-only. This field should not be set in requests. */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /** If nativeAd is set, HTMLSnippet and the videoURL outside of nativeAd should not be set. (The videoURL inside nativeAd can be set.) */
  var nativeAd: js.UndefOr[AnonAdvertiser] = js.native
  /**
    * Top-level open auction status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=OPEN_AUCTION (or ALL) in
    * servingRestrictions will also exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from
    * ServingRestrictions directly.
    */
  var openAuctionStatus: js.UndefOr[String] = js.native
  /**
    * Detected product categories, if any. Each category is represented by an integer as defined in  ad-product-categories.txt. Read-only. This field should
    * not be set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * All restricted categories for the ads that may be shown from this snippet. Each category is represented by an integer as defined in the
    * ad-restricted-categories.txt.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Detected sensitive categories, if any. Each category is represented by an integer as defined in  ad-sensitive-categories.txt. Read-only. This field
    * should not be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The granular status of this ad in specific contexts. A context here relates to where something ultimately serves (for example, a physical location, a
    * platform, an HTTPS vs HTTP request, or the type of auction). Read-only. This field should not be set in requests. See the examples in the Creatives
    * guide for more details.
    */
  var servingRestrictions: js.UndefOr[js.Array[AnonDisapprovalReasons]] = js.native
  /** List of vendor types for the ads that may be shown from this snippet. Each vendor type is represented by an integer as defined in vendors.txt. */
  var vendorType: js.UndefOr[js.Array[Double]] = js.native
  /** The version for this creative. Read-only. This field should not be set in requests. */
  var version: js.UndefOr[Double] = js.native
  /** The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should not be set. Note, this is different from resource.native_ad.video_url above. */
  var videoURL: js.UndefOr[String] = js.native
  /** Ad width. */
  var width: js.UndefOr[Double] = js.native
}

object Creative {
  @scala.inline
  def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  @scala.inline
  implicit class CreativeOps[Self <: Creative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTMLSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTMLSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLSnippet")(js.undefined)
        ret
    }
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
    def withAdChoicesDestinationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adChoicesDestinationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdChoicesDestinationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adChoicesDestinationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
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
    def withAgencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(js.undefined)
        ret
    }
    @scala.inline
    def withApiUploadTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUploadTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiUploadTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUploadTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withAttribute(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerCreativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerCreativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThroughUrl(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrections(value: js.Array[AnonContexts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corrections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corrections")(js.undefined)
        ret
    }
    @scala.inline
    def withDealsStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringReasons(value: AnonDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeAd(value: AnonAdvertiser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeAd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeAd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeAd")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenAuctionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAuctionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAuctionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAuctionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCategories(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedCategories(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitiveCategories(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitiveCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withServingRestrictions(value: js.Array[AnonDisapprovalReasons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorType(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorType")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

