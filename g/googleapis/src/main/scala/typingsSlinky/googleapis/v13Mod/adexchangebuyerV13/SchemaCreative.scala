package typingsSlinky.googleapis.v13Mod.adexchangebuyerV13

import typingsSlinky.googleapis.AnonAdvertiser
import typingsSlinky.googleapis.AnonDate
import typingsSlinky.googleapis.AnonDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A creative and its classification data.
  */
@js.native
trait SchemaCreative extends js.Object {
  /**
    * The HTML snippet that displays the ad when inserted in the web page. If
    * set, videoURL should not be set.
    */
  var HTMLSnippet: js.UndefOr[String] = js.native
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  /**
    * Detected advertiser id, if any. Read-only. This field should not be set
    * in requests.
    */
  var advertiserId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the company being advertised in the creative.
    */
  var advertiserName: js.UndefOr[String] = js.native
  /**
    * The agency id for this creative.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * The last upload timestamp of this creative if it was uploaded via API.
    * Read-only. The value of this field is generated, and will be ignored for
    * uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String] = js.native
  /**
    * All attributes for the ads that may be shown from this snippet.
    */
  var attribute: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A buyer-specific id identifying the creative in this ad.
    */
  var buyerCreativeId: js.UndefOr[String] = js.native
  /**
    * The set of destination urls for the snippet.
    */
  var clickThroughUrl: js.UndefOr[js.Array[String]] = js.native
  /**
    * Shows any corrections that were applied to this creative. Read-only. This
    * field should not be set in requests.
    */
  var corrections: js.UndefOr[js.Array[AnonDetails]] = js.native
  /**
    * The reasons for disapproval, if any. Note that not all disapproval
    * reasons may be categorized, so it is possible for the creative to have a
    * status of DISAPPROVED with an empty list for disapproval_reasons. In this
    * case, please reach out to your TAM to help debug the issue. Read-only.
    * This field should not be set in requests.
    */
  var disapprovalReasons: js.UndefOr[js.Array[AnonDetails]] = js.native
  /**
    * The filtering reasons for the creative. Read-only. This field should not
    * be set in requests.
    */
  var filteringReasons: js.UndefOr[AnonDate] = js.native
  /**
    * Ad height.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The set of urls to be called to record an impression.
    */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If nativeAd is set, HTMLSnippet and videoURL should not be set.
    */
  var nativeAd: js.UndefOr[AnonAdvertiser] = js.native
  /**
    * Detected product categories, if any. Read-only. This field should not be
    * set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * All restricted categories for the ads that may be shown from this
    * snippet.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Detected sensitive categories, if any. Read-only. This field should not
    * be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Creative serving status. Read-only. This field should not be set in
    * requests.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * All vendor types for the ads that may be shown from this snippet.
    */
  var vendorType: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The version for this creative. Read-only. This field should not be set in
    * requests.
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should
    * not be set.
    */
  var videoURL: js.UndefOr[String] = js.native
  /**
    * Ad width.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaCreative {
  @scala.inline
  def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  @scala.inline
  implicit class SchemaCreativeOps[Self <: SchemaCreative] (val x: Self) extends AnyVal {
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
    def withCorrections(value: js.Array[AnonDetails]): Self = {
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
    def withDisapprovalReasons(value: js.Array[AnonDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapprovalReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisapprovalReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapprovalReasons")(js.undefined)
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

