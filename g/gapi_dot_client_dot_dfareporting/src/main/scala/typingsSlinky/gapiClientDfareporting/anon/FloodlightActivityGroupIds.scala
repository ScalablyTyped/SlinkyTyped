package typingsSlinky.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityGroupIds extends js.Object {
  /**
    * Select only floodlight activities for the specified advertiser ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty
    * result.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group IDs. */
  var floodlightActivityGroupIds: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group name. */
  var floodlightActivityGroupName: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group tag string. */
  var floodlightActivityGroupTagString: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified floodlight activity group type. */
  var floodlightActivityGroupType: js.UndefOr[String] = js.native
  /**
    * Select only floodlight activities for the specified floodlight configuration ID. Must specify either ids, advertiserId, or floodlightConfigurationId
    * for a non-empty result.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified IDs. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result. */
  var ids: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** User profile ID associated with this request. */
  var profileId: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "floodlightactivity&#42;2015" will return objects with names like
    * "floodlightactivity June 2015", "floodlightactivity April 2015", or simply "floodlightactivity 2015". Most of the searches also add wildcards
    * implicitly at the start and the end of the search string. For example, a search string of "floodlightactivity" will match objects with name "my
    * floodlightactivity activity", "floodlightactivity 2015", or simply "floodlightactivity".
    */
  var searchString: js.UndefOr[String] = js.native
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.native
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.native
  /** Select only floodlight activities with the specified tag string. */
  var tagString: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object FloodlightActivityGroupIds {
  @scala.inline
  def apply(profileId: String): FloodlightActivityGroupIds = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivityGroupIds]
  }
  @scala.inline
  implicit class FloodlightActivityGroupIdsOps[Self <: FloodlightActivityGroupIds] (val x: Self) extends AnyVal {
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
    def withAdvertiserId(value: String): Self = {
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
    def withFloodlightActivityGroupIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupTagString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupTagString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupTagString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupTagString")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightActivityGroupType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightActivityGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightActivityGroupType")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(js.undefined)
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
    def withTagString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagString")(js.undefined)
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

