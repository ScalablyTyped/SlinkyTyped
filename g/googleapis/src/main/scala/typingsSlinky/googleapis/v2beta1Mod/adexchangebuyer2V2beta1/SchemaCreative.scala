package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A creative and its classification data.
  */
@js.native
trait SchemaCreative extends js.Object {
  /**
    * The account that this creative belongs to. Can be used to filter the
    * response of the creatives.list method.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The link to AdChoices destination page.
    */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.native
  /**
    * The name of the company being advertised in the creative.
    */
  var advertiserName: js.UndefOr[String] = js.native
  /**
    * The agency ID for this creative.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The last update timestamp of the creative via API.
    */
  var apiUpdateTime: js.UndefOr[String] = js.native
  /**
    * All attributes for the ads that may be shown from this creative. Can be
    * used to filter the response of the creatives.list method.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of destination URLs for the creative.
    */
  var clickThroughUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly Shows any corrections that were applied to this creative.
    */
  var corrections: js.UndefOr[js.Array[SchemaCorrection]] = js.native
  /**
    * The buyer-defined creative ID of this creative. Can be used to filter the
    * response of the creatives.list method.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The top-level deals status of this creative. If disapproved,
    * an entry for &#39;auctionType=DIRECT_DEALS&#39; (or &#39;ALL&#39;) in
    * serving_restrictions will also exist. Note that this may be nuanced with
    * other contextual restrictions, in which case, it may be preferable to
    * read from serving_restrictions directly. Can be used to filter the
    * response of the creatives.list method.
    */
  var dealsStatus: js.UndefOr[String] = js.native
  /**
    * The set of declared destination URLs for the creative.
    */
  var declaredClickThroughUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly Detected advertiser IDs, if any.
    */
  var detectedAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly The detected domains for this creative.
    */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly The detected languages for this creative. The order is
    * arbitrary. The codes are 2 or 5 characters and are documented at
    * https://developers.google.com/adwords/api/docs/appendix/languagecodes.
    */
  var detectedLanguages: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly Detected product categories, if any. See the
    * ad-product-categories.txt file in the technical documentation for a list
    * of IDs.
    */
  var detectedProductCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @OutputOnly Detected sensitive categories, if any. See the
    * ad-sensitive-categories.txt file in the technical documentation for a
    * list of IDs. You should use these IDs along with the
    * excluded-sensitive-category field in the bid request to filter your bids.
    */
  var detectedSensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @OutputOnly The filtering stats for this creative. Deprecated; please use
    * bidders.accounts.filterSets.filteredBids.creatives.list method instead.
    */
  var filteringStats: js.UndefOr[SchemaFilteringStats] = js.native
  /**
    * An HTML creative.
    */
  var html: js.UndefOr[SchemaHtmlContent] = js.native
  /**
    * The set of URLs to be called to record an impression.
    */
  var impressionTrackingUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * A native creative.
    */
  var native: js.UndefOr[SchemaNativeContent] = js.native
  /**
    * @OutputOnly The top-level open auction status of this creative. If
    * disapproved, an entry for &#39;auctionType = OPEN_AUCTION&#39; (or
    * &#39;ALL&#39;) in serving_restrictions will also exist. Note that this
    * may be nuanced with other contextual restrictions, in which case, it may
    * be preferable to read from serving_restrictions directly. Can be used to
    * filter the response of the creatives.list method.
    */
  var openAuctionStatus: js.UndefOr[String] = js.native
  /**
    * All restricted categories for the ads that may be shown from this
    * creative.
    */
  var restrictedCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly The granular status of this ad in specific contexts. A
    * context here relates to where something ultimately serves (for example, a
    * physical location, a platform, an HTTPS vs HTTP request, or the type of
    * auction).
    */
  var servingRestrictions: js.UndefOr[js.Array[SchemaServingRestriction]] = js.native
  /**
    * All vendor IDs for the ads that may be shown from this creative. See
    * https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for
    * possible values.
    */
  var vendorIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @OutputOnly The version of this creative.
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * A video creative.
    */
  var video: js.UndefOr[SchemaVideoContent] = js.native
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
    def withAccountId(value: String): Self = {
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
    def withApiUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThroughUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrections(value: js.Array[SchemaCorrection]): Self = {
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
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
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
    def withDeclaredClickThroughUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaredClickThroughUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaredClickThroughUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaredClickThroughUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedAdvertiserIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedAdvertiserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedAdvertiserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedAdvertiserIds")(js.undefined)
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
    def withDetectedLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedProductCategories(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedProductCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedProductCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedProductCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedSensitiveCategories(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedSensitiveCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedSensitiveCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedSensitiveCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringStats(value: SchemaFilteringStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringStats")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: SchemaHtmlContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionTrackingUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionTrackingUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionTrackingUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionTrackingUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withNative(value: SchemaNativeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(js.undefined)
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
    def withRestrictedCategories(value: js.Array[String]): Self = {
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
    def withServingRestrictions(value: js.Array[SchemaServingRestriction]): Self = {
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
    def withVendorIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorIds")(js.undefined)
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
    def withVideo(value: SchemaVideoContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

