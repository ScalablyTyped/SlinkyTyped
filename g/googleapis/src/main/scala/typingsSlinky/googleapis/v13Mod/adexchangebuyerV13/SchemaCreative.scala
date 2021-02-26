package typingsSlinky.googleapis.v13Mod.adexchangebuyerV13

import typingsSlinky.googleapis.anon.Advertiser
import typingsSlinky.googleapis.anon.Date
import typingsSlinky.googleapis.anon.Details
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A creative and its classification data.
  */
@js.native
trait SchemaCreative extends StObject {
  
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
  var corrections: js.UndefOr[js.Array[Details]] = js.native
  
  /**
    * The reasons for disapproval, if any. Note that not all disapproval
    * reasons may be categorized, so it is possible for the creative to have a
    * status of DISAPPROVED with an empty list for disapproval_reasons. In this
    * case, please reach out to your TAM to help debug the issue. Read-only.
    * This field should not be set in requests.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.native
  
  /**
    * The filtering reasons for the creative. Read-only. This field should not
    * be set in requests.
    */
  var filteringReasons: js.UndefOr[Date] = js.native
  
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
  var nativeAd: js.UndefOr[Advertiser] = js.native
  
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
  implicit class SchemaCreativeMutableBuilder[Self <: SchemaCreative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: js.Array[String]): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdVarargs(value: String*): Self = StObject.set(x, "advertiserId", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    @scala.inline
    def setApiUploadTimestamp(value: String): Self = StObject.set(x, "apiUploadTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUploadTimestampUndefined: Self = StObject.set(x, "apiUploadTimestamp", js.undefined)
    
    @scala.inline
    def setAttribute(value: js.Array[Double]): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setAttributeVarargs(value: Double*): Self = StObject.set(x, "attribute", js.Array(value :_*))
    
    @scala.inline
    def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    @scala.inline
    def setClickThroughUrl(value: js.Array[String]): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setClickThroughUrlVarargs(value: String*): Self = StObject.set(x, "clickThroughUrl", js.Array(value :_*))
    
    @scala.inline
    def setCorrections(value: js.Array[Details]): Self = StObject.set(x, "corrections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectionsUndefined: Self = StObject.set(x, "corrections", js.undefined)
    
    @scala.inline
    def setCorrectionsVarargs(value: Details*): Self = StObject.set(x, "corrections", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[Details]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: Details*): Self = StObject.set(x, "disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setFilteringReasons(value: Date): Self = StObject.set(x, "filteringReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringReasonsUndefined: Self = StObject.set(x, "filteringReasons", js.undefined)
    
    @scala.inline
    def setHTMLSnippet(value: String): Self = StObject.set(x, "HTMLSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLSnippetUndefined: Self = StObject.set(x, "HTMLSnippet", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrl(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionTrackingUrlUndefined: Self = StObject.set(x, "impressionTrackingUrl", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrlVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrl", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNativeAd(value: Advertiser): Self = StObject.set(x, "nativeAd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeAdUndefined: Self = StObject.set(x, "nativeAd", js.undefined)
    
    @scala.inline
    def setProductCategories(value: js.Array[Double]): Self = StObject.set(x, "productCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCategoriesUndefined: Self = StObject.set(x, "productCategories", js.undefined)
    
    @scala.inline
    def setProductCategoriesVarargs(value: Double*): Self = StObject.set(x, "productCategories", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedCategories(value: js.Array[Double]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
    
    @scala.inline
    def setRestrictedCategoriesVarargs(value: Double*): Self = StObject.set(x, "restrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setSensitiveCategories(value: js.Array[Double]): Self = StObject.set(x, "sensitiveCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveCategoriesUndefined: Self = StObject.set(x, "sensitiveCategories", js.undefined)
    
    @scala.inline
    def setSensitiveCategoriesVarargs(value: Double*): Self = StObject.set(x, "sensitiveCategories", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVendorType(value: js.Array[Double]): Self = StObject.set(x, "vendorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorTypeUndefined: Self = StObject.set(x, "vendorType", js.undefined)
    
    @scala.inline
    def setVendorTypeVarargs(value: Double*): Self = StObject.set(x, "vendorType", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVideoURL(value: String): Self = StObject.set(x, "videoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoURLUndefined: Self = StObject.set(x, "videoURL", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
