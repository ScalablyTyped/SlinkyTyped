package typingsSlinky.googleapis.v32Mod.dfareportingV32

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChangelogsList extends StandardParameters {
  /**
    * Select only change logs with the specified action.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only change logs with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only change logs whose change time is before the specified
    * maxChangeTime.The time should be formatted as an RFC3339 date/time
    * string. For example, for 10:54 PM on July 18th, 2015, in the America/New
    * York time zone, the format is "2015-07-18T22:54:00-04:00". In other
    * words, the year, month, day, the letter T, the hour (24-hour clock
    * system), minute, second, and then the time zone offset.
    */
  var maxChangeTime: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only change logs whose change time is before the specified
    * minChangeTime.The time should be formatted as an RFC3339 date/time
    * string. For example, for 10:54 PM on July 18th, 2015, in the America/New
    * York time zone, the format is "2015-07-18T22:54:00-04:00". In other
    * words, the year, month, day, the letter T, the hour (24-hour clock
    * system), minute, second, and then the time zone offset.
    */
  var minChangeTime: js.UndefOr[String] = js.native
  /**
    * Select only change logs with these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only change logs with the specified object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Select only change logs whose object ID, user name, old or new values
    * match the search string.
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only change logs with these user profile IDs.
    */
  var userProfileIds: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceChangelogsList {
  @scala.inline
  def apply(): ParamsResourceChangelogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangelogsList]
  }
  @scala.inline
  implicit class ParamsResourceChangelogsListOps[Self <: ParamsResourceChangelogsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
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
    def withMaxChangeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChangeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChangeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChangeTime")(js.undefined)
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
    def withMinChangeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChangeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChangeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChangeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
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
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
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
    def withUserProfileIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileIds")(js.undefined)
        ret
    }
  }
  
}

