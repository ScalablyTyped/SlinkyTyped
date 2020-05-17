package typingsSlinky.gapiClientGames.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsAbove extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The collection of scores you're requesting. */
  var collection: String = js.native
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[String] = js.native
  /** The ID of the leaderboard. */
  var leaderboardId: String = js.native
  /**
    * The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than
    * the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer
    * may be returned if the player is at the top. Must be less than or equal to maxResults.
    */
  var resultsAbove: js.UndefOr[Double] = js.native
  /** True if the top scores should be returned when the player is not in the leaderboard. Defaults to true. */
  var returnTopIfAbsent: js.UndefOr[Boolean] = js.native
  /** The time span for the scores and ranks you're requesting. */
  var timeSpan: String = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object ResultsAbove {
  @scala.inline
  def apply(collection: String, leaderboardId: String, timeSpan: String): ResultsAbove = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], leaderboardId = leaderboardId.asInstanceOf[js.Any], timeSpan = timeSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsAbove]
  }
  @scala.inline
  implicit class ResultsAboveOps[Self <: ResultsAbove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaderboardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSpan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSpan")(value.asInstanceOf[js.Any])
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
    def withConsistencyToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistencyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistencyToken")(js.undefined)
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
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
    def withResultsAbove(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsAbove")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnTopIfAbsent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTopIfAbsent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnTopIfAbsent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTopIfAbsent")(js.undefined)
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

