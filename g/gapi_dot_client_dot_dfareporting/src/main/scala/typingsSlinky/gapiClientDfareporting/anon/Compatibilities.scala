package typingsSlinky.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compatibilities extends js.Object {
  /** Select only placements that belong to these advertisers. */
  var advertiserIds: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Select only archived placements. Don't set this field to select both archived and non-archived placements. */
  var archived: js.UndefOr[Boolean] = js.native
  /** Select only placements that belong to these campaigns. */
  var campaignIds: js.UndefOr[String] = js.native
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on
    * mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to
    * rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibilities: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Select only placements that belong to these placement groups. */
  var groupIds: js.UndefOr[String] = js.native
  /** Select only placements with these IDs. */
  var ids: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[String] = js.native
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[String] = js.native
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[String] = js.native
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  /** Select only placements with this payment source. */
  var paymentSource: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Select only placements with these pricing types. */
  var pricingTypes: js.UndefOr[String] = js.native
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Allows searching for placements by name or ID. Wildcards (&#42;) are allowed. For example, "placement&#42;2015" will return placements with names like
    * "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end
    * of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply
    * "placement".
    */
  var searchString: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these sites. */
  var siteIds: js.UndefOr[String] = js.native
  /** Select only placements that are associated with these sizes. */
  var sizeIds: js.UndefOr[String] = js.native
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Compatibilities {
  @scala.inline
  def apply(profileId: String): Compatibilities = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compatibilities]
  }
  @scala.inline
  implicit class CompatibilitiesOps[Self <: Compatibilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertiserIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatibilities(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilities")(js.undefined)
        ret
    }
    @scala.inline
    def withContentCategoryIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCategoryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentCategoryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCategoryIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectorySiteIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectorySiteIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directorySiteIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementStrategyIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategyIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementStrategyIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategyIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
  }
  
}

